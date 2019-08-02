package system;

public class Password {

    //REQUIRES: caller to be in same class
    private String Pass;

    // passwordCheck() checks to see if given string equals password of this
    // REQUIRES: called on a Password, String parameter
    // MODIFIES: NA
    // EFFECTS: returns true if this.Pass matches the String parameter, false otherwise
    public boolean passwordCheck (String toCheck)
    {
        return this.Pass.equals(toCheck);
    }

    // setPass() sets the password on this account
    // REQUIRES: called on a Password, String parameter.
    // MODIFIES: this.Pass, set to the String parameter
    // EFFECTS: NA
    public void setPass (String pass)
    {
        this.Pass = pass;
    }

    public String getPass () {return this.Pass;}
}
