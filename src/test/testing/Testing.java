package test.testing;

import main.model.pos.*;
import main.model.system.Password;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testing {


    @BeforeEach
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

}
