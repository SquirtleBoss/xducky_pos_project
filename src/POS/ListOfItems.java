package POS;

import java.util.List;

public class ListOfItems {
    List<Item> inventory;

    public void addItem (String code) {
        if (code.length() > 10) {
        Item toAdd = new Produce(); //fix here
        //set toAdd stuff
        inventory.add(toAdd);
    }
}
