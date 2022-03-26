package BusinessLogic;

import java.util.ArrayList;
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.BufferedReader;
import java.io.FileReader;

public class catalogue
{
    public ArrayList<carinfo> Cars = new ArrayList<carinfo>();

    public void ShowCars()
    {
        String line = "";
        String splitBy = ",";
        try   
        {  
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/moiz2/Downloads/cars.csv"));  
            while ((line = br.readLine()) != null)   
            {  
                String[] Carinfo = line.split(splitBy);
                carinfo C1 = new carinfo(Carinfo[0],Carinfo[1],Carinfo[2],Carinfo[3],Carinfo[4]);
                Cars.add(C1);
            }  
            br.close();

        }      
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }   
        
    }

    public static void main(String[] args) 
    {   
        
    	booking instance = booking.getInstance();
		instance.startBooking();
        //booking b = new booking();
        //b.startBooking();
        UserDatabase u = new UserDatabase();
        u.AddUserDetails("Taha Rizwan", "Ford Mustang", "029373933");
    }
}
