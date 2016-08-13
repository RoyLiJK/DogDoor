
public class Car {

		private String carNumber;

		public String getCarNumber()
		{
			return carNumber;
		}

		public Car(String carNumber) 
		{
			super();
			this.carNumber = carNumber;
		}

		@Override
		public int hashCode()
		{
			
			int result =  carNumber.hashCode();
			return result;
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
			Car other = (Car) obj;
			if (carNumber != other.carNumber)
				return false;
			return true;
		}
		
		public String toString()
		{
			String x ="";
			x =  getCarNumber();
			return x;
		}
		
		
	}

