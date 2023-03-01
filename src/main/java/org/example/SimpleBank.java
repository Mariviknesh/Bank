package org.example;

import java.util.Scanner;
import java.util.logging.*;
class SimpleBank
{
    public static void main(String[]args) {
        String name;
        int accno;
        int amt;
        int choice=0;
        Scanner mysc = new Scanner(System.in);
        Logger log=Logger.getLogger("com.api.jar");
        log.info("Enter the Account number:");
        accno=mysc.nextInt();
        log.info("Enter the Account holder name:");
        name = mysc.next();
        Bank a= new Bank(name,accno);
        while(choice!=4)
        {
            log.info("1.Deposit Amount\n");
            log.info("2.Withdraw Amount\n");
            log.info("3.View Balance\n");
            log.info("4.Exit\n");
            log.info("Enter the your choice:");
            choice=mysc.nextInt();
            if(choice==1)
            {
                log.info("Enter the Amount to be deposited:");
                amt=mysc.nextInt();
                a.deposit(amt);
            }
            else if(choice==2)
            {
                log.info("Enter the Amount to be Withdraw:");
                amt=mysc.nextInt();
                a.withdrawal(amt);
            }
            else if(choice==3)
            {
                String bal=Integer.toString(a.returnBal());
                log.info("The Balance in your Account is");
                log.info(bal);
            }
        }
        mysc.close();
    }
}