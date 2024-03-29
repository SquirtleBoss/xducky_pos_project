package main.model.system;

public class Login {

    String id;
    Password code;
    public Groups membership;


    // a login account
    public Login(String a, String b, int c) {
        Password x = new Password();
        Groups y = new Groups();
        x.setPass(b);
        code = x;
        id = a;
        y.name = c;
        membership = y;
    }

    // REQUIRES: to be called on a Login, user to input String
    // MODIFIES: NA
    // EFFECTS: prints "Login Successful" if input matches Password associated
    //          with this Login, "Access denied" otherwise
    public boolean attempt(String password) {
        String toCheck = password;
        return this.code.passwordCheck(toCheck);
    }

    public void setCode(String toSet) {
        this.code.setPass(toSet);
    }

    public Groups getMembership() {
        return this.membership;
    }

}
