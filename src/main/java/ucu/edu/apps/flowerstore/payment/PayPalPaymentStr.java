package ucu.edu.apps.flowerstore.payment;

public class PayPalPaymentStr implements Payment{
    @Override
    public boolean pay(double price) {
        if (price>=0){
            System.out.println("PayPal Payment success: your total: "+price);
            return true;
        }
        return false;
    }
}
