package clases_aulas_java;

public class OutSourcedEmployee extends Employee_Heranca{
    private double additionalCharge;

    public OutSourcedEmployee(){
        super();    
    }
    public OutSourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }
    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    
    @Override
    public double payMent(){
        return super.payMent() + additionalCharge * 1.1;
    }
}
