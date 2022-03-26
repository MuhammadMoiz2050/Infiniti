package BusinessLogic;

import java.util.ArrayList;

//public class booking 
//{
//    //private ArrayList<sale> sale;
//    //private ArrayList<carinfo> Cars = new ArrayList<carinfo>();
//    catalogue C1 = new catalogue();
//    
//
//    public void startBooking() {
//
//        C1.ShowCars();
//        for(carinfo c:C1.Cars)
//        {   
//            //s[i] += Cars.get(i); 
//            System.out.println(c.carname + " " + c.carModel + " " + c.carPrice + " " + c.carTransmission + " " + c.carFuelType);
//        }
//        
//
//    }
//}

//Singleton Class
public class booking {

    private static booking instance = new booking();

    private booking() {

    }

    public static booking getInstance() {
        if (instance == null) {
            synchronized (booking.class) {
                if (instance == null) {
                    instance = new booking();
                    // instance will be created at request time
                }
            }
        }
        return instance;
    }

    public void startBooking() {

        catalogue C1 = new catalogue();
        C1.ShowCars();
        for (carinfo c : C1.Cars) {
            // s[i] += Cars.get(i);
            System.out.println(
                    c.carname + " " + c.carModel + " " + c.carPrice + " " +
                            c.carTransmission + " " + c.carFuelType);
        }

    }
}
