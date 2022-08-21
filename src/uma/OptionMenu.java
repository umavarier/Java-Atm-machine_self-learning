package uma;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");

    HashMap<Integer, Integer> data= new HashMap<Integer,Integer>();
    /* Validate Login information customer number and pin number */

    public void getLogin() throws IOException {
        int x = 1;
        do {
            try {

                data.put(9876543, 9876);
                data.put(8989898, 8989);

                System.out.println("Welcome to ATM Project! ");
                System.out.println("Ënter your Customer number : ");
                setCustomerNumber(menuInput.nextInt());

                System.out.println("Enter your pin number: ");
                setPinNumber(menuInput.nextInt());

            } catch (Exception e) {
                System.out.println("\n" + "Invalid character(s).only numbers." + "\n");
                x = 2;
            }


            for(Map.Entry<Integer, Integer> entry : data. entrySet()){
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) ;
                {
                    getAccountType();
                }
            }
        } while (x == 1);
    }
        public void getAccountType()
        {
            System.out.println("Select the Account you want to access: ");
            System.out.println("Type 1- Checking Account ");
            System.out.println("TYep 2- Saving Account");
            System.out.println("Type 3- EXIT");

            System.out.println("Choice: ");
          selection =menuInput.nextInt();

            switch(selection){
                case 1:
                    getChecking();
                    break;
                case 2:
                    getSaving();
                    break;
                case 3:
                    System.out.println("Thank you for using this ATM, bye.");
                    break;
                default:
                    System.out.println("\n"+"Invalid Choice!"+"\n");
                    getAccountType();
            }
        }

        /* Display Checking Account Menu with selection */
        public void getChecking()
         {
            System.out.println("Checking Account : ");
            System.out.println("Type 1- view balance");
            System.out.println("Type 2 - Withdraw funds");
            System.out.println("Type 3 - Deposit Funds");
            System.out.println("Type 4 - Exit");
            System.out.println("Choice : ");

            selection=menuInput.nextInt();

            switch(selection)
            {
                case 1:
                    System.out.println("checking account balance : "+moneyFormat.format(getCheckingBalance()));
                    getAccountType();
                    break;
                case 2:
                    getCheckingWithdrawInput();
                    getAccountType();
                    break;
                case 3:
                    getCheckingDepositInput();
                    getAccountType();
                    break;
                case 4:
                    System.out.println("Thank you for using this ATM! ");
                    break;
                default:
                    System.out.println("\n"+"Invalid choice."+"\n");
                    getChecking();

            }
        }

        /* Display saving account with selections */

        public void getSaving()
        {
            System.out.println("Saving Account: ");
            System.out.println("Type 1- view balance");
            System.out.println("Type 2- Withdraw funds");
            System.out.println("Type 3- Deposit funds");
            System.out.println("Type 4- Exit");
            System.out.println("Choice: ");

            selection= menuInput.nextInt();

            switch(selection)
            {
                case 1:
                    System.out.println("Saving Account Balance :"+ moneyFormat.format(getSavingBalanace()));
                    getAccountType();
                    break;
                case 2:
                    getSavingWithdrawInput();
                    getAccountType();
                    break;
                case 3:
                    getSavingDepositInput();
                    getAccountType();
                    break;
                default:
                    System.out.println("\n"+"Invalid choice."+"\n");
                    getSaving();

            }
        }
        int selection;

    }







