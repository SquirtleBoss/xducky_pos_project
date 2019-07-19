package POS;

abstract class Item {
    String description;
    double ID;
    public double quantity = 0;
    double price;
    int sku;


    public void addQuantity (double x) {
        quantity += x;
    }

    public void minusQuantity (int x) {
        quantity -= x;

    }

    public void setQuantity (int x) {
        this.quantity = x;
    }

    public double getPrice() {
        return this.price;
    }
}
