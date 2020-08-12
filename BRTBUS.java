/**
BRTBUS class to handle a type of vehicle(bus) owned by the agency 
*/

public class BRTBUS extends BRT_VEHICLE_TYPE{

    private int bus_id;
    private int driver_id;


    public BRTBUS(int bus_id, int capacity, int driver_id, String transit, int fare, String currency)
    {
        super(transit, fare, currency, capacity);
        this.bus_id = bus_id;
        this.driver_id = driver_id;
    }

    public int getBus_id()
    {
        return this.bus_id;
    }

    public int getDriver()
    {
        return this.driver_id;
    }

    public void setDriver(int driver_id)
    {
        this.driver_id = driver_id;
    }

    @Override
    public String toString() {
        return "BRTBUS{" +
                "bus_id=" + bus_id +
                ", driver_id=" + driver_id +
                ", transit='" + transit + '\'' +
                ", fare=" + fare +
                ", currency='" + currency + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
