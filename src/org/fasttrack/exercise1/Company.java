package org.fasttrack.exercise1;

public class Company {
    private String name ;
    private String countryAddress ;
    private int numberEmployees;

   private Advertisement advertisement;

    public Company(Advertisement advertisement, String name){
        this.advertisement=advertisement;
        this.name = name;
    }

   /* public void sendNumberAdvertisement(){
        System.out.println(String.format("Prin %s s-au transmis saptamanal un nr de %d reclame ",
                advertisement.getTypeAdvertisement(), advertisement.numberAdvertisementOnWeek()));
        //return null;
    }*/

    public void reportSend(){
        System.out.println(String.format("Pentru compania %s s-au transmis %d reclame prin %s",
                this.name, advertisement.numberAdvertisementOnWeek(),advertisement.getTypeAdvertisement()));
    }


}
