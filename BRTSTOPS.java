public class BRTSTOPS {

    private int stop_id;
    private int stop_code;
    private String stop_name;
    private String stop_desc;
    private double stop_lat;
    private double stop_lon;
    private int zone_id;
    private String stop_url;
    private int location_type;
    private int parent_station;
    private int wheelchair_boarding;

    BRTSTOPS(int stop_id, int stop_code, String stop_name, String stop_desc, double stop_lat, double stop_lon, int zone_id, String stop_url, int location_type, int parent_station, int wheelchair_boarding){

        this.stop_id = stop_id;
        this.stop_code = stop_code;
        this.stop_name = stop_name;
        this.stop_desc = stop_desc;
        this.stop_lat = stop_lat;
        this.stop_lon = stop_lon;
        this.zone_id = zone_id;
        this.stop_url = stop_url;
        this.location_type = location_type;
        this.parent_station = parent_station;
        this.wheelchair_boarding = wheelchair_boarding;
    }
}
