package BankingSystem;
public class Transaction
{
    public int depositeAmount(int amount,int totalBalance)
    {
        totalBalance=totalBalance+amount;
        return totalBalance;
    }
    public int withdrawAmount(int amount,int totalBalance)
    {
        if(totalBalance<=0)
        {
            System.out.println("insufficient balance");
        }
        else
        {
            totalBalance=totalBalance-amount;
        }
        return totalBalance;
    }
}
