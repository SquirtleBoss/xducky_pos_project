package POS;

import java.util.List;

public class Transaction {
    List<Item> cart;
    int total = 0; //in cents

    public int getTotal () {
        return this.total;
    }

    public void addTotal (int a) {
        this.total += a;
    }
}
