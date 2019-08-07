package POS;

import java.util.HashMap;

public class CarriedItems {
    public HashMap<String, Item> inventory = new HashMap<>();

    public Item addItem (String code) {
        try {
            if (code.length() > 5) {
                UPC upc = new UPC();
                String descrip;
                descrip = upc.newItem(code);
                Item toAdd = new Product();
                toAdd.description = descrip;
                toAdd.ID = code;
                inventory.put(toAdd.ID, toAdd);
                return toAdd;
            } else {
                //PLU
                PLU plu = new PLU();
                String descrip;
                descrip = plu.newItem(code);
                Item toAdd = new Produce();
                toAdd.ID = code;
                toAdd.description = descrip;
                inventory.put(toAdd.ID, toAdd);
                return toAdd;
            }
        } catch (ProductNotFound f) {
            Item toAdd = new Product();
            toAdd.ID = code;
            inventory.put(toAdd.ID, toAdd);
            return toAdd;
        }
    }


    //gets the Item from the CarriedItems
    public Item findItem (String id) {
        return inventory.get (id);
    }
}

