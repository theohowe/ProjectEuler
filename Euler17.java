
public class Euler17 {
    
    
    public static void main(String[] args) {
        String [] numbers = new String[101];
        numbers[1] = "one";
        numbers[2] = "two";
        numbers[3] = "three";
        numbers[4]= "four";
        numbers[5] = "five";
        numbers[6] = "six";
        numbers[7] = "seven";
        numbers[8] = "eight";
        numbers[9] = "nine";
        numbers[10] = "ten";
        numbers[11] = "eleven";
        numbers[12] = "twelve";
        numbers[13] = "thirteen";
        numbers[15] = "fifteen";
        numbers[20] = "twenty";
        numbers[30] = "thirty";
        numbers[40] = "forty";
        numbers[50] = "fifty";
        String teen = "teen";
        String ty = "ty";
        numbers[100] = "hundred";
        String current = "five";
        int sum=0;
        for (int i=1; i<=1000;i++){
            if (i==1000)
                current = "onethousand";
            if (i>=100 && i<1000)
                current = numbers[i/100];
            
        }
        
        
    }
    
}
