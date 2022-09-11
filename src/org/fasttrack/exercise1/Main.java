package org.fasttrack.exercise1;

public class Main {
    public static void main(String[] args) {

        Company company = new Company(new Facebook(), "My company");

       // company.sendNumberAdvertisement();
        company.reportSend();

        Company company1 = new Company(new Print(), "My Company");
      //  company1.sendNumberAdvertisement();
        company1.reportSend();

        Company company2 = new Company(new Email(),"My Company");
        company2.reportSend();

    }
}
