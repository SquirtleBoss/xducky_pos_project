package ui;
import java.util.Scanner;

public class Login {

    String ID;
    Password code;


    // a login account
    public Login (String a, String b)
    {
        Password x = new Password();
        x.setPass(b);
        this.code = x;
        this.ID = a;
    }

    // attempt() attempts a login with this account
    public void attempt()
    {
        System.out.println ("Enter Password: ");
        Scanner in = new Scanner (System.in);
        String toCheck = in.nextLine();
        if (this.code.passwordCheck(toCheck))
            System.out.println("Login Successful");
        else
            System.out.println("Access denied");
    }

}
