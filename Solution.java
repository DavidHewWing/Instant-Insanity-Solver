public Class Solution{

	private Cubes[] cubes;

	public Solution(Cubes[] cubes){
		
		this.cubes = new Cubes[cubes.length];
		size = cubes.length;
		for(int i = 0; i < cubes.length; i++){
			this.cubes[i] = cubes[i];
		}

	}
	public Solution(Solution other, Cubes c) throw IllegalStateException{

		if(other == null){
			throw new IllegalStateException
		}

	}

	public int size(){

		return cubes.length;

	}

	public Cube getCube(int pos){

		return cubes[pos];

	}

	public boolean isValid(){

		Color[] tempLeft = new Color[this.cubes.length];
		Color[] tempRight = new Color[this.cubes.length];
		Color[] tempFront = new Color[this.cubes.length];
		Color[] tempBack = new Color[this.cubes.length];

		for(int i = 0; i < this.cubes.length; i++){
			tempLeft[i] = this.cubes[i].getLeft();
			tempRight[i] = this.cubes[i].getRight();
			tempFront[i] = this.cubes[i].getFront();
			tempBack[i] = this.cubes[i].getBack();
		}

		//check the sides
		for(int j = 0; j < this.cubes.length; j++){
			for(int k = 0; k < this.cubes.length; k+=this.cubes.length){
				if(tempLeft[j] == tempLeft[k]){
					return false;
				}else if(tempRight[j] == tempRight[k]){
					return false;
				}else if(tempFront[j] == tempFront[k]){
					return false;
				}else if(tempBack[j] == tempBack[k]){
					return false;
				}
			}
		}

		return true;

	}


}