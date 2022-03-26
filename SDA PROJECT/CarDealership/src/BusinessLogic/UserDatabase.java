package BusinessLogic;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.ArrayList;

public class UserDatabase
{
    public void AddUserDetails(String name, String cardetail,String accno)
    {
        UserDetails U = new UserDetails();
       // String cust_name = U.addusername(name) + ",";
      //  String cust_car = U.addusercar(cardetail) + "\n";
       // String cust_acc = U.adduserAcc_No(accno) + ",";

         String cust_name = name  + ",";
         String cust_car = cardetail + "\n";
         String cust_acc = accno + ",";
        
        ArrayList<String> args = new ArrayList<String>();
        
        args.add(cust_name);
        args.add(cust_acc);
        args.add(cust_car);
        args.add("C:/Users/moiz2/Downloads/Customer.csv");
        fileManager manager = new fileManager();
        manager.writeOntoFile(args);


        // File file = new File("C:/Users/moiz2/Downloads/Customer.csv");
        // FileWriter fr = null;
    
        // try 
        // {
		// 	// Below constructor argument decides whether to append or override
		// 	fr = new FileWriter(file, true);
        //     fr.write(cust_name);
        //     fr.write(cust_acc);
        //     fr.write(cust_car);
            
        //     fr.close();
        // } 
        // catch (IOException e)
        // {
		// 	e.printStackTrace();
        // } 
        // finally 
        // {
        //     // do 
		// }


    }

}