package system;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfUsers implements writeIn, Save{

    public List <Login> logins = new ArrayList<>();

//    public ListOfUsers ()
//    {
//        logins = new ArrayList<>();
//    }

    public void writeFn() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("inputfile.txt"));
        for (int i = 0; i < lines.size(); i++) {
            String[] info = lines.get(i).split(" ");
            Login a = new Login (info[0], info[1], Integer.parseInt(info[2]));
            this.logins.add(a);
        }
        System.out.println (logins);
    }

    public void save ()throws IOException {
//        Login x = new Login("Bob", "123", 2);
//        logins.add(x);
//        System.out.println ("000" + logins);
        PrintWriter writer = new PrintWriter("inputfile.txt","UTF-8");
        for (int i = 0; i < logins.size(); i++) {
            Login a = logins.get(i);
            String toSave = a.ID + " " + a.code.getPass() + " " + a.membership.name;
            writer.println(toSave);
            System.out.println (a.code.getPass());
        }
        writer.close();
    }

//    public void addUserDef (String id, String pass)
//    {
//        Login x = new Login (id, pass,2);
//        logins.add(x);
//    }

    // addUser() adds a new user to list of users
    public void addUser (String id, Login currentUser)
    {
        System.out.println ("Enter Password: ");
        Scanner in = new Scanner(System.in);
        String pass = in.nextLine();
        Login x = new Login (id, pass,2);
        logins.add(x);
        System.out.println (id + " successfully added");
        System.out.println (logins);
        Commands c = new Commands();
        Login logout = new Login("logout", "", 0); // Change user here
        c.runFn(this, currentUser);
    }

    //signIn() finds the account user wishes to sign into
    public Login signIn (String account, String password)
    {
        boolean signedIn = false;
        for (int i = 0; i < logins.size(); i++)
        {
            if (account.equals(logins.get(i).ID))
            if (logins.get(i).attempt(password))
            {
                System.out.println ("Login Successful");
                signedIn = true;
                return logins.get(i);

            }
            else
                System.out.println("failed");
        }
        if (!signedIn)
            System.out.print("User not found");
        return null;
    }

    public void allUsers ()
    {
        for (int i = 0; i < logins.size(); i++)
        {
            System.out.println (logins.get(i).ID);
        }
        Commands c = new Commands();
        Login logout = new Login("logout", "", 0); //Change user here
        c.runFn (this, logout);
    }

}
