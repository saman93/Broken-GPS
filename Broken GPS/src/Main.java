/*
 * r = 4*Math.random()
 * 0<=r<1 => y+5 North
 * 1<=r<2 => x+5 East
 * 2<=r<3 => y-5 South
 * 3<=r<4 => x-5 West
 * d = x^2 + y^2
 * Print: Math.sqrt(d)
 */


public class Main {

	public static void main(String[] args) {
		
		int x=0;
		int y=0;
		
		for(int i=0; i<12; i++){
			
			double r = 4*Math.random();
			
			if(r>=0 && r<1){
				y+=5;
				System.out.println("North");
			}
			if(r>=1 && r<2){
				x+=5;
				System.out.println("East");
			}
			if(r>=2 && r<3){
				y-=5;
				System.out.println("South");
			}
			if(r>=3 && r<4){
				x-=5;
				System.out.println("West");
			}
			System.out.println("X="+ x);
			System.out.println("Y="+ y);
			System.out.println("___");
			
		}
		
		double d = Math.pow(x, 2) + Math.pow(y, 2);
		System.out.println("The distance from the initial point is: "+ Math.sqrt(d) + " Miles");

	}

}
