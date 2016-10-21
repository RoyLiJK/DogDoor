import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor 
{
 
  private boolean open;
  private ArrayList<Bark> allowedBarks;

  public DogDoor ()
  {
    open = false;
    allowedBarks = new ArrayList<Bark>();
  }
  
  public void addAllowedBark(Bark bark) 
  {
  	allowedBarks.add(bark);
  }
  
  public boolean isAllowedBark(Bark bark)
  {
  	return allowedBarks.contains(bark);
  }

  public void open ()
  {
    System.out.println("The dog door opens.");
    
    open = true;
    		
    final Timer timer = new Timer();
		
    timer.schedule(new TimerTask()
		{
			public void run () 
			{
				close();
				timer.cancel();
			}
		}
		,2000);
  }

  public void close () 
  {
    System.out.println("The dog door closes.");
    open = false;
  }

  public boolean isOpen () 
  {
    return open;
  }

}