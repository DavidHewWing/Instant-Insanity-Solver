public class TestSolution{

	public static void main(String[] args){

		Cube c1 = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});
		Cube c2 = new Cube(new Color[] {Color.WHITE, Color.GREEN, Color.BLUE, Color.WHITE, Color.RED, Color.RED});
		Cube c3 = new Cube(new Color[] {Color.GREEN, Color.WHITE, Color.RED, Color.BLUE, Color.RED, Color.RED});
		Cube c4 = new Cube(new Color[] {Color.BLUE, Color.RED, Color.GREEN, Color.GREEN, Color.WHITE, Color.WHITE});

		Cube[] cubes1 = new Cube[] {c1, c2, c3, c4};



		Solution s1 = new Solution(cubes1);

		System.out.println("size of solution s is (should be 4): " + s1.size());

		System.out.println(s1.toString());

		System.out.println("testing if solution s is valid (should be false) : " + s1.isValid());





		System.out.println("new test----");

		Cube[] cubes2 = new Cube[] {c1};

		Solution s2= new Solution(cubes2);

		System.out.println("size of solution s is (should be 1) : " + s2.size());

		System.out.println(s2.toString());

		System.out.println("testing if solution s is valid (should be valid) : " + s2.isValid());




		System.out.println("new test----");

		Solution s3 = new Solution(s2, c2);

		System.out.println("size of solution s is (should be 2): " + s3.size());

		System.out.println(s3.toString());

		System.out.println("testing if solution s is valid (should be false) : " + s3.isValid());




		System.out.println("new test----");

		Cube[] cubes3 = new Cube[] {c2, c4};

		Solution s4 = new Solution(cubes3);

		System.out.println("size of solution s is (should be 2): " + s4.size());

		System.out.println(s4.toString());

		System.out.println("testing if solution s is valid (should be true) : " + s4.isValid());







		









	}
	




}