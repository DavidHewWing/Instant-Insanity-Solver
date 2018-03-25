public class Solution{

	private Cube[] cubes;
	private boolean valid;
	private int isValidCallCounter;


	public Solution(Cube[] cubes) throws IllegalStateException{

		if (0>cubes.length || cubes.length>4){

			throw new IllegalStateException("Size of array cubes is invalid");
		}

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



	public Solution(Solution other, Cube c) throws IllegalStateException{

		if (c==null){

			throw new IllegalStateException("Null is not a valid value for cube");
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

		return cubes.length;

	}

	public Cube getCube(int pos){

		return cubes[pos];

	}

	public boolean isValid(){

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



		for(int i = 0; i < this.cubes.length; i++){
			tempLeft[i] = this.cubes[i].getLeft();
			tempRight[i] = this.cubes[i].getRight();
			tempFront[i] = this.cubes[i].getFront();
			tempBack[i] = this.cubes[i].getBack();
		}

		//check the sides
		for(int j = 0; j < this.cubes.length; j++){
			for(int k = 0; k < this.cubes.length; k++){
				if(tempLeft[j] == tempLeft[k]){
					valid=false;
					return false;
				}else if(tempRight[j] == tempRight[k]){
					valid=false;
					return false;
				}else if(tempFront[j] == tempFront[k]){
					valid=false;
					return false;
				}else if(tempBack[j] == tempBack[k]){
					valid=false;
					return false;
				}
			}
		}

		valid = true;
		return true;

	}

	public boolean isValid(Cube next){

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