import java.util.Scanner;

public class Demo {

public static void main(String[] args)
	{
		ParkingLotOwner Roy = new ParkingLotOwner("Roy");
		ParkingLot ParkingLot = new ParkingLot(10,Roy);
		Scanner k = new Scanner(System.in);
		Scanner ky = new Scanner(System.in);
		int m = 0;
		double z = 0;
		while(true)
		{
			
			System.out.println("\nWelcome, what is your business here?"
					+ "\n1. Park the car."
					+ "\n2. Unpark the car."
					+ "\n3. Space available."
					+ "\n4. Show all cars."
					+ "\n5. Exit.");
			
			m = k.nextInt();
			
		if(m < 1 || m > 5)
					{
							System.out.println("Error! out of bound, please select again: ");
							m = k.nextInt();
					}
		
		if(m == 1){
					System.out.println("Please enter name for your car: ");
					System.out.println();
					Car car = new Car(ky.nextLine());
					
					ParkingLot.parkCar(car);
					continue;
				  }
		if(m == 2){
					System.out.println("Please enter the ticket number: ");
					System.out.println();
					z =  k.nextDouble();
					Ticket newTicket = new Ticket(z);
					ParkingLot.unparkCar(newTicket);
					continue;
				}
		if(m == 3){
					System.out.println("total 10 parking space. currently space taken: " + ParkingLot.getNumberOfCarsParked());
					continue;
					}
		
		if(m == 4){
					ParkingLot.showAllCar();
					continue;
					}
		
		if(m == 5){
					System.out.println("Good Bye!");
					break;
					}
		
			
		}
	}
}