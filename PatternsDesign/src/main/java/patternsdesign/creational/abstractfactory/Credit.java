package patternsdesign.creational.abstractfactory;

public class Credit implements PaymentMethod{
    @Override
    public String doPayment() {
        return "CreditCard";
    }
}
