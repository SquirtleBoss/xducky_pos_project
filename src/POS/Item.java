package POS;

import java.util.List;

public abstract class Item {
    String description;
    String ID;
    double quantity = 0;
    int price; //in cents
    public boolean sellByWeight = false;
    int sku;
    List<Transaction> boughtBy;

    public void Item (String id) {
        ID = id;
    }

    public String getDescription () {
        return this.description;
    }

    public void setDescription (String a) {this.description = a;}

    public void addQuantity (double x) {
        quantity += x;
    }

    public void minusQuantity (int x) {
        quantity -= x;

    }

    public String getID () {
        return this.ID;
    }

    public void setQuantity (double x) {
        this.quantity = x;
    }
    public double getQuantity () {return this.quantity;}

    public void setPrice (int a) {
        this.price = a;
    }

    public int getPrice() {
        return this.price;
    }

    @Override

    public boolean equals (Object obj) {
        if (obj == null)
            return false;
        if (!(obj instanceof Item))
            return false;
        return this.ID == ((Item) obj).ID;
    }

    @Override

    public int hashCode () {
        return Integer.parseInt(ID); //use last digit instead
    }
}
