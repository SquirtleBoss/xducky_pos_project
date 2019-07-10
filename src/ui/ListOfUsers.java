package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfUsers {

    public List <Login> logins;

    public ListOfUsers ()
    {
        logins = new ArrayList<>();
    }

    // addUser() adds a new user to list of users
    public void addUser (String id)
    {
        System.out.println ("Enter Password: ");
        Scanner in = new Scanner(System.in);
        String pass = in.nextLine();
        Login x = new Login (id, pass);
        logins.add(x);
        System.out.println (id + " successfully added");
        System.out.println (logins);
        Commands.runFn(this);
    }

    //signIn() finds the account user wishes to sign into
    public void signIn (String account)
    {
        Boolean signedIn = false;
        for (int i = 0; i < logins.size(); i++)
        {
            if (account.equals(logins.get(i).ID))
            logins.get(i).attempt();
            signedIn = true;
        }
        if (!signedIn)
            System.out.print("User not found");
    }

}
