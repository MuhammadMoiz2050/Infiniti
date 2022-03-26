package BusinessLogic;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;  // Import the IOException class to handle errors

public class complaint
{
    public void addcomplaint(String name,String type ,String Complain)
    {
        UserDetails U = new UserDetails();
        String cust_name = U.addusername(name) + ",";
        String cust_comp = U.addusercomplain(Complain) + "\n";
        String comp_type = type + ",";
        File file = new File("C:/Users/moiz2/Downloads/Complain.csv");
        FileWriter fr = null;
    
        try 
        {
			// Below constructor argument decides whether to append or override
			fr = new FileWriter(file, true);
            fr.write(cust_name);
            fr.write(comp_type);
            fr.write(cust_comp);
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