package BusinessLogic;

import java.io.IOException;  // Import the IOException class to handle errors
import java.io.BufferedReader;
import java.io.FileReader;

public class checkuser
{
    public boolean CheckUser(String name)
    {
        String line = "";
        String splitby = ",";
        boolean isequal = false;
        boolean retTrue = false;
        try   
        {  
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/moiz2/Downloads/Customer.csv"));  
            while ((line = br.readLine()) != null)   
            {  
                String[] Cust_info = line.split(splitby);
                isequal = Cust_info[0].equals(name);
                if(isequal == true)
                {
                    retTrue = isequal;
                    System.out.println("asdsd");
                }
                
            }  
            br.close();

        }      
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }   

        return retTrue;
    }
}