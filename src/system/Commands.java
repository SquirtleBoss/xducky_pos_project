package system;

import java.util.Scanner;

public class Commands {



    public static void System ()
    {
        ListOfUsers users = new ListOfUsers();
        Commands c = new Commands();
        Login Admin1 = new Login("Admin1", "", 5);
        users.logins.add(Admin1);
        c.runFn(users, Admin1);
    }

    //runFn() houses the different commands
    public void runFn (ListOfUsers users, Login currentUser)
    {
        while (true) {

            System.out.print (currentUser.ID + " >  ");
            Scanner in = new Scanner(System.in);
            Login logout = new Login("logged out", "",1);
            Commands c = new Commands();

            String command = in.nextLine();

            String[] decoded = command.split(" ");

            switch (decoded[0]) {
                case "add":
                    if (fnPerms (currentUser, 111000))
                     users.addUser(decoded[1], currentUser);
                    else
                        System.out.println ("Access denied");
                    break;

                case "login":
                    if (fnPerms (currentUser, 100001))
                        users.signIn(decoded[1]);
                    else
                        System.out.println ("Please logout");
                    break;

                case "logout":
                    if (fnPerms (currentUser, 111110))
                        c.runFn(users, logout);
                    else{}

                case "users":
                    if (fnPerms (currentUser, 111110))
                        users.allUsers();
                    else{}

                default:
                    System.out.println("Syntax Error");
                    break;
            }
        }
    }

    public boolean fnPerms (Login currentUser, int x)
    {
       return currentUser.membership.hasPermission(x);
    }
}
