
public class euler17 {


	public static void main(String[] args) {
		int sum=0;
		for (int i=1; i<=1000; i++){
			sum += intToWords(i).length();
		}
		System.out.println(sum);

	}

	public static String intToWords(int num){
		StringBuilder sb = new StringBuilder();
		if (num>999){
			sb.append(intToWords(num/1000));
			sb.append("thousand");
			if (num%1000>0){
				if (num%1000<100)
					sb.append("and");
				sb.append(intToWords(num%1000));
			}
		}
		else if (num>99){
			sb.append(intToWords(num/100));
			sb.append("hundred");
			if (num%100>0){
				sb.append("and");
				sb.append(intToWords(num%100));
			}
		}
		else if (num>19){
			sb.append(tensGetter(num/10));
			if (num%10>0){
				sb.append(intToWords(num%10));
			}
		}
		else {
			sb.append(digitGetter(num));
		}
		return sb.toString();
	}

	public static String digitGetter(int num){
		switch(num){
		case 1: return "one";
		case 2: return "two";
		case 3: return "three";
		case 4: return "four";
		case 5: return "five";
		case 6: return "six";
		case 7: return "seven";
		case 8: return "eight";
		case 9: return "nine";
		case 10: return "ten";
		case 11: return "eleven";
		case 12: return "twelve";
		case 13: return "thirteen";
		case 14: return "fourteen";
		case 15: return "fifteen";
		case 16: return "sixteen";
		case 17: return "seventeen";
		case 18: return "eighteen";
		case 19: return "nineteen";
		}
		return null;
	}

	public static String tensGetter(int num){
		switch(num){
		case 2: return "twenty";
		case 3: return "thirty";
		case 4: return "forty";
		case 5: return "fifty";
		case 6: return "sixty";
		case 7: return "seventy";
		case 8: return "eighty";
		case 9: return "ninety";
		}
		return null;
	}
}