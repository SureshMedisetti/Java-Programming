class BankDetails{
    private long Accno;
    private String AccName;
    private double Balance;

    public long getAccno(){
        return Accno;
    }

    public void setAccno(long Accno){
        this.Accno = Accno;
    }

    public String getAccName(){
        return AccName;
    }

    public void setAccName(String AccName){
        this.AccName = AccName;
    }

    public double getBalance(){
        return Balance;
    }

    public void setBalance(double Balance){
        this.Balance = Balance;
    }
}

public class Encap {
    public static void main(String[] args){
        BankDetails bank = new BankDetails();
        bank.setAccno(2400030621l);
        bank.setAccName("Suresh Medisetti");
        bank.setBalance(150611.96);

        System.out.println("Account Number = " + bank.getAccno());
        System.out.println("Account Name = " + bank.getAccName());
        System.out.println("Account Balance = " + bank.getBalance());
    }
}
