public class BarkRecognizer
{
 
  private DogDoor door;

  public BarkRecognizer ( DogDoor adoor ) 
  {
    door = adoor;
  }
	
  public void recognize ( Bark bark )
  {
    System.out.println("\nBarkRecognizer: Heard the bark: '"+bark.toString()+"'");
    
    if (door.isAllowedBark(bark))
    {
    	door.open();
    }
    else if (door.isAllowedBark(bark) == false)
    {
    	System.out.println("\nNot Muppy ");
    	door.close();
    }
  }
}