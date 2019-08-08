package main.model.pos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class PLu {
    public String newItem(String plu) throws ProductNotFound {
        String [] data = new String[10];
        try {
            String lookUp = "http://plufinder.com/plu/" + plu;
            URL api = new URL(lookUp);
            BufferedReader br = new BufferedReader(new InputStreamReader(api.openStream()));
            for (int i = 0; i < 10; i++) {
                data[i] = br.readLine();
            }
            String [] nameData = data[6].split("-");
            String [] moreProcess = nameData [1].split("<");
            String string = moreProcess[0].replaceAll("^\"|\"$", "");
            if (string.equals(" PLU Code not found")) {
                throw new ProductNotFound();
            }
            return parseString(string);
        } catch (Exception e) {
            throw new ProductNotFound();
        }
    }

    public String parseString(String string) {
        String [] p4 = string.split(" ");
        String x = "";
        for (int i = 2; i < p4.length - 1; i++) {
            x += (p4[i] + " ");
        }
        return x;
    }
}
