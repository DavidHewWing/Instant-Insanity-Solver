public class TestCube{

	public static void main(String[] args){

		Cube c;

		c = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});

		System.out.println("blue : " + c.getUp());
		System.out.println("green : " + c.getFront());
		System.out.println("white : " + c.getRight());
		System.out.println("green : " + c.getBack());
		System.out.println("blue : " + c.getLeft());
		System.out.println("red : " + c.getDown());

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

		c1.next();
		c1.next();
		System.out.println("c is : " + c);
		System.out.println("c1 is : " + c1);

		System.out.println("testing exception");
		c = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE});

		System.out.println(c);




		}

}


