package main.model.pos;

public abstract class Item {
    String description;
    String id;
    double quantity = 0;
    int price; //in cents
    public boolean sellByWeight = false;

    public void item(String id1) {
        id = id1;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String a) {
        this.description = a;
    }

    public void addQuantity(double x) {
        quantity += x;
    }

    public void minusQuantity(int x) {
        quantity -= x;

    }

    public String getID() {
        return this.id;
    }

    public void setID(String a) {
        this.id = a;
    }

    public void setQuantity(double x) {
        this.quantity = x;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public void setPrice(int a) {
        this.price = a;
    }

    public int getPrice() {
        return this.price;
    }

    @Override

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        return this.id == ((Item) obj).id;
    }

    @Override

    public int hashCode() {
        return Integer.parseInt(id); //use last digit instead
    }
}
