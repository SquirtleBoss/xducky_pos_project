package main.model.system;

public class Groups {

    public int name; // 5:admins, 4:manager, 3:supervisor, 2:user 1:loggedoff
    private Permissions permissions; //get only

    //call on a Groups
    public boolean hasPermission(int x) {
        Permissions a = new Permissions();
        this.permissions = a;
        return this.permissions.processPermission(x, this.name);
    }
}
