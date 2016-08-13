import java.text.DecimalFormat;

public class Ticket {

	private double ticketNum;

	public Ticket(double ticketNum)
	{
		this.ticketNum = ticketNum;
	}
	public double getTicketNum()
	{
		return ticketNum;
	}
	
	/*DecimalFormat df2 = new DecimalFormat( "##" );
	double dd = getTicketNum();
	double dd2dec = new Double(df2.format(dd)).doubleValue();
	*/
	@Override
	public int hashCode()
	{
		int hash = 1;
        hash = (int)ticketNum;
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (ticketNum != other.ticketNum)
			return false;
		return true;
	}
	
	public String toString()
	{
		String x ="";
		x = "Ticket number: " + getTicketNum();
		return x;
	}
	
	
}
