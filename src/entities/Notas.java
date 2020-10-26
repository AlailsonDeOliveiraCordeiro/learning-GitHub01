package entities;

public class Notas {
		public String name;
		public double n1;
		public double n2;
		public double n3;
		
		public double fim() {
			return n1 + n2 + n3;
		}
	
		public double PassFailed() {
			 if (fim() < 60) {
				return 60 - fim();
			} else 
				return 0;			
		}
		
	
}
