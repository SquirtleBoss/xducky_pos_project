package main.model.pos;

public class Produce extends Item {

    @Override
    public void addQuantity(double x) {
        //prompt for byWeight?
        super.addQuantity(x);
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
