import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	private static ArrayList<Alumn> alumni = new ArrayList<>();

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.println("1. Add Alumn");
			System.out.println("2. Show Alumni");
			System.out.println("3. Delete Alumn");
			System.out.println("4. Exit");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice){
				case 1:
					addAlumn(scanner);
					break;
				case 2:
					showAlumni();
					break;
				case 3:
					deleteAlumn(scanner);
					break;
				case 4:
					System.out.println("Exiting......");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice, please try again.");
		}
	}
}

private static void addAlumn(Scanner scanner){
	System.out.println("Enter name:");
	String name = scanner.nextLine();
	System.out.println("Enter lastname:");
	String lastname = scanner.nextLine();
	System.out.println("Enter No.Control:");
	String noControl = scanner.nextLine();
	System.out.println("Enter GESC:");
	String gesc = scanner.nextLine();

	Alumn alumn = new Alumn(name, lastname, noControl, gesc);
	alumni.add(alumn);
	alumn.inscribirse();
}

private static void showAlumni(){
	if(alumni.isEmpty()){
		System.out.println("No alumn to show.");
	} else {
	  for (Alumn alumn : alumni){
		System.out.println(alumn);
	}
	}
}

private static void deleteAlumn(Scanner scanner){
	System.out.println("Enter No.Control of the alumn to delete:");
	String noControl = scanner.nextLine();

	Alumn toDelete = null;
	for (Alumn alumn : alumni){
		if (alumn.getNoControl().equals(noControl)){
		toDelete = alumn;
		break;
		}
	}
	if (toDelete != null){
		toDelete.darseDeBaja();
		alumni.remove(toDelete);
		System.out.println("Alumn deleted succesfully.");
	} else {
		System.out.println("Alumn not found.");
		}
}



}

