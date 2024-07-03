import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    private static ArrayList<Itool> itoolist = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Itools. \n 2. Show Itools \n 3. Calculate  \n 4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addItool(scanner);
                    break;
                case 2:
                    showItools();
                    break;
                case 3:
                    calculate(scanner);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }


    //funciones
    private static void addItool(Scanner scanner){
        System.out.println("Enter Itool name:");
        String itoolname = scanner.nextLine();
        System.out.println("Enter Itool amount:%");
        double amount = scanner.nextDouble();

        Itool itool = new Itool(itoolname, amount);
        itoolist.add(itool);
    }

    private static void showItools(){
        if (!itoolist.isEmpty()) {
            for(Itool itool : itoolist){
                System.out.println(itool);
            }
            return;
        }
        System.out.println("No Itools to show!");
    }

    public static void calculate(Scanner scanner){
        System.out.println("Amount to inverse: $ ");
        double uamount = scanner.nextDouble();
        
        double rtotal=0;
        for (Itool itool : itoolist) {
            double rperitool=0;
            rperitool = uamount * itool.getporcentaje()/100;
            rtotal=rtotal+rperitool;
            System.out.println("Para "+itool.getName()+" con un porcentaje de:% "+itool.getporcentaje()+" se tiene que invertir: $"+rperitool);
        }
        if((uamount-rtotal)!=0){
            System.out.println("Sobran $"+(uamount-rtotal));
        }
    }
}