package POS;

public class Product extends Item {

    public void assignSKU (int sku) {
        try {
            if (this.sku == sku)
                this.sku = sku;
            else {
                //return product has sku

            }
        }
        catch (NullPointerException e) {
            if (!checkDupSku(sku)) {
                this.sku = sku;
            }
        }
    }

    public boolean checkDupSku (int sku) {

        //check to see if any product has this sku
        return false;
    }
}
