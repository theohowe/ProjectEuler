
public class euler6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double squaresum=0, sumsquare=0;
		for (int i=0; i<=100; i++){
			squaresum+=i*i;
		}
		sumsquare = 100*101/2;
		sumsquare *= sumsquare;
		System.out.println((int)(sumsquare-squaresum));

	}

}
