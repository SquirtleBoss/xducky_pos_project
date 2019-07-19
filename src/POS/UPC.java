package POS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UPC {

    private String key = "ddk3elf99027jvy9j76inh945cpd1m";

    public String newItem (String upc)
    {
        String [] data = new String[10];
        //String [] nameData = new String[5];
        try {
            String lookUp = "https://api.barcodelookup.com/v2/products?barcode=" + upc + "&formatted=y&key=" + key;
            URL api = new URL(lookUp);
            BufferedReader br = new BufferedReader(new InputStreamReader(api.openStream()));
            for (int i = 0; i < 10; i++) {
                data[i] = br.readLine();
            }
            String nameData [] = data[9].split(":");
            System.out.println(nameData[1]);
            return nameData[1];

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "hi";

    }
}
