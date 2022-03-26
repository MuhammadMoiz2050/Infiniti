package BusinessLogic;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException; 

public class ScheduleInspection
{
    public void addInspection(String name, String date,String carname)
    {
        UserDetails U = new UserDetails();
        String cust_name = U.addusername(name) + ",";
        String cust_date = U.adduserinspectiondate(date) + "\n";
        String cust_car = U.adduserinspectiondate(carname) + ",";

        File file = new File("C:/Users/moiz2/Downloads/Inspection.csv");
        FileWriter fr = null;
        try 
        {
			fr = new FileWriter(file, true);
            fr.write(cust_name);
            fr.write(cust_car);
            fr.write(cust_date);
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