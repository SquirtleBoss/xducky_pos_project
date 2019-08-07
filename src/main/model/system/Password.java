package main.model.system;

public class Password {

    //REQUIRES: caller to be in same class
    private String pass;

    // passwordCheck() checks to see if given string equals password of this
    // REQUIRES: called on a password, String parameter
    // MODIFIES: NA
    // EFFECTS: returns true if this.pass matches the String parameter, false otherwise
    public boolean passwordCheck(String toCheck) {
        return this.pass.equals(toCheck);
    }

    // setpass() sets the password on this account
    // REQUIRES: called on a password, String parameter.
    // MODIFIES: this.pass, set to the String parameter
    // EFFECTS: NA
    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return this.pass;
    }
}
