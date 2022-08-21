package uma;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");


    /* set customer number */
    public int setCustomerNumber(int customerNumber)
    {
        this.customerNumber= customerNumber;
        return customerNumber;
    }

    /* get customer number */
    public int getCustomerNumber()
    {
        return customerNumber;
    }

    /* set the pin number */
    public int setPinNumber(int pinNumber)
    {
        this.pinNumber=pinNumber;
       return pinNumber;
    }

    /* get the pin number */
    public int getPinNumber()
    {
        return pinNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalanace()
    {
        return savingBalance;
    }

    // calaculate chacking account withdrawal
    public double calcCheckingWithdraw(double amount)
    {
        checkingBalance-=amount;
        return checkingBalance;
    }

   //calculate saving account withdrawal
    public double calcSavingWithdraw(double amount)
    {
        savingBalance=savingBalance-amount;
        return savingBalance;
    }

    //calculate chacking account deposit

    public double calcCheckingDeposit(double amount)
    {
        checkingBalance+=amount;
        return checkingBalance;
    }

    //calculate saving balance deposit

    public double calcSavingDeposit(double amount)
    {
        savingBalance+=amount;
        return savingBalance;
    }

    // customer checking account withdraw input

    public void getCheckingWithdrawInput()
    {
        System.out.println(" Checking account balance: "+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw: ");
        double amount= input.nextDouble();

        if((checkingBalance-amount)>0) {
            calcCheckingWithdraw(amount);
            System.out.println("the new balance is: "+moneyFormat.format(checkingBalance));
        }
        else{
            System.out.println("Balance cannot be negetive! "+"\n");
        }
    }

    public void getSavingWithdrawInput()
    {
        System.out.println("Saving account balance: "+moneyFormat.format(savingBalance));
        System.out.println("Amount you want ot withdraw :");
        double amount=input.nextInt();

        if((savingBalance-amount)>0) {
            savingBalance -= amount;
            System.out.println("Your current balance is " + savingBalance + "\n");
        }
            else{
                System.out.println("Balance cannot be negetive! " + "\n");
            }

        }


    // Customer checking Account Deposit input .

    public void getCheckingDepositInput()
    {
        System.out.println("Checking account balance: "+moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit:");
        double amount=input.nextDouble();

        if((checkingBalance+amount)>0){
            calcCheckingDeposit(amount);
            System.out.println("the new balance is :"+moneyFormat.format(checkingBalance));
        }
        else {
            System.out.println("the balance cannot be negetive1"+"\n");
        }
    }
    public void getSavingDepositInput()
    {
        System.out.println("Saving account balance: "+moneyFormat.format(savingBalance));
        System.out.println("Amount you want ot deposit :");
        double amount=input.nextInt();

        if((savingBalance+amount)>=0) {
            savingBalance += amount;
            System.out.println("Your current balance is " + savingBalance + "\n");
        }
        else{
            System.out.println("Balance cannot be negative! " + "\n");
        }

    }
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
}

