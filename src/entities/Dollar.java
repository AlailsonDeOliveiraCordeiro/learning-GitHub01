package entities;

public class Dollar {
		public static final double IOF = 1.06;
		public static double dollar;
		public static double price;
		
		public static double converter() {
			return dollar * price * IOF; 
		}
}
