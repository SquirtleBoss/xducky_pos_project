package main.model.pos;

import java.util.HashMap;

public class CarriedItems {
    public HashMap<String, Item> inventory = new HashMap<>();
    Item toAdd;
    String descrip;
   // private String [] keys = new String[];

    public Item addItem(String code) {
        try {
            if (code.length() > 5) {
                UPc upc = new UPc();
                descrip = upc.newItem(code);
                toAdd = new Product();
            } else {
                PLu plu = new PLu();
                descrip = plu.newItem(code);
                toAdd = new Produce();
            }
            toAdd.description = descrip;
        } catch (ProductNotFound f) {
            toAdd = new Product();

        }
        toAdd.id = code;
        toAdd.description = descrip;
        inventory.put(toAdd.id, toAdd);
        return toAdd;
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
    public Item findItem(String id) {
        return inventory.get(id);
    }
}

