package chapter6.phonebillcal;


public class ItemizedBill{

    static PhoneBill phoneBill = new PhoneBill();

    public double cost(){
        double baseCost = phoneBill.getBaseCost();
        double usedMinutes = phoneBill.getUsedMinutes();
        double allocatedMinutes = phoneBill.getAllocatedMinutes();
        double cost = baseCost + (usedMinutes - allocatedMinutes)*10;
        return cost;
    }
}
