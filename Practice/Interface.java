interface Payment{
    void pay(double amount);
}

class UPI implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Amount Paid Using UPI = " + amount);
    }
}
class Card implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Amount Paid Using Card = " + amount);
    }
}
class Cash implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Amount Paid Using Cash = " + amount);
    }
}

class NetBanking implements Payment{
    @Override
    public void pay(double amount){
        System.out.println("Amount Paid Using NetBanking = " + amount);
    }
}
public class Interface {
    public static void main(String[] args) {
        Payment cash = new Cash();
        cash.pay(5000);

        Payment card = new Card();
        card.pay(70000);

        Payment netbanking = new NetBanking();
        netbanking.pay(400381);

        Payment upi = new UPI();
        upi.pay(300);
    }
}
