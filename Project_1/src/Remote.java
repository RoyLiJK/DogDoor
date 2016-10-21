public class Remote
{
 
  private DogDoor door;

  public Remote ( DogDoor adoor ) 
  {
    door = adoor;
  }

  public void pressButton () 
  {
    System.out.println("Press the remote control button");
    
    if ( door.isOpen() ) 
    {
      door.close();
    } 
    else 
    {
      door.open();
    }
  }

}