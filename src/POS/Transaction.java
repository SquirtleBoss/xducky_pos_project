package POS;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
    public List<Item> cart = new ArrayList<>();
    public List<Double> amount = new ArrayList<>();
    int total = 0; //in cents

    public int getTotal () {
        return this.total;
    }

    public void addTotal (int a) {
        this.total += a;
    }

    public void finishTransaction () {
        for (int i = 0; i < cart.size(); i++) {
            cart.get(i).quantity -= amount.get(i);
        }
    }
}
