package BusinessLogic;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;  // Import the IOException class to handle errors

public class testdrive 
{
    public void addtestdrivedetails(String name,String date,String carname)
    {
        UserDetails U = new UserDetails();
        String cust_name = U.addusername(name) + ",";
        String cust_car = U.addusercar(carname) + "\n";
        String cust_date = U.adduserinspectiondate(date) + ",";

        File file = new File("TestDrive.csv");
        FileWriter fr = null;

        try 
        {
			// Below constructor argument decides whether to append or override
			fr = new FileWriter(file, true);
            fr.write(cust_name);
            fr.write(cust_date);
            fr.write(cust_car);
        } 
        catch (IOException e)
        {
			e.printStackTrace();
        } 
        finally 
        {
            try 
            {
				fr.close();
            } 
            catch (IOException e)
            {
				e.printStackTrace();
			}
		}
    }

}