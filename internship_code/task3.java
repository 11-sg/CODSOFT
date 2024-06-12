import java.util.*;
public class task3{
    // ATM interface
   static double balance;
       public static void main(String args[]){
        user_detail ob=new user_detail();
        balance=ob.details();
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("-----3-----WELCOME TO ATM---------- ");
        System.out.println("PRESS 1 TO WITHDRAW AMOUNT");
        System.out.println("PRESS 2 TO DEPOSIT  AMOUNT");
        System.out.println("PRESS 3 TO CHECK    BALANCE");
        System.out.println("PRESS 4 TO EXIT");        
        System.out.println("---------------------------------- ");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Enter the withdrawal amount");
            double amt=sc.nextDouble();
        withdraw(amt);
        }
        else if (n == 2){
            System.out.println("Enter the deposit amount");
            double amt=sc.nextDouble();
        deposit(amt);
        }
        else if(n==3)
        checkbalance();
        else
        {
            System.out.println("THANK YOU!");
            sc.close();
            System.exit(0);
        }
    }
}
    public static void withdraw(double amount){
        if(amount>balance)
        System.out.println("INSUFFICIENT BALANCE");
        else
        {
            balance-=amount;
            System.out.println("Your Amount is Withdrawn Successfully!");
        }
    }
    public static void deposit(double amount){
        balance+=amount;
        System.out.println("Your Amount is Deposited Successfully!");
    }
    public  static void checkbalance(){
        System.out.println("Your Current Balance Is : "+balance);
    }
}