package org.fasttrack.exercise2;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Person {

     private BankProvider bankProvider;

   public Person(BankProvider bankProvider){
       this.bankProvider=bankProvider;
   }

    public static void main(String[] args) {
        Person persoana   = new Person(new BRD());
        System.out.println(persoana.bankProvider.getNameBank());
        System.out.println(persoana.bankProvider.getDepositMoney());

        System.out.println(persoana.bankProvider.getWithdrawMoney());
    }



}
