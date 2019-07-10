package ui;

public class Password {

    private String Pass;

    // passwordCheck() checks to see if given string equals password of this
    public boolean passwordCheck (String toCheck)
    {
        return this.Pass.equals(toCheck);
    }

    // setPass() sets the password on this account
    public void setPass (String pass)
    {
        this.Pass = pass;
    }
}
