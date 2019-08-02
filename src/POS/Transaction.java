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

    public void finishTransaction () {
        for (int i = 0; i < cart.size(); i++) {
            cart.get(i).boughtBy.add(this);
            // cart.get(i).quantity--; for after quantity gets implemented
        }
    }
}
