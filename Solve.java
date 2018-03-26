public class Solve{

	private static Cube firstCube = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});
	private static Cube secondCube = new Cube(new Color[] {Color.WHITE, Color.GREEN, Color.BLUE, Color.WHITE, Color.RED, Color.RED});
	private static Cube thirdCube = new Cube(new Color[] {Color.GREEN, Color.WHITE, Color.RED, Color.BLUE, Color.RED, Color.RED});
	private static Cube fourthCube = new Cube(new Color[] {Color.BLUE, Color.RED, Color.GREEN, Color.GREEN, Color.WHITE, Color.WHITE});
	private static Cube[] cubes = {firstCube, secondCube, thirdCube, fourthCube};


	public static Queue<Solution> generateAndTest(){



	}

	public static Queue<Solution> breadthFirstSearch(){

		Queue<Solution> open = new LinkedQueue<Solution>();
		Queue<Solution> solution = new LinkedQueue<Solution>();



		while (firstCube.hasNext()){
			
			firstCube.next();
			Cube cubey = new Cube(new Color[] {firstCube.getUp(), firstCube.getFront(), firstCube.getRight(), firstCube.getBack(), firstCube.getLeft(), firstCube.getDown()});
			Solution tempSol = new Solution(new Cube[] {cubey});
			open.enqueue(tempSol);
		}
		int counter = 0;
		while(!(open.isEmpty())){
			for(int k = 1; k < 4; k++ ){
				cubes[k].reset();
			}
			Solution current = open.dequeue();
<<<<<<< HEAD
			for(int i = 1; i < cubes.length; i++){
				counter = 0;
=======
			current.resetNumberOfCalls();
			for(int i = 1; i < 4; i++){
>>>>>>> 3fe23b0cd9f770e576c1f36e61cc819126ec9eda
				for(int j = 0; j < 24; j++){
					counter++;
					System.out.println(counter);
					cubes[i].next();
					Cube newCube = new Cube(new Color[] {cubes[i].getUp(), cubes[i].getFront(), cubes[i].getRight(), cubes[i].getBack(), cubes[i].getLeft(), cubes[i].getDown()});
					if(current.isValid(newCube)){
						if(current.size() == 4){
							solution.enqueue(current);
						}else{
							Solution sol = new Solution(current, newCube);
							open.enqueue(sol);
						}
					}

				}

			}

		}
		System.out.println("Number of Calls: " + solution.front.getNumberOfCalls());

		return solution;	
	}

	public static void main (String args[]){
<<<<<<< HEAD
	
=======
		StudentInfo.display();

		long start, stop;

		/* System.out.println("generateAndTest:");
		start = System.currentTimeMillis(); //could also use nanoTime

		generateAndTest();

		stop = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (stop-start) + "milliseconds");
		*/

		System.out.println("breadthFirstSearch:");
		start = System.currentTimeMillis();

		breadthFirstSearch();

		stop = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (stop-start) + "milliseconds");

>>>>>>> 8773143678aa570fb17c956d26e646565acd0263
	}
}