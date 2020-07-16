import java.util.Scanner;

public class BRTSYS{

    Scanner scan = new Scanner(System.in);
    win_map m;

    BRTSYS(){
        menu();
        choice(scan.nextInt());
    }
    

    public void menu(){
        System.out.println("Select a choice from the following options");
        System.out.println("1. View all buses for today");
        System.out.println("2. View map for bus-routes");
        System.out.println("3. View city bus-stops");
        System.out.println("4. View City of Windsor map");
        //System.out.println("5. Report");
    }

    public void choice(int i){
        switch(i){
            case 1:
                ;
            case 2:
                ;
            case 3:
                ;
            case 4:
                showMap();
        }
    }

    public void loadData(){

    }

    public void showMap(){
        m = new win_map();
    }

    public static void main(String[] args){
        System.out.println("Welcome to The City of Windsor Bus-route system");
        new BRTSYS();
    
    }
}
