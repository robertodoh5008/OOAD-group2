public class BRTBUS {

    private int bus_number;
    private int capacity;
    private String driver;
    private String speed;

    public BRTBUS(int b_num, int cap, String dri, String sp)
    {
        bus_number = b_num;
        capacity = cap;
        driver = dri;
        speed = sp;
    }

    public int getBus_number()
    {
        return bus_number;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String getDriver()
    {
        return driver;
    }

    public String getSpeed()
    {
        return speed;
    }

    public void setDriver(String dri_name)
    {
        driver = dri_name;
    }

    public String toString()
    {
        String result;
        result = "Bus Information: "+
                "\n\t\tBus number : "+bus_number+
                "\n\t\tCapacity: "+capacity+" seats"+
                "\n\t\tDriver: "+driver+
                "\n\t\tSpeed: "+speed;
        return result;
    }



}
