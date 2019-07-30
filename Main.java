package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer johndoe = new Customer();  // empty constructor
        Customer Mo = new Customer(123456789, 50.00, "Muhammad", "muhammad@email.com",
                "(361) - 4256095"); // constructor with 5 parameters

        //testing pring
        //johndoe.print();
        //Mo.print();

        Scanner s = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Welcome to Dublin Bank, please make selection below:\n"+
                            "1: Print name\n" +
                            "2: Print Account Number\n" +
                            "3: Print Balance\n"+
                            "4: Print Email\n"+
                            "5: Print Phone Number\n"+
                            "6: Make a Deposit\n"+
                            "7: Withdraw money\n"+
                            "8: Exit\n"+
                            "Enter choice 1-8: ");

            int number = s.nextInt();
            s.nextLine();
            switch(number){
                case 1:
                    System.out.println("Name is:" + Mo.getName()+ "\n\n");
                    break;
                case 2:
                    System.out.println("Account number: " + Mo.getAccNumber()+ "\n\n");
                    break;
                case 3:
                    System.out.println("Current balance: " + Mo.getBalance()+ "\n\n");
                    break;
                case 4:
                    System.out.println("email address: " + Mo.getEmail()+ "\n\n");
                    break;
                case 5:
                    System.out.println("Phone number: " + Mo.getPhone()+ "\n\n");
                    break;
                case 6:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = s.nextDouble();
                    Mo.deposit(depositAmount);
                    System.out.println("Balance is updated");
                    break;
                case 7:
                    System.out.println("Enter withdraw amount: ");
                    double withdrawAmount = s.nextDouble();
                    Mo.withdraw(withdrawAmount);
                    System.out.println("Balance is updated");
                    break;
                case 8:
                    System.out.println("Thank you for banking with us, " + Mo.getName());
                    flag = false;
                    break;
            }

        }
    }
}
// test git push 3.45 pm