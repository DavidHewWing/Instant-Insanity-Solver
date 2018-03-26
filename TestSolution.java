public class TestSolution{

	public static void main(String[] args){

		Cube c1 = new Cube(new Color[] {Color.BLUE, Color.GREEN, Color.WHITE, Color.GREEN, Color.BLUE, Color.RED});
		Cube c2 = new Cube(new Color[] {Color.WHITE, Color.GREEN, Color.BLUE, Color.WHITE, Color.RED, Color.RED});
		Cube c3 = new Cube(new Color[] {Color.GREEN, Color.WHITE, Color.RED, Color.BLUE, Color.RED, Color.RED});
		Cube c4 = new Cube(new Color[] {Color.BLUE, Color.RED, Color.GREEN, Color.GREEN, Color.WHITE, Color.WHITE});


		System.out.println("----Solution(Cube[] cubes) Testing---");

		System.out.println("\nnew test---- [c1,c2,c3,c4]");
		Cube[] cubes1 = new Cube[] {c1, c2, c3, c4};
		Solution s1 = new Solution(cubes1);
		System.out.println("size of solution s is (should be 4): " + s1.size());
		System.out.println(s1.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s1.isValid());

		System.out.println("\nnew test---- [c1,c2,c3]");
		Cube[] cubes2 = new Cube[] {c1, c2, c3};
		Solution s2 = new Solution(cubes2);
		System.out.println("size of solution s is (should be 3): " + s2.size());
		System.out.println(s2.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s2.isValid());


		System.out.println("\n new test---- [c1,c2]");
		Cube[] cubes3 = new Cube[] {c1, c2};
		Solution s3 = new Solution(cubes3);
		System.out.println("size of solution s is (should be 3): " + s3.size());
		System.out.println(s3.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s3.isValid());


		System.out.println("\n new test---- [c1]");
		Cube[] cubes4 = new Cube[] {c1};
		Solution s4 = new Solution(cubes4);
		System.out.println("size of solution s is (should be 1): " + s4.size());
		System.out.println(s4.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s4.isValid());


		System.out.println("\n new test---- [c1,c3]");
		Cube[] cubes5 = new Cube[] {c1, c3};
		Solution s5 = new Solution(cubes5);
		System.out.println("size of solution s is (should be 3): " + s5.size());
		System.out.println(s5.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s5.isValid());


		System.out.println("\n-----isvalid(next) TESTING USING Solution(Cube[] cubes)---");
		System.out.println("\n new test---- [c1]");
		Cube[] cubes6 = new Cube[] {c1};
		Solution s6 = new Solution(cubes6);
		System.out.println("size of solution s is (should be 1): " + s6.size());
		System.out.println(s6.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s6.isValid());
		System.out.println("testing ISVALID(NEXT) (should be true) [c1,c3] : " + s6.isValid(c3));
		System.out.println("testing ISVALID(NEXT) (should be false) [c1,c2] : " + s6.isValid(c2));

		System.out.println("\nnew test---- [c1,c2,c3]");
		Cube[] cubes7 = new Cube[] {c1, c2, c3};
		Solution s7 = new Solution(cubes7);
		System.out.println("size of solution s is (should be 3): " + s7.size());
		System.out.println(s7.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s7.isValid());
		System.out.println("testing ISVALID(NEXT) (should be false) [c1,c2,c3,c4] : " + s7.isValid(c4));




		System.out.println("\n\n----Solution(Solution other, Cube c) Testing---");
		System.out.println("\nnew test---- initial - [c1,c2,c3] after construtor - [c1,c2,c3,c4]");
		Cube[] cubes8 = new Cube[] {c1, c2, c3};
		Solution s8 = new Solution(cubes8);
		System.out.println("size of solution s is (should be 3): " + s8.size());
		System.out.println(s8.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s8.isValid());

		System.out.println("TESTING USE OF CONSTRUCTOR");
		Solution s9 = new Solution(s8, c4);
		System.out.println("size of solution s is (should be 4): " + s9.size());
		System.out.println(s9.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s9.isValid());



		System.out.println("\nnew test---- initial - [c1] after construtor - [c1,c3]");
		Cube[] cubes9 = new Cube[] {c1};
		Solution s10 = new Solution(cubes9);
		System.out.println("size of solution s is (should be 1): " + s10.size());
		System.out.println(s10.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s10.isValid());

		System.out.println("TESTING USE OF CONSTRUCTOR");
		Solution s11 = new Solution(s10, c3);
		System.out.println("size of solution s is (should be 2): " + s11.size());
		System.out.println(s11.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s11.isValid());


		System.out.println("\nnew test---- initial - [c1] after construtor - [c1,c2]");
		Cube[] cubes10 = new Cube[] {c1};
		Solution s12 = new Solution(cubes10);
		System.out.println("size of solution s is (should be 1): " + s12.size());
		System.out.println(s12.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s12.isValid());

		System.out.println("TESTING USE OF CONSTRUCTOR");
		Solution s13 = new Solution(s12, c2);
		System.out.println("size of solution s is (should be 2): " + s13.size());
		System.out.println(s13.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s13.isValid());

		System.out.println("\n-----isvalid(next) TESTING USING Solution(Solution other, Cube c) Testing---");
		System.out.println("\nnew test---- initial - [c1,c2] after construtor - [c1,c2,c3]");
		Cube[] cubes11 = new Cube[] {c1, c2};
		Solution s14 = new Solution(cubes11);
		System.out.println("size of solution s is (should be 2): " + s14.size());
		System.out.println(s14.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s14.isValid());
		System.out.println("TESTING USE OF CONSTRUCTOR");
		Solution s15 = new Solution(s14, c3);
		System.out.println("size of solution s is (should be 3): " + s15.size());
		System.out.println(s15.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s15.isValid());
		System.out.println("testing ISVALID(NEXT) (should be FALSE) [c1, c2, c3, c4] : " + s15.isValid(c4));


		System.out.println("\n new test---- [c1] after construtor - [c1,c3]");
		Cube[] cubes12 = new Cube[] {c1};
		Solution s16 = new Solution(cubes12);
		System.out.println("size of solution s is (should be 1): " + s16.size());
		System.out.println(s16.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s16.isValid());
		System.out.println("TESTING USE OF CONSTRUCTOR");
		Solution s17 = new Solution(s16, c3);
		System.out.println("size of solution s is (should be 2): " + s17.size());
		System.out.println(s17.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s17.isValid());
		System.out.println("testing ISVALID(NEXT) (should be FALSE) [c1, c3, c2] : " + s17.isValid(c3));


		System.out.println("\n new test---- [null] after construtor - [c1]");
		Cube[] cubes13 = null;
		Solution s18 = new Solution(cubes13);
		System.out.println("size of solution s is (should be 0): " + s18.size());
		System.out.println(s18.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s18.isValid());
		System.out.println("testing ISVALID(NEXT) (should be false) [null, null] : " + s18.isValid(null));
		System.out.println("TESTING USE OF CONSTRUCTOR");
		Solution s19 = new Solution(s18, c1);
		System.out.println("size of solution s is (should be 1): " + s19.size());
		System.out.println(s19.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s19.isValid());
		System.out.println("testing ISVALID(NEXT) (should be TRUE) [c1, c3] : " + s19.isValid(c3));
		System.out.println("testing ISVALID(NEXT) (should be FALSE) [c1, c2] : " + s19.isValid(c2));
		System.out.println("testing ISVALID(NEXT) (should be false) [c1, null] : " + s19.isValid(null));



		System.out.println("---done testing-------");
		


		

		


























		/*
		System.out.println("\nnew test---- [c1,c2,c3,c4]");
		Solution s1 = new Solution(cubes1);
		System.out.println("size of solution s is (should be 4): " + s1.size());
		System.out.println(s1.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s1.isValid());

		System.out.println("\nnew test---- [c1,c2,c3,c4]");
		Cube[] cubes50 = new Cube[] {c1,c2,c3};
		Solution s50= new Solution(cubes50);
		Solution s52 = new Solution(s50, c4);
		System.out.println("size of solution s is (should be 4) : " + s52.size());
		System.out.println(s52.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s52.isValid());


		System.out.println("\nnew test---- [c1,c2,c3,c4]");
		Cube[] cubes51 = new Cube[] {c1,c2,c3};
		Solution s51= new Solution(cubes51);
		System.out.println("testing if solution s isvalid(next) (should be false) : " + s51.isValid(c4));






		System.out.println("\nnew test---- [c1]");
		Cube[] cubes2 = new Cube[] {c1};
		Solution s2= new Solution(cubes2);
		System.out.println("size of solution s is (should be 1) : " + s2.size());
		System.out.println(s2.toString());
		System.out.println("testing if solution s is valid (should be valid) : " + s2.isValid());

		System.out.println("\nnew test---- [c1,c3]");
		Cube[] cubes20 = new Cube[] {c1};
		Solution s20= new Solution(cubes20);
		System.out.println("size of solution s is (should be 1) : " + s20.size());
		System.out.println(s2.toString());
		System.out.println("testing if solution s is valid(next) (should be valid) : " + s20.isValid(c3));

		System.out.println("\nnew test---- [c1,c3]");
		Cube[] cubes25 = new Cube[] {c1,c2};
		Solution s25= new Solution(cubes25);
		System.out.println("size of solution s is (should be 1) : " + s25.size());
		System.out.println(s25.toString());
		System.out.println("testing if solution s is valid(should be valid) : " + s25.isValid());

		





		System.out.println("\nnew test---- [c1,c2]");
		Cube[] cubes15 = new Cube[] {c1, c2};
		Solution s15= new Solution(cubes15);
		System.out.println("size of solution s is (should be 2) : " + s15.size());
		System.out.println(s15.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s15.isValid());





		System.out.println("\nnew test---- SOLUTION(OTHER, C)  [C1, C2]");
		Solution s3 = new Solution(s2, c2);
		System.out.println("size of solution s is (should be 2): " + s3.size());
		System.out.println(s3.toString());
		System.out.println("testing if solution s is valid (should be false) : " + s3.isValid());




		System.out.println("\n\n\n new test---- normal constructor valid [C2, C4]");
		Cube[] cubes3 = new Cube[] {c2, c4};
		Solution s4 = new Solution(cubes3);
		System.out.println("size of solution s is (should be 2): " + s4.size());
		System.out.println(s4.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s4.isValid());

		System.out.println("\nnew test------- [C2, C4]");
		Cube[] cubes30 = new Cube[] {c2};
		Solution s30 = new Solution(cubes30);
		System.out.println("size of solution s is (should be 1): " + s30.size());
		System.out.println(s30.toString());
		System.out.println("testing isvalid(next) (should be true) : " + s30.isValid(c4));






		System.out.println("\nnew test------- [C1, C2]");
		Cube[] cubes4 = new Cube[] {c1};
		Solution s5 = new Solution(cubes4);
		System.out.println("size of solution s is (should be 1): " + s5.size());
		System.out.println(s5.toString());
		System.out.println("testing isvalid(next) (should be true) : " + s5.isValid(c2));

		System.out.println(" \n new test---- SOLUTION(OTHER, C) SHOWING DEEP COPY, [C2,C4]");
		Cube[] cubes5 = new Cube[] {c2};
		Solution s6 = new Solution(cubes5);
		System.out.println("size of solution s is (should be 1): " + s5.size());
		System.out.println(s6.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s6.isValid());

		Solution s7 = new Solution(s6, c4);
		System.out.println("size of solution s is (should be 2): " + s7.size());
		System.out.println(s7.toString());
		System.out.println("testing if solution s is valid (should be true) : " + s7.isValid());
		System.out.println("testing isvalid(next) (should be invalid) [c1,c2,c3] : " + s7.isValid(c2));

		*/





















		









	}
	




}