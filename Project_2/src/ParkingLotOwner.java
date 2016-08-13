public class ParkingLotOwner {

	private  String ownerName;	

	
	public ParkingLotOwner(String ownerName)
	{
		this.ownerName = ownerName;
	}
	
	private  boolean isParkingLotFull = false;
	
	public  boolean isNotifiedFull()
	{
		isParkingLotFull=true;
		System.out.println("\nNo more parking space.");
		return isParkingLotFull;
	}
	
	public void isNotifiedFreeAgain()
	{
		System.out.println("There are space free.");
	}

}
