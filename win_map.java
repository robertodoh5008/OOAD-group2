import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 *Class win_map to give user access to the map of Windsor
 */

public class win_map {
    URL url;
    public String a="https://www.google.ca/maps/place/Windsor,+ON/@42.2951067,-83.0729225,12z/data=!3m1!4b1!4m5!3m4!1s0x883b2ac1b54f886b:0xb66cd49527fcdc51!8m2!3d42.3149367!4d-83.0363633";


    public win_map(){

        try {

            //Desktop desktop = new
            Desktop.getDesktop().browse(new URL(a).toURI());
            //desktop.getDesktop();
            //desktop.browse(new URI(a));

            System.out.println("Done");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }


}
