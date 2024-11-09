import java.util.InputMismatchException;
import java.util.Scanner;
public class MoneyWithdrawalSystem {

    public void balance(int accbalance, int accwithdrawal){
        int newBalance = (accbalance-accwithdrawal);
        System.out.println("Your account balance is : Rs."+ newBalance);
    }
    public static void main(String[] args) {
        MoneyWithdrawalSystem object = new MoneyWithdrawalSystem();
        Scanner obj = new Scanner(System.in);

        try{

            System.out.print("Enter your First Name: ");
            String fName = obj.nextLine();

            System.out.print("Enter your Last Name: ");
            String lName = obj.nextLine();

            System.out.print("Enter your Acc Balance: Rs.");
            int balance = obj.nextInt();

            System.out.print("Enter the amount you want to Withdraw: Rs.");
            int withdrawal = obj.nextInt();

            System.out.println(" ");
            System.out.println("........................................................");
            System.out.println ("Customer full Name :" + fName.toUpperCase() + " "+ lName.toUpperCase());
            System.out.println("..........................................................");
            System.out.println(" ");

            if(withdrawal<=balance){
                if(withdrawal>=0 && withdrawal <=150000){
                    int total=withdrawal;

                    int fiveThousands=total/5000;
                    total=total%5000;

                    int oneThousands=total/1000;
                    total=total%1000;

                    int fiveHundred=total/500;
                    total=total%500;

                    int hundreds=total/100;
                    total=total%100;

                    int fifties=total/50;
                    total=total%50;

                    int twenties=total/20;
                    total=total%20;

                    System.out.println("Here's what you got! Check your notes!!");
                    System.out.println(" ");
                    System.out.println("Rs.5000 Notes :"+fiveThousands);
                    System.out.println("Rs.1000 Notes :"+oneThousands);
                    System.out.println("Rs.500 Notes :"+fiveHundred);
                    System.out.println("Rs.100 :"+hundreds);
                    System.out.println("Rs.50 Notes :"+fifties);
                    System.out.println("Rs.20 Notes :"+twenties);
                    System.out.println(" ");


                    System.out.println("Total Wihdrawal Amount: Rs."+withdrawal);
                    object.balance(balance,withdrawal);
                    System.out.println("Thanks for using our ATM service. Have a nice day!");

                }else{
                    System.out.println("MAXIMUM WITHDRWAL AMOUNT IS RS.150,000. \nPLEASE ENTER A VALID AMOUNT!");
                }


            }else{
                System.out.println("YOUR ACCOUNT BALANCE IS NOT ENOUGH FOR THIS WITHDRAWAL!");
            }

            obj.close();

        }catch(Exception e){
            System.out.println("\nINVALID INPUT!!");
        }
    }
}