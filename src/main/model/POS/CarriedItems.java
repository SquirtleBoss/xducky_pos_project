package main.model.POS;

import java.util.HashMap;

public class CarriedItems {
    public HashMap<String, Item> inventory = new HashMap<>();
   // private String [] keys = new String[];

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

//    public void save ()throws IOException {
////        Login x = new Login("Bob", "123", 2);
////        logins.add(x);
////        System.out.println ("000" + logins);
//        PrintWriter writer = new PrintWriter("inputfile.txt","UTF-8");
//        writer.flush();
//        for (int i = 0; i < keys.length; i++) {
//            Item a = inventory.get(keys[i]);
//            String toSave = a.ID + " " + a.code.getPass() + " " + a.membership.name;
//            writer.println(toSave);
//            System.out.println (a.code.getPass());
//        }
//        writer.close();
//    }


    //gets the Item from the CarriedItems
    public Item findItem (String id) {
        return inventory.get (id);
    }
}

