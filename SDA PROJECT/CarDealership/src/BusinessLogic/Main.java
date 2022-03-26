package BusinessLogic;

import java.util.Scanner; 
public class Main 
{
    public static void main(String[] args) 
    {   
       // booking b = new booking();
    	booking instance = booking.getInstance();
		instance.startBooking();
        catalogue c = new catalogue();
        checkuser ck = new checkuser();
        testdrive td = new testdrive();
        complaint cp = new complaint();
        UserDatabase db = new UserDatabase();
        ScheduleInspection Si = new ScheduleInspection();
        withdrawbooking wb = new withdrawbooking();

        Scanner getInput = new Scanner(System.in);
        
        int choice = -1;
        while (choice != 9) {
            System.out.println("--------------------CAR DEALER SHIP MANAGEMENT SYSTEM INFINITI™------------------\n\n\n");
            System.out.println("Choose from the following: ");
            System.out.println("1. Browse catalogue");
            System.out.println("2. Launch Complaint");
            System.out.println("3. Book a New Car");
            System.out.println("4. Withdraw a Booking");
            System.out.println("5. Schedule Inspection");
            System.out.println("6. Book a Test Drive");
            System.out.println("7. Collect a Car ");
            System.out.println("8. Exit\nEnter youChoice");
            choice = getInput.nextInt();
            
                if(choice == 1)
                {
            		instance.startBooking();

                    //b.startBooking();
                }
                else if(choice == 2)
                {
                    System.out.println("Enter Customer Name : ");
                    Scanner obj = new Scanner(System.in);
                    String name = obj.nextLine();
                    System.out.println("Enter Complaint Type : ");
                    Scanner obj1 = new Scanner(System.in);
                    String type = obj1.nextLine();

                    System.out.println("Enter Your Complaint : ");
                    Scanner obj2 = new Scanner(System.in);
                    String Complain = obj2.nextLine();
                    cp.addcomplaint(name, type, Complain);

                }
                else if(choice == 3)
                {
                    System.out.println("Enter Customer Name : ");
                    Scanner obj = new Scanner(System.in);
                    String name = obj.nextLine();
                    System.out.println("Enter Car Name : ");
                    Scanner obj1 = new Scanner(System.in);
                    String cardetail = obj1.nextLine();
                    System.out.println("Enter Your Account No : ");
                    Scanner obj2 = new Scanner(System.in);
                    String accno = obj2.nextLine();
                    db.AddUserDetails(name, cardetail, accno);
                }
                else if(choice == 4)
                {
                    System.out.println("Enter Your Account No : ");
                    Scanner obj2 = new Scanner(System.in);
                    String accno = obj2.nextLine();
                    wb.With_Draw_Booking(accno);
                }
                else if(choice == 5)
                {
                    System.out.println("Enter Customer Name : ");
                    Scanner obj = new Scanner(System.in);
                    String name = obj.nextLine();
                    System.out.println("Enter Car Name : ");
                    Scanner obj1 = new Scanner(System.in);
                    String carname = obj1.nextLine();
                    System.out.println("Enter Date : ");
                    Scanner obj2 = new Scanner(System.in);
                    String date = obj2.nextLine();
                    Si.addInspection(name, date, carname);
                }
                else if(choice == 6)
                {
                    System.out.println("Enter Customer Name : ");
                    Scanner obj = new Scanner(System.in);
                    String name = obj.nextLine();
                    System.out.println("Enter Car Name : ");
                    Scanner obj1 = new Scanner(System.in);
                    String carname = obj1.nextLine();
                    System.out.println("Enter Date : ");
                    Scanner obj2 = new Scanner(System.in);
                    String date = obj2.nextLine();
                    td.addtestdrivedetails(name, date, carname);
                }
                else if(choice == 7)
                {
                    System.out.println("Enter Customer Name : ");
                    Scanner obj = new Scanner(System.in);
                    String name = obj.nextLine();
                    boolean ispresent = false;
                    ispresent = ck.CheckUser(name);
                    if(ispresent == true)
                    {
                        System.out.println("Please Collect Your Car From The DealerShip\n");
                    }

                }
                else if(choice == 8)
                {

                    break;
                }
                  
            }
        }
       

}