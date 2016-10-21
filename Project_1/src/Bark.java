public class Bark {
	 
	private String sound;

  @Override
  public int hashCode ()
  {
	  int hash =  sound.hashCode();
	  return hash;
  }

	
  @Override
  public boolean equals ( Object obj )
  {
	  if ( this == obj ) return true;
	  if ( obj == null ) return false;
	  if ( !(obj instanceof Bark) ) return false;
	  Bark other = (Bark) obj;
	  if ( sound == null )
	  {
		  if ( other.sound != null ) return false;
	  } 
	  else if ( !sound.equals(other.sound) ) return false;
	  return true;
  }

  public String toString()
  {
  	return sound;
  }
	
  public Bark ( String asound )
  {
	  super();
	  sound = asound;
  }

	
	public String getSound ()
	{
		return sound;
	}
	

}