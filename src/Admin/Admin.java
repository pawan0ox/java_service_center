package Admin;

import java.util.Scanner;
public class Admin{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String name = scan.nextLine();
        System.out.println("Enter user contact number");
        String Contact = scan.nextLine();
        System.out.print("Enter the number of repairs to be done: ");
        int size = scan.nextInt();
        scan.nextLine();

        String[] array = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter repair " + (i + 1) + ": ");
            array[i] = scan.nextLine();
        }
        System.out.println("The name of the user is:"+ name);
        System.out.println("The contact of user is:"+ Contact);
        System.out.println("The repairs to be done are:");
        for (String str : array) {
            System.out.println(str);
        }
    }
}
