public class TestCube{

	public static void main(String[] args){

		Cube c;

		c = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});

		c.reset();

		while (c.hasNext()){
			
			c.next();
			System.out.println(c);



		}

		System.out.println("reset:");
		c.reset();
		
		while(c.hasNext()){

			c.next();

			System.out.println(c);

		}





		}


}


