import java.util.ArrayList;

public class CO2FromElectricity
{
    
    
    ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
    ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);
    double avgBill, avgPrice;
    

    CO2FromElectricity(ArrayList<Double> mb, ArrayList<Double> mp)
    {
        
        monthlyBill = mb;
        monthlyPrice = mp;
        
    }

    public double calcAverageBill()
    {
        
        double total = 0;
        
        for (int i = 0; i < monthlyBill.size(); i++)
        {
            
            total += monthlyBill.get(i);
            
        }
        
        total = total / monthlyBill.size();
        
        return total;
        
    }
    

    public double calcAveragePrice()
    {
        
        double total = 0;
        
        for (int i = 0; i < monthlyPrice.size(); i++)
        {
            
            total += monthlyPrice.get(i);
            
        }
        
        total = total / monthlyPrice.size();
        
        return total;
        
    }
    
    //calcs the co2 emissions
    public double calcElectricityCO2(double avgBill,double avgPrice){
        
        double total = 0;
        
        total = avgBill/avgPrice * 1.37 * 12;
        
        return total;
        
    }
    
}

