import java.util.Arrays;

public class euler16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1};
		int sum=0;
		for (int i=1; i<=1000; i++){
			number=arrayDouble(number);
		}
		System.out.print("Number: ");
		for (int i=number.length-1; i>=0; i--){
			System.out.print(number[i]);
			sum += number[i];
		}
		System.out.println();
		System.out.println("Sum: " + sum);

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
		if (newArray[newArray.length-1]>0)
			return newArray;
		return Arrays.copyOf(newArray, newArray.length-1);
	}
}
