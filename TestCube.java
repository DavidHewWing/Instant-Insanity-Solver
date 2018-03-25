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

		System.out.println("Testing deep copy");

		Cube c1 = new Cube(c);

		System.out.println("c is : " + c);
		System.out.println("c1 is : " + c1);

		c1.setUp(Color.GREEN);
		c1.setFront(Color.GREEN);
		c1.setRight(Color.GREEN);
		c1.setBack(Color.GREEN);
		c1.setLeft(Color.GREEN);
		c1.setDown(Color.GREEN);
		System.out.println("c is : " + c);
		System.out.println("c1 is : " + c1);




		}

}


