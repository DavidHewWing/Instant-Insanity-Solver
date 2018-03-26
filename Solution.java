public class Solution{

	private Cube[] cubes;
	private boolean valid;
	private int isValidCallCounter;


	public Solution(Cube[] cubes) throws IllegalStateException{

		if (cubes==null){

			this.cubes = null;
		}

		else if (0>cubes.length || cubes.length>4){

			throw new IllegalStateException("Size of array cubes is invalid");
		}

		else{

			for (int i = 0; i < cubes.length; i++){
				if (cubes[i] == null){

					throw new IllegalStateException("Cube cannot be null");
				}
			}

			
			this.cubes = new Cube[cubes.length];
			for(int i = 0; i < cubes.length; i++){
				this.cubes[i] = cubes[i].copy();
			}

		}

	}



	public Solution(Solution other, Cube c) throws IllegalStateException, NullPointerException{

		if (c==null){

			throw new NullPointerException("Null is not a valid value for cube");
		}

		if(other == null){

			this.cubes = new Cube[] {c.copy()};
			
		}

		else{

			if (other.size()==4){

				throw new IllegalStateException("Size of array of cubes is too large to add another cube");

			}

			else{

				this.cubes = new Cube[other.size() + 1];

				//copying cubes from other
				for (int i=0; i<other.size(); i++){

					this.cubes[i] = other.cubes[i].copy();

				}


				this.cubes[other.size()] = c.copy();


			}

		}

	}

	public int size(){

		if (this.cubes == null){

			return 0;
		}

		return cubes.length;

	}

	public Cube getCube(int pos) throws IllegalStateException{

		if (this.cubes == null){

			throw new IllegalStateException("There are no cubes in this solution");
		}

		if (0>pos || pos> cubes.length){

			throw new IllegalStateException("Value for pos is not valid");

		}

		return cubes[pos];

	}

	public boolean isValid(){

		if (this.cubes == null){

			return false;
		}


		isValidCallCounter++;

		//if there is only 1 cube in the solution, it is always valid

		if (this.size() == 1){

			valid = true;
			return true;
		}

		Color[] tempLeft = new Color[this.size()];
		Color[] tempRight = new Color[this.size()];
		Color[] tempFront = new Color[this.size()];
		Color[] tempBack = new Color[this.size()];



		for(int i = 0; i < this.size(); i++){
			
			/* error check
			System.out.println("i is: " + i);
			System.out.println("front is: " + this.cubes[i].getFront());
			System.out.println("right is : " + this.cubes[i].getRight());
			System.out.println("back is : " + this.cubes[i].getBack());
			System.out.println("left is : " + this.cubes[i].getLeft());
			*/ 

			tempFront[i] = this.cubes[i].getFront();
			tempRight[i] = this.cubes[i].getRight();
			tempBack[i] = this.cubes[i].getBack();
			tempLeft[i] = this.cubes[i].getLeft();
		}

		/* error checks

		for(int i = 0; i < tempFront.length; i++){

			System.out.println("Printing tempfront : " + tempFront[i]);

		}

		for(int i = 0; i < tempRight.length; i++){

			System.out.println("Printing tempright : " + tempRight[i]);

		}

		for(int i = 0; i < tempBack.length; i++){

			System.out.println("Printing tempBack : " + tempBack[i]);

		}

		for(int i = 0; i < tempLeft.length; i++){

			System.out.println("Printing templeft : " + tempLeft[i]);

		}

		*/

		//check the sides
		for(int i = 0; i < this.size()-1; i++){

			if (tempFront[i] == tempFront[i+1] || tempRight[i] == tempRight[i+1] || tempBack[i] == tempBack[i+1] || tempLeft[i] == tempLeft[i+1]){

				return false;
			}

		}


		valid = true;
		return true;

	}

	public boolean isValid(Cube next){

		if (this.cubes == null){


			return false;
		}

		if (next == null){


			return false;
		}

		//precondiiton: called on a valid solution

		if (valid==false){

			return false;
		}

		Solution temp = new Solution(this, next);

		if (temp.isValid()){

			return true;
		}

		return false;


	}


	public String toString(){

		if (this.cubes == null){

			return "There are no cubes in this solution";
		}


		String temp = "[";

		for(int i=0; i<this.size()-1; i++){

			temp+= cubes[i].toString() + ", ";

		}

		temp += cubes[this.size()-1].toString() + "]";

		return temp;

	}


	public int getNumberOfCalls(){

		return isValidCallCounter;
	}

	public void resetNumberOfCalls(){

		isValidCallCounter=0;
	}


}