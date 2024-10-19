public class Commission extends Hourly{
    private double totalSales;
    protected double comRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.comRate = comRate;
    }

    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }

    @Override
    public double pay() {
        double totalCom = (totalSales * comRate);
        totalSales = 0;
        return super.pay() + totalCom;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
