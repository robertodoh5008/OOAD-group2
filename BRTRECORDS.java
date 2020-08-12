import java.io.*;
import java.util.*;

public class BRTRECORDS implements ROUTETEMPLATE{

    public ROUTELIST route;

    BRTRECORDS(int type){

        if(type == 2){
            route = new ROUTELIST();
            route.loadList();
        }

    }


}
