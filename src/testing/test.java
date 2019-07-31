package testing;

import POS.*;
import org.junit.Test;
import system.Password;

public class test {

    @Test
    public void test () {
        Password duck = new Password();
        duck.setPass("12345");
        System.out.println (duck.passwordCheck("12345"));
        System.out.println (!duck.passwordCheck("54321"));
        duck.setPass("54321");
        System.out.println (!duck.passwordCheck("12345"));
        System.out.println (duck.passwordCheck("54321"));
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
    public void testItems () {
        boolean x = false;
        Produce one = new Produce();
        one.addQuantity(5.4);
        assert one.quantity == 5.4;
        CarriedItems z = new CarriedItems();
        try {
            z.addItem("057700013144");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        UPC two = new UPC();
        try {
            two.newItem("000000000000");
        } catch (ProductNotFound e) {
            x = true;
            System.out.println ("error");
        }
        assert !x;

        PLU three = new PLU();
        three.newItem("4011");

    }

}
