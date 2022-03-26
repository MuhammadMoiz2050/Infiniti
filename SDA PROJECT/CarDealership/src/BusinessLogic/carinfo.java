package BusinessLogic;




public class carinfo 
{
    public String carname;
    public String carModel;
    public String carPrice;
    public String carTransmission;
    public String carFuelType;

    
    public carinfo() {
    	carname = "";
    };
    
    public carinfo(String carn,String carM,String carP,String carT, String carF)
    {
        carname = carn;
        carModel = carM;
        carPrice = carP;
        carTransmission = carT;
        carFuelType = carF;
    }
    
   
}