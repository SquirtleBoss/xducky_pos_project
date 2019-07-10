package ui;

import java.util.Scanner;

public class Commands {

    public static void main (String[] args)
    {
        ListOfUsers users = new ListOfUsers();
        runFn(users);
    }

    //runFn() houses the different commands
    public static void runFn (ListOfUsers users)
    {
        while (true) {
            Scanner in = new Scanner(System.in);

            String command = in.nextLine();

            String[] decoded = command.split(" ");

            switch (decoded[0]) {
                case "add":
                    users.addUser(decoded[1]);
                    break;

                case "login":
                    users.signIn(decoded[1]);
                    break;

                default:
                    System.out.println("Syntax Error");
                    break;
            }
        }
    }
}
