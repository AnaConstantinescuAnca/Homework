package org.fasttrack.exercise1;

public class Facebook implements Advertisement {
    public static final String Name = "facebook";

    private int number = 11;

    @Override
    public String getTypeAdvertisement() {
        return Name;
    }

    public int numberAdvertisementOnWeek() {
        for (int i = 1; i <= 7; i++) {
            number= number*i;
        }
        return number;
    }


}
