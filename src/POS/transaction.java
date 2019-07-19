package POS;

import java.util.ArrayList;
import java.util.List;

public class transaction {
    List<Item> cart;

    public void startTransaction () {
        while(true) {
            cart = new ArrayList<>();
            String input = new String();
            Item toAdd;
            if (input.length() < 6) {
                toAdd = new Produce();
                //PLU
            }
            else {
                toAdd = new Product();
                //UPC
            }
            cart.add(toAdd);
        }
    }
}
