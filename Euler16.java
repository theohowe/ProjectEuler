import java.util.Scanner;


public class Euler16 {
    
    public static void main(String[] args) {
        double number=1;
        int exponent = 200;
        int sum=0;
        int limit=0;
        String [] value = new String [1000];
        int marker=0;
        String figure = "";
        
        //step one, calculate the number
        for (int i=0; i<exponent; i++){
            number = number*2;
        }
        
        //step two, put the number into a String
        figure = Double.toString(number);
        System.out.println(figure);
    }
}
