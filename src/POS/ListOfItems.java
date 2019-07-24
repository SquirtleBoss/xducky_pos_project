package POS;

import java.util.List;

public class ListOfItems {
    List<Item> inventory;

    public void addItem (String code) {
        if (code.length() > 10) {
            UPC upc = new UPC();
            String descrip;
            try {
                descrip = upc.newItem(code);
                //confirm product with user
                Item toAdd = new Product();
                toAdd.description = descrip;
                inventory.add(toAdd);
            } catch (ProductNotFound e) {
                System.out.println ("Product not found");
            }
            finally {
                //return to checkout screen;
            }
        } else {
            //PLU
        }

        //prompt for price and quantity
        //set price and quantity
    }
}
