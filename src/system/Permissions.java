package system;
public class Permissions {

    // password set, user add/delete, override key, use program


    public boolean processPermission (int x, int y)
    {
        int a = x /  powTen(y);
        int b = a % 10;
        if (b == 1)
            return true;
        else
            return false;
    }

    public int powTen (int a)
    {
        int b = 1;
        for (int i = 1; i < a; i++)
        {
            b = b * 10;
        }
        return b;
    }

}
