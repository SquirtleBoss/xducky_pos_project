package POS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UPC {

    private String key = "ddk3elf99027jvy9j76inh945cpd1m";

    public String newItem (String upc) throws ProductNotFound
    {
        String [] data = new String[10];
        //String [] nameData = new String[5];
//        try {
//            String lookUp = "https://api.barcodelookup.com/v2/products?barcode=" + upc + "&formatted=y&key=" + key;
//            URL api = new URL(lookUp);
//            BufferedReader br = new BufferedReader(new InputStreamReader(api.openStream()));
//            for (int i = 0; i < 10; i++) {
//                data[i] = br.readLine();
//            }
//            String nameData [] = data[9].split(":");
//            System.out.println(nameData[1]);
//            return nameData[1];
//
//        } catch (MalformedURLException e) {
//        } catch (IOException e) {
//            throw new ProductNotFound();
//        }
        try {
            String lookUp = "https://api.upcitemdb.com/prod/trial/lookup?upc=" + upc;
            URL api = new URL(lookUp);
            BufferedReader br = new BufferedReader(new InputStreamReader(api.openStream()));
            for (int i = 0; i < 10; i++) {
                data[i] = br.readLine();
            }
            String nameData [] = data[0].split(":");
            String moreProcess [] = nameData [6].split(",");
            String string = moreProcess[0].replaceAll("^\"|\"$", "");
            System.out.println(string);
            return string;

        } catch (MalformedURLException e) {
        } catch (IOException e) {
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ProductNotFound();
        }
        return "Product Not Found";

    }
}
