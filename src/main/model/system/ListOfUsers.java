package main.model.system;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListOfUsers implements WriteIn, Save {

    public List<Login> logins = new ArrayList<>();

    public void writeFn() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile.txt"));
        for (int i = 0; i < lines.size(); i++) {
            String[] info = lines.get(i).split(" ");
            Login a = new Login(info[0], info[1], Integer.parseInt(info[2]));
            this.logins.add(a);
        }
        System.out.println(logins);
    }

    public void save() throws IOException {
        PrintWriter writer = new PrintWriter("inputfile.txt","UTF-8");
        writer.flush();
        for (int i = 0; i < logins.size(); i++) {
            Login a = logins.get(i);
            String toSave = a.id + " " + a.code.getPass() + " " + a.membership.name;
            writer.println(toSave);
            System.out.println(a.code.getPass());
        }
        writer.close();
    }

    //signIn() finds the account user wishes to sign into
    public Login signIn(String account, String password) {
        boolean signedIn = false;
        for (int i = 0; i < logins.size(); i++) {
            if (account.equals(logins.get(i).id)) {
                if (logins.get(i).attempt(password)) {
                    System.out.println("Login Successful");
                    signedIn = true;
                    return logins.get(i);
                }
            } else {
                System.out.println("failed");
            }
        }
        if (!signedIn) {
            System.out.print("User not found");
        }
        return null;
    }

    public Login findUser(String account) {
        for (int i = 0; i < logins.size(); i++) {
            if (account.equals(logins.get(i).id)) {
                return logins.get(i);
            }
        }
        return null;
    }

    public void removeUser(Login a) {
        logins.remove(a);
    }

}
