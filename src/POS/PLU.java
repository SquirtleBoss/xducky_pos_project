package POS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class PLU {
    public String newItem (String plu) throws ProductNotFound {
        String [] data = new String[10];
        try {
            String lookUp = "http://plufinder.com/plu/" + plu;
            URL api = new URL(lookUp);
            BufferedReader br = new BufferedReader(new InputStreamReader(api.openStream()));
            for (int i = 0; i < 10; i++) {
                data[i] = br.readLine();
            }
            String nameData [] = data[6].split("-");
            String moreProcess [] = nameData [1].split("<");
            String string = moreProcess[0].replaceAll("^\"|\"$", "");
            System.out.println(string);
            if (string.equals(" PLU Code not found")) //guess here, check what api returns
                throw new ProductNotFound();
            return string;

        } catch (Exception e) {
            throw new ProductNotFound();
        }
    }
}
