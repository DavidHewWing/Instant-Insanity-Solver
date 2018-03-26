public class Solve{

	private static Cube firstCube = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});
	private static Cube secondCube = new Cube(new Color[] {Color.WHITE, Color.GREEN, Color.BLUE, Color.WHITE, Color.RED, Color.RED});
	private static Cube thirdCube = new Cube(new Color[] {Color.GREEN, Color.WHITE, Color.RED, Color.BLUE, Color.RED, Color.RED});
	private static Cube fourthCube = new Cube(new Color[] {Color.BLUE, Color.RED, Color.GREEN, Color.GREEN, Color.WHITE, Color.WHITE});
	private static Cube[] cubes = {firstCube, secondCube, thirdCube, fourthCube};


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
			current.resetNumberOfCalls();
			for(int i = 1; i < 4; i++){
				counter = 0;
				for(int j = 0; j < 24; j++){
					counter++;
					cubes[i].next();
					Cube newCube = cubes[i].copy();
					Solution newSol = new Solution(current, newCube);
					if(newSol.isValid()){
						if(current.size() == 5){
							System.out.println("sol found");
							solution.enqueue(current);
							System.out.println("Number of Calls: " + current.getNumberOfCalls());
						}else{
							Solution sol = new Solution(current, newCube);
							open.enqueue(sol);
					
						}
					}

				}

			}

		}

		

		return solution;	

		}

	public static void main (String args[]){

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

	}
}