public class Cube{

	private Color up; //index 0 
	private Color front; //index 1
	private Color right; //index 2
	private Color back; //index 3
	private Color left; //index 4
	private Color down; //index 5
	private Color[] initColors = new Color[6];



	public Cube(Color[] faces){
		up = faces[0];
		front = faces[1];
		right = faces[2];
		back = faces[3];
		left = faces[4];
		down = faces[5];
		for(int i = 0; i < 6; i++){
			intiColors[i] = faces[i];
		}
	}

	public Color getUp(){
		return up;
	}

	public Color getFront(){
		return front;
	}
	
	public Color getRight(){
		return right;
	}
	
	public Color getBack(){
		return back;
	}
	
	public Color getLeft(){
		return left;	
	}
	
	public Color getDown(){
		return down;
	}

	public String toString(){
		return "[" + this.up + ", " + this.front + ", " + this.right + ", "+ this.back + ", "+ this.left + ", "+ this.down + "]";
	}

	public void Rotate(){

		Color tempFront = this.front;
		Color tempRight = this.right;
		Color tempBack = this.back;
		Color tempLeft = this.left;

		this.front = tempLeft;
		this.right = tempFront;
		this.back = tempRight;
		this.left = tempBack;


	}


	public void RightRoll(){
		
		Color tempUp = this.up;
		Color tempDown = this.down;
		Color tempRight = this.right;
		Color tempLeft = this.left;

		this.right = tempUp;
		this.down = tempRight
		this.up = tempLeft;
		this.left = tempDown;
	}

	public void LeftRoll(){

		Color tempUp = this.up;
		Color tempDown = this.down;
		Color tempRight = this.right;
		Color tempLeft = this.left;

		this.right = tempDown;
		this.down = tempLeft;
		this.up = tempRight;
		this.left = tempUp;
	}

	public void Identity(){

		this.up = initFaces[0];
		this.front = initFaces[1];
		this.right = initFaces[2];
		this.back = initFaces[3];
		this.left = initFaces[4];
		this.down = initFaces[5];

	}

}