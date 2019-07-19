package POS;

import java.util.List;

public class ListOfItems {
    List<Item> inventory;

    public void addItem (String code) {
        if (code.length() > 10) {
            UPC upc = new UPC();
            String descrip = upc.newItem(code);
            //confirm product with user
            Item toAdd = new Product(); //fix here;
            toAdd.description = descrip;
            inventory.add(toAdd);
        } else {
            //PLU
        }
    }
}
