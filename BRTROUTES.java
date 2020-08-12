/**

*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;


public class BRTROUTES implements ROUTETEMPLATE{


    public Map<Integer, Handler> routes;

    public BRTROUTES(String line)
    {
        routes =  new HashMap<>();
        StringTokenizer st = new StringTokenizer(line, Delimiter);

        for(int i = 0; i < number_Labels; i++){
            routes.put(i, new Handler(type_Labels[i], labels[i], st.nextToken()));
        }

    }

    @Override
    public String toString() {

        String line = " ";
        Iterator<Integer> i = routes.keySet().iterator();
        Integer key;
        while(i.hasNext()) {
            key = i.next() ;
            line = routes.get(key).toString();
            if(line.contains("route_id")){
                System.out.println(line);
            }
            if(line.contains("route_short_name")){
                System.out.println(line);
            }
            if(line.contains("route_long_name")){
                System.out.println(line);
            }
            if(line.contains("route_desc")){
                System.out.println(line);
            }

        }
        return " ";
    }

    private class Handler{
        String type;
        String label;
        String value;
        Handler(String type, String label, String value){
            this.type = type;
            this.label = label;
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public String getType() {
            return type;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {

            return "" +
                    "" + label + " =" +
                    " " + value;

            /**if(getLabel().equalsIgnoreCase("route_id")) {
                return "" +
                        "" + label + " =" +
                        " " + value;
            }
            if(getLabel().equalsIgnoreCase("route_short_name")) {
                return "" +
                        "" + label + " =" +
                        " " + value;
            }
            if(getLabel().equalsIgnoreCase("route_long_name")) {
                return "" +
                        "" + label + " =" +
                        " " + value;
            }
            if(getLabel().equalsIgnoreCase(("route_desc"))) {
                return "" +
                        "" + label + " =" +
                        " " + value;
            }*/

        }
    }
}
