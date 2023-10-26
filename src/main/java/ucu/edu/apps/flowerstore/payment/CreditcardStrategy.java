package ucu.edu.apps.flowerstore.payment;

public class CreditcardStrategy implements Payment{
    @Override
    public boolean pay(double price) {
        if (price>=0){
            System.out.println("Credit card Payment success: your total: "+price);
            return true;
        }
        return false;
    }
}