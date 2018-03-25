public class TestSolution{

	public static void main(String[] args){

		Cube c1 = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});
		Cube c2 = new Cube(new Color[] {Color.WHITE, Color.GREEN, Color.BLUE, Color.WHITE, Color.RED, Color.RED});
		Cube c3 = new Cube(new Color[] {Color.GREEN, Color.WHITE, Color.RED, Color.BLUE, Color.RED, Color.RED});
		Cube c4 = new Cube(new Color[] {Color.BLUE, Color.RED, Color.GREEN, Color.GREEN, Color.WHITE, Color.WHITE});

		Cube[] cubes = new Cube[] {c1, c2, c3, c4};



		Solution s = new Solution(cubes);

		System.out.println("size of solution s is : " + s.size());

		System.out.println(s.toString());





	}
	




}