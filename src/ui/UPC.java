package ui;

import java.net.MalformedURLException;
import java.net.URL;

public class UPC {

    private String key = "ddk3elf99027jvy9j76inh945cpd1m";

    public String newItem (double upc)
    {
        try {
            String lookUp = "https://api.barcodelookup.com/v2/products?barcode=" + Double.toString(upc) + key;
            URL api = new URL("https://api.barcodelookup.com/v2/products?barcode=788069010733&formatted=y&key=ddk3elf99027jvy9j76inh945cpd1m");
            return "hi";
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return "hi";

    }
}
