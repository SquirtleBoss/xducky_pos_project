package system;
import java.util.Scanner;

public class Login {

    String ID;
    Password code;
    Groups membership;
    Login addedBy;


    // a login account
    public Login (String a, String b, int c, Login currentLogin)
    {
        Password x = new Password();
        Groups y = new Groups();
        x.setPass(b);
        code = x;
        ID = a;
        y.name = c;
        membership = y;
        addedBy = currentLogin;
    }

    public void addToGroup(int a) {
        this.membership.name = a;
    }

    // REQUIRES: to be called on a Login, user to input String
    // MODIFIES: NA
    // EFFECTS: prints "Login Successful" if input matches Password associated
    //          with this Login, "Access denied" otherwise
    public boolean attempt()
    {
        System.out.println ("Enter Password: ");
        Scanner in = new Scanner (System.in);
        String toCheck = in.nextLine();
        return this.code.passwordCheck(toCheck);
    }

}
