
public class euler16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1};
		int sum=0;
		for (int i=1; i<=1000; i++){
			number=arrayDouble(number);
		}
		for (int i=0; i<number.length; i++){
			sum += number[i];
		}
		System.out.println(sum);

	}

	public static int[] arrayDouble(int[] old){
		int[] newArray = new int[old.length+1];
		for (int i=0; i<old.length; i++){
			newArray[i]+=2*old[i];
			if (newArray[i]>9){
				newArray[i+1]+=newArray[i]/10;
				newArray[i]=newArray[i]%10;
			}
		}
		return newArray;
	}
}
