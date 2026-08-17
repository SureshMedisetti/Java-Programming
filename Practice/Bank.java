class BankAccount{
    public long Accno;
    public int Balance;

    BankAccount(long Accno, int Balance){
        this.Accno = Accno;
        this.Balance = Balance;
    }
}

public class Bank {
    public void Withdraw(BankAccount BankAcc[] , int Amount[] ){
        for (int i=0;i<BankAcc.length;i++){  
            if(BankAcc[i].Balance >= Amount[i]){
                BankAcc[i].Balance -= Amount[i];
                System.out.println("Balance Of "+BankAcc[i].Accno + " = " + BankAcc[i].Balance);
            }else{
                System.out.println("Insufficient Balance...." );
            }
        }
    }
    public void Deposit(BankAccount BankAcc[] , int Amount[]){
        for (int i=0;i<BankAcc.length;i++){
            BankAcc[i].Balance += Amount[i];
            System.out.println("Money Deposited into "+BankAcc[i].Accno + " = " + Amount[i]);
            System.out.println("Total Balance = " + Amount[i]);
        }
    }
    public void showBalance(BankAccount BankAcc[]){
        for (BankAccount BankBalance : BankAcc ){
            System.out.println("Bank Balance of " + BankBalance.Accno + " = " + BankBalance.Balance );
        }
    }
    public static void main(String[] args){
        int Amount[] = {100000, 40000, 300000, 20000, 75000};

        BankAccount BankAcc[] = new BankAccount[5];

        BankAcc[0] = new BankAccount(240031221,150000);
        BankAcc[1] = new BankAccount(240030621,50000);
        BankAcc[2] = new BankAccount(240030901,250000);
        BankAcc[3] = new BankAccount(240032121,750000);
        BankAcc[4] = new BankAccount(240033321,60000);

        Bank withdraw = new Bank();
        withdraw.Withdraw(BankAcc, Amount);

        Bank deposit = new Bank();
        deposit.Deposit(BankAcc, Amount);
        
        Bank balance = new Bank();
        balance.showBalance(BankAcc);

    }
}
