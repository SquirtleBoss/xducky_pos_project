package POS;

abstract class Item {
    String description;
    String ID;
    public double quantity = 0;
    double price;
    int sku;

    public void Item (String description2, String id) {
        description = description2;
        ID = id;
    }


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
