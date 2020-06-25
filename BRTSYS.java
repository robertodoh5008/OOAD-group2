

public class BRTSYS{


    BRTSYS(){
        menu();
    }
    

    public void menu(){
        System.out.println("Select a choice from the following options");
        System.out.println("1. View all buses for today");
        System.out.println("2. View map for bus-routes");
        System.out.println("3. View city bustops");
        System.out.println("4. View City of Windsor map");
        //System.out.println("5. Report");
    }

    public void loadData(){

    }

    public static void main(String[] args){
        System.out.println("Welcome to The City of Windsor Bus-route system");
        new BRTSYS();
    
    }
}