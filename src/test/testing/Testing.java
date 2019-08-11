package test.testing;

import main.model.pos.*;
import main.model.system.Login;
import main.model.system.Password;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testing {

    CarriedItems items;
    Transaction transaction;
    Login user;


    @BeforeEach

    public void before() {
        items = new CarriedItems();
        transaction = new Transaction();
        user = new Login("Bob", "ducks", 2);
    }

    @Test

    public void testOne() {
        Password duck = new Password();
        duck.setPass("12345");
        System.out.println(duck.passwordCheck("12345"));
        System.out.println(!duck.passwordCheck("54321"));
        duck.setPass("54321");
        System.out.println(!duck.passwordCheck("12345"));
        System.out.println(duck.passwordCheck("54321"));
    }

//    @Test
//    public void another () throws IOException {
//        ListOfUsers x = new ListOfUsers();
//        x.addUserDef("Bob", "ducks");
//        x.save();
//        x = new ListOfUsers();
//        x.writeFn();
//        assert x.logins.size() == 1;
//        x.addUserDef("Bob", "ducks");
//        System.out.println (x.logins);
//        x.save();
//        x = new ListOfUsers();
//        x.writeFn();
//        assert x.logins.size() == 2;
//
//
//        Save name = new ListOfUsers();
//    }


    @Test
    public void testItems() {
        boolean x = false;
        Produce one = new Produce();
        one.addQuantity(5.4);
        assert one.getQuantity() == 5.4;
        CarriedItems z = new CarriedItems();
        try {
            z.addItem("057700013144");
        } catch (Exception e) {
            e.printStackTrace();
        }

        UPc two = new UPc();
        try {
            two.newItem("000000000000");
        } catch (ProductNotFound e) {
            x = true;
            System.out.println("error");
        }
        assert !x;
    }



    @Test

    public void testAddFindItem() {
        Item a = items.addItem("4011");
        assert a.getDescription().equals("Bananas Yellow ");
        assert items.findItem("4011").equals(a);
    }

    @Test

    public void testAddGetKey() {
        items.addKey("DucksAreCool");
        items.addKey("Quack");
        assert items.getKeys().get(0).equals("DucksAreCool");
        assert items.getKeys().get(1).equals("Quack");
    }

    @Test

    public void testAddGetTotal() {
        transaction.addTotal(20);
        transaction.addTotal(1500);
        transaction.addTotal(80);
        assert transaction.getTotal() == 1600;
    }

    @Test

    public void testAttempt() {
        assert !user.attempt("cows");
        assert user.attempt("ducks");
    }

    @Test

    public void testForItem() {
        Item a = new Product();
        a.setDescription("Rubber Ducks");
        assert a.getDescription().equals("Rubber Ducks");
        a.setID("010101");
        assert a.getID().equals("010101");
        a.setQuantity(5.0);
        a.addQuantity(5.0);
        assert a.getQuantity() == 10.0;
        a.setPrice(300);
        assert a.getPrice() == 300;
    }

    @Test

    public void testPLu() {
        String a;
        String b = "";
        PLu plu = new PLu();
        try {
            a = plu.newItem("4011");
            b = plu.newItem("0000");
        } catch (ProductNotFound e) {
            a = "Product Not Found";
        }
        assert a.equals("Bananas Yellow") || a.equals("Product Not Found");
        assert b.equals("Product Not Found") || b.equals("");
    }

    @Test

    public void testSaveLoadItems() {
        items.loadItems();
        items.addItem("4060");
        items.addItem("071514004266");
        items.findItem("4060");
        items.findItem("071514004266");
        items.saveItems();
        items.loadItems();
        assert items.findItem("4060") != null;
        assert items.findItem("071514004266") != null;
        items.inventory.remove("4060");
        items.inventory.remove("071514004266");
        items.saveItems();
    }

    @Test

    public void testParseString() {
        String a = PLu.parseString(" 4011 Banana Yellow code");
        assert a.equals("Banana Yellow ");
    }

    @Test

    public void testEquals() {
        Item a = new Product();
        Item b = null;
        assert !a.equals(b);
        assert !a.equals(transaction);
        b = new Produce();
        a.setDescription("asdf");
        b.setDescription("asdf");
        assert a.equals(b);
    }

}
