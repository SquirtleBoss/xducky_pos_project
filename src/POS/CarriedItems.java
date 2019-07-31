package POS;

import java.util.HashMap;

public class CarriedItems {
    public HashMap<String, Item> inventory = new HashMap<>();

    public void addItem (String code) {
        if (code.length() > 5) {
            UPC upc = new UPC();
            String descrip;
            try {
                descrip = upc.newItem(code);
                //confirm product with user
                Item toAdd = new Product();
                toAdd.description = descrip;
                toAdd.ID = code;
                toAdd.setPrice(1200); //price set here
                inventory.put(toAdd.ID, toAdd);
            } catch (ProductNotFound e) {
                System.out.println ("Product not found");
            }
            finally {
                //return to checkout screen;
            }
        } else {
            //PLU
            PLU plu = new PLU();
            String descrip;
            descrip = plu.newItem(code);
            //confirm product with user
            Item toAdd = new Produce();
            toAdd.ID = code;
            toAdd.description = descrip;
            toAdd.setPrice(300); //price set here
            inventory.put(toAdd.ID, toAdd);
        }

        //prompt for price and quantity
        //set price and quantity
    }


    //gets the Item from the CarriedItems
    public Item findItem (String id) {
        return inventory.get (id);
    }
}

