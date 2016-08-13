
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ParkingLot {

	private final int capacity;
	
	private int numberOfCarsParked;
		
	private Map<Ticket,Car> parkedCarMap = new HashMap<Ticket,Car>();	
	
	private Map<Car,Ticket> ticketMap = new HashMap<Car,Ticket>();	

	LinkedList<Car> maxSpace = new LinkedList<Car>();
	 
	
	private ParkingLotOwner owner;
	
	public ParkingLot(int capacity)
	{	
		this.capacity = capacity;
	}
	
	public ParkingLot(int capacity,ParkingLotOwner owner)
	{	
		
		this.capacity = capacity;
		this.owner=owner;	
	}

	public int getNumberOfCarsParked()
	{
		return numberOfCarsParked;
	}
	public boolean hasParkingSpace()
	{
		return numberOfCarsParked!=this.capacity;	
	}	

	public Ticket getTicket(Car car)
	{

		return ticketMap.get(car);
	}
	
	public void parkCar(Car car)
	{

		if(hasParkingSpace() && !parkedCarMap.containsValue(car) )
		{				
			Ticket newTicket = new Ticket(Math.random() * 100);
			this.parkedCarMap.put(newTicket,car);
			this.ticketMap.put(car,newTicket);
			
			maxSpace.add(car);
			numberOfCarsParked++;
			
			System.out.println("Your car " + car + " has parked, " + newTicket);
			
			
			if(!hasParkingSpace())
			{				
				owner.isNotifiedFull();
			}			
			
		}
	
	}
	
	public void unparkCar(Ticket t)
	{
		if(this.ticketMap.containsValue(t))
		{	
			Car unparkedCar = parkedCarMap.get(t);
			this.parkedCarMap.remove(getTicket(unparkedCar));
			this.ticketMap.remove(unparkedCar);
			maxSpace.remove(unparkedCar);
			numberOfCarsParked--;
			System.out.println(unparkedCar + " has been unParked, ");
		}
	}
	
	public void showAllCar()
	{
		for(int i = 0; i < numberOfCarsParked; i++)
		{
			System.out.println(maxSpace.get(i));
		}
	}
	public String toString()
	{
		String x ="";
		x = "number of car parked: " + getNumberOfCarsParked();
		return x;
	}
	
	
}