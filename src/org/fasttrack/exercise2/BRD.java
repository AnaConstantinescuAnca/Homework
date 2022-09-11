package org.fasttrack.exercise2;

public class BRD implements BankProvider {
    private static final String NAME = "BRD";
    private double money = 1000;
    private double withdrawMoney;
    private double depositMoney;

    @Override
    public String getNameBank() {
        return NAME;
    }

    @Override
    public double getWithdrawMoney() {
        if(money>=withdrawMoney){
            return money-withdrawMoney;
        }
        return 0;
    }

    @Override
    public double getDepositMoney() {
        return money+depositMoney;
    }

}
