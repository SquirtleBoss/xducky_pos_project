package POS;

public class Produce extends Item {

    private boolean byWeight = false;

    public void Produce (String code) {
        super.Item(code);
    }

    @Override
    public void addQuantity (double x) {
        //prompt for byWeight?
        if (byWeight) { //change to prompt result
            byWeight = true;
        }
        super.addQuantity(x);
    }

    @Override
    public int getPrice () {
        if (this.byWeight) {
            return this.price * 0; //finish here
        }
        else {
            return this.price;
        }
    }

    public void sellByWeight () {
        byWeight = true;
    }

}
