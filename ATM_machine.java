package intershiptasks;

import java.util.Scanner;

public class ATM_machine {
    public static void main(String[] args) {

        int balance = 10000;
        int withdraw = 0;
        int deposit = 0;

        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("....Welcome....");
        System.out.println("....................................");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        System.out.println("Choose any one option...............");

        int option = sc.nextInt();

        switch(option) {
            case 1:
                System.out.println("Enter withdraw Amount");
                System.out.println("....................................");
                withdraw = sc.nextInt();
                if (balance < withdraw) {
                    System.out.println("Insufficient balance");

                } else {
                    balance -= withdraw;
                    System.out.println("successfully withdrawn");
                    System.out.println("....................................");
                }
                break;

            case 2:
                System.out.println("Enter deposit amount");
                deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Successfully Deposited");
                System.out.println("....................................");
                break;

            case 3:
                System.out.println("Your Account Balance is:" + balance);
                break;

            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Please Enter Correct option");


          }

        }


    }

}
