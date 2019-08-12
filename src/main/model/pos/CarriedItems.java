package main.model.pos;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarriedItems {
    public HashMap<String, Item> inventory = new HashMap<>();
    Item toAdd;
    String descrip;
    List<String> keys = new ArrayList<>();
    int number;

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

    public void saveItems() {
        try {
            PrintWriter writer = new PrintWriter(".idea/CarriedItems.txt", "UTF-8");
            writer.flush();
            for (int i = 0; i < keys.size(); i++) {
                Item a = inventory.get(keys.get(i));
                if (a.sellByWeight) {
                    number = 1;
                } else {
                    number = 0;
                }
                String toSave = a.getID() + ":" + a.getDescription() + ":" + a.getPrice() + ":" + a.getQuantity()
                        + ":" + number;
                writer.println(toSave);
            }
            writer.close();
        } catch (IOException f) {
            System.out.println("exception");
        }
    }

    public void loadItems() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(".idea/CarriedItems.txt"));
            for (int i = 0; i < lines.size(); i++) {
                String[] info = lines.get(i).split(":");
                Item a = new Product();
                a.setID(info[0]);
                a.setDescription(info[1]);
                a.setPrice(Integer.parseInt(info[2]));
                a.setQuantity(Double.parseDouble(info[3]));
                a.sellByWeight = info[4].equals("1");
                this.inventory.put(info[0], a);
                keys.add(info[0]);
            }
        } catch (Exception f) {
            System.out.println("Sync Error");
        }
    }

    public void addKey(String a) {
        keys.add(a);
    }

    public List<String> getKeys() {
        return keys;
    }

    //gets the Item from the CarriedItems
    public Item findItem(String id) {
        return inventory.get(id);
    }
}

