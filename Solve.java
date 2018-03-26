public class Solve extends LinkedQueue{

	private static Cube firstCube = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});
	private static Cube secondCube = new Cube(new Color[] {Color.WHITE, Color.GREEN, Color.BLUE, Color.WHITE, Color.RED, Color.RED});
	private static Cube thirdCube = new Cube(new Color[] {Color.GREEN, Color.WHITE, Color.RED, Color.BLUE, Color.RED, Color.RED});
	private static Cube fourthCube = new Cube(new Color[] {Color.BLUE, Color.RED, Color.GREEN, Color.GREEN, Color.WHITE, Color.WHITE});
	private static Cube[] cubes = {firstCube, secondCube, thirdCube, fourthCube};

	private static int size = 0;
	private static Solution[] array = new Solution[8];

	public static Queue<Solution> generateAndTest(){

		Queue<Solution> solution = new LinkedQueue<Solution>();

		Solution sol = new Solution(cubes);

		sol.resetNumberOfCalls();

		for (int i=0; i<24; i++){

			if (cubes[0].hasNext()){

				cubes[0].next();
			}
			for (int k=0; k<24; k++){

				if(cubes[1].hasNext()){

					cubes[1].next();
				}

				for (int j=0; j<24; j++){

					if (cubes[2].hasNext()){

						cubes[2].next();
					}

					for (int p=0; p<24; p++){

						if (cubes[3].hasNext()){

							cubes[3].next();
						}

						sol = new Solution(cubes);

						if (sol.isValid()){

							Cube[] copy = {cubes[0].copy(), cubes[1].copy(), cubes[2].copy(), cubes[3].copy()};

							Solution tempSol = new Solution(copy);

							for (int q = 0; q<array.length; q++){

								if (array[q] == tempSol){

									;
								}

								else if (size ==8){
									;
								}

								else{

									array[size] = tempSol;
									size++;
									System.out.println("yes");
									solution.enqueue(sol);



								}
							}


						}
					}
				}


			}

		}

		System.out.println("Number of calls: " + sol.getNumberOfCalls());
		System.out.println("Number of solutions : " + solution.size());

		return solution;

	}


	



/*
	public static Queue<Solution> breadthFirstSearch(){

		Queue<Solution> open = new LinkedQueue<Solution>();
		Queue<Solution> solution = new LinkedQueue<Solution>();



		while (firstCube.hasNext()){
			
			firstCube.next();
			Cube cubey = cubey.copy();
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
						if(current.size() == 4){
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

		*/

	public static void main (String args[]){

		StudentInfo.display();

		long start, stop;

		 System.out.println("generateAndTest:");
		start = System.currentTimeMillis(); //could also use nanoTime

		generateAndTest();

		stop = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (stop-start) + "milliseconds");
		/*

		System.out.println("breadthFirstSearch:");
		start = System.currentTimeMillis();

		breadthFirstSearch();

		stop = System.currentTimeMillis();
		System.out.println("Elapsed time: " + (stop-start) + "milliseconds");

		*/

	}
}