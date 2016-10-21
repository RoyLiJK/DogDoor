
import java.util.Random;

public class Demo {
	 

	public static void main ( String[] args )
	{
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		Random random = new Random();
		int x = random.nextInt(4000) + 6000;
		BarkRecognizer barkRecog = new BarkRecognizer(door);
		door.addAllowedBark(new Bark("Woof"));

		System.out.println("Muppy wants to go outside");
		remote.pressButton();

		System.out.println("\nMuppy has gone outside, door will be automatically close in 2 second");
		
		try 
		{
			Thread.sleep(random.nextInt(x));
		}
		catch ( InterruptedException e ) {System.out.println("something wrong");}

		System.out.println("\nA dog Barks near our door");
		barkRecog.recognize(new Bark("woot~~~"));
		
		
		System.out.println("\nMuppy had enough fun");
		
		if ( !door.isOpen() ) 
		{
			System.out.println("Muppy barks to come inside");
			barkRecog.recognize(new Bark("Woof"));
		}

		System.out.println("\nMuppy found it's way back inside");
	}
}