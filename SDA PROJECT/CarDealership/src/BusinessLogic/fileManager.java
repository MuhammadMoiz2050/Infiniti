package BusinessLogic;

import java.util.ArrayList;
import java.io.*;

public class fileManager {
    public fileManager() {

    }

    // persistent handler
    public void writeOntoFile(ArrayList<String> args) {
        try {
            BufferedWriter writeOntoFile = new BufferedWriter(
                    new FileWriter(args.get(args.size() - 1),true));
            for (int i = 0; i < args.size() - 1; i++) {
                writeOntoFile.write(args.get(i));
                
            }
            writeOntoFile.close();
        } catch (Exception e) {
            // TODO: handle exception
            return;
        }
        return;
    }

}