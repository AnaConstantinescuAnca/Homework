package org.fasttrack.exercise1;

public class Email implements Advertisement {
    public static final String Name = "email";
    private int number = 1;

    @Override
    public String getTypeAdvertisement() {
        return Name;
    }

    @Override
    public int numberAdvertisementOnWeek() {
        for (int i = 1; i <= 7; i++) {
            number = number*2;
        }
        return number;
    }

}
