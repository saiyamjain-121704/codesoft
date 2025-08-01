import java.util.Scanner;
 public class atm
{ 
    // Author: Saiyam jain
    // Date:1/08/25
    // Time of completion:18:55
    // Day:Friday  
    public static int Withdraw_Amt(int amount)
    {
      System.out.println("amount withdrawn is :"+amount);
      return 0;
    }
    public static int  Deposit_Amt(int depositamt)
    {
        System.out.println("The amount deposited is "+depositamt);
        return 0;
    }
    public static void Chk_Balance(int balance)
    {
        System.out.println(" Your Bank balance is"+balance);  
    }
     public static class useracc extends atm
    {
        // the variables of the class atm are contained in class user
        // *** Block of code *** //
    }
    public static void main(String[] args) {
        int bal;
        System.out.println("enter 1 to check bank balance");
        System.out.println("enter 2 for withdrawl");
        System.out.println("Enter 3 for deposit ");
        // main method or calling Method ** //
        System.out.println(" *** Welcome to our Atm *** \t");
        Scanner sc=new Scanner (System.in);
        System.out.println(" Enter your choice ");
        int choice=sc.nextInt();
        System.out.println("Enter the limit of Atm Withdrawl amount");
        int limit =sc.nextInt();
        if(choice==1)
        {
        System.out.println("fetching your account balance..........");
          bal=sc.nextInt();
        useracc obj=new useracc();
        obj.Chk_Balance(bal);
        }
        else if(choice==2)
        {
            // code to check bank account

        System.out.println("fetching your account balance..........");
          bal=sc.nextInt();
        System.out.println("enter the amount you want to withdraw");
        int amct=sc.nextInt();
        if(amct<=bal)
        {
            
            if(amct<=limit)
            {
            // ** if amount you want to withdraw is less or equal to your bank balance **
           Withdraw_Amt(amct);
        }
        else{
            System.out.println("Trasaction Denied");
        }
    }

    else
        {
            System.out.println("Insufficient bank balance please check your bank account");
        }
    }
    else if(choice==3)
    {
        // work done by server **
        System.out.println("fetching your account balance..........");
          bal=sc.nextInt();
        System.out.println("Enter the amount you want to deposit");
        int deposit=sc.nextInt();
         Deposit_Amt(deposit);
    }
    else{
        System.out.println("Invalid Request Exit from the Interface");
    }
}   
}
