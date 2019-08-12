package test.testing;

import main.model.pos.*;
import main.model.system.ListOfUsers;
import main.model.system.Login;
import main.model.system.Password;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Testing {

    CarriedItems items;
    Transaction transaction;
    Login user;
    ListOfUsers users;
    Item item;


    @BeforeEach

    public void before() {
        items = new CarriedItems();
        transaction = new Transaction();
        user = new Login("Bob", "ducks", 2);
        users = new ListOfUsers();
        item = new Product();
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
        a.setID("0000");
        b.setID("0000");
        assert a.equals(b);
    }

    @Test

    public void testGroups() {
        assert user.getMembership().hasPermission(111110);
        assert !user.getMembership().hasPermission(111100);
    }

    @Test

    public void testExtendCarriedItems() {
        Item a = new Produce();
        a.setID("0001");
        a.setDescription("Rubba Ducks");
        a.sellByWeight = true;
        a.setPrice(300);
        items.inventory.put("0001", a);
        items.addKey("0001");
        items.saveItems();
        items = new CarriedItems();
        items.loadItems();
        Item b = items.findItem("0001");
        assert b.equals(a);
        items.inventory.remove("0001");
        items.getKeys().remove("0001");
        items.saveItems();
    }

    @Test

    public void testFinTrans() {
        item.setQuantity(5.0);
        transaction.cart.add(item);
        transaction.amount.add(1.0);
        transaction.finishTransaction();
        assert item.getQuantity() == 4.0;
    }

    @Test

    public void testLOs() {
        try {
            users.writeFn();
            users.findUser("blahblah");
        } catch (IOException f) {
            System.out.println("User not found");
        }
    }

    @Test

    public void testSaveWriteFN() {
        try {
            users.writeFn();
            users.logins.add(user);
            Login a = users.findUser("Bob");
            assert a.membership.name == 2;
            a.setCode("123");
            Login b = users.signIn("Bob", "123");
            assert b.getMembership() == a.getMembership();
            Login c = users.signIn("blahblah", "");
            assert c == null;
            users.save();
            users.writeFn();
            assert a.membership.name == 2;
            users.removeUser(a);
            users.save();
        } catch (IOException f) {
            System.out.println("User not found");
        }
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
}
