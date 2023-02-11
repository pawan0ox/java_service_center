package Admin;
import Admin.Admin;
import java.util.Scanner;

public class Check extends Work{
    public Check(String name, String contact_number, boolean work_done) {
        super(name, contact_number, work_done);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Admin admin = new Admin();

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your contact: ");
        String contact_number = scan.nextLine();

        System.out.println("Enter the work_status");
        Boolean work_done = scan.nextBoolean();

        scan.nextLine(); // Clear the buffer

        Work WorkDone = new Work(name, contact_number, work_done);

        System.out.println("Your name is " + WorkDone.getName());
        System.out.println("Your age is " + WorkDone.getContact_number());

        if(WorkDone.getName() == name && WorkDone.getContact_number()==contact_number){

            if(work_done = true){
                System.out.println("The work is done");
            } else {
                System.out.println("the work is going on!!");
            }
        } else {
            System.out.println("No such user registered");
        }

    }
}