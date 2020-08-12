import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ROUTELIST implements ROUTETEMPLATE{

    ArrayList<BRTROUTES> routeList;

    ROUTELIST(){
        routeList = new ArrayList<>();
    }

    public void loadList(){

        try {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            while((line = br.readLine()) != null){
                if(line.contains("route_short_name")) continue;
                if(line.trim().length() == 0) continue;
                routeList.add(new BRTROUTES(line));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(BRTROUTES r : routeList){
            System.out.println(r);
        }

    }
}
