package BusinessLogic;

import java.io.IOException;  // Import the IOException class to handle errors
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;




public class withdrawbooking 
{

    public void With_Draw_Booking(String accNo)
    {
        String line = "";
        String splitBy = ",";
        int position = 1;
        String tempFile = "Temp.csv";
        File oldFile = new File("Customer.csv");
        File newFile = new File(tempFile);
        String currentline = "";
        String data[];

        try   
        {  
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            FileReader fr = new FileReader("Customer.csv");
            BufferedReader br = new BufferedReader(fr);  
            while ((currentline = br.readLine()) != null)  
            {  
                data = currentline.split(",");
                if(!(data[position].equals(accNo)))
                {
                    pw.println(currentline);
                }

            }
            pw.flush();
            pw.close();
            fr.close();  
            br.close();
            bw.close();
            fw.close();
            oldFile.delete();
            File dump = new File("C:/Users/moiz2/Downloads/Customer.csv");
            newFile.renameTo(dump);

        }      
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }   
    }
}