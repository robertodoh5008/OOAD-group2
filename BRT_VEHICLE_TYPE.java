public abstract class BRT_VEHICLE_TYPE {

    public String transit;
    public int fare;
    public String currency;
    public int capacity;


    BRT_VEHICLE_TYPE(String transit, int  fare, String currency, int capacity){
        this.transit = transit;
        this.fare = fare;
        this.currency = currency;
        this.capacity = capacity;
    }

}
