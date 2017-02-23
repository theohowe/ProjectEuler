import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Euler13 {
    
    public static void main(String[] args) throws FileNotFoundException { 
        File file = new File ("input.txt");
        Scanner sc = new Scanner(file);
        double sum=0;
        double adden=0;
        while(sc.hasNextLine()){
        adden=sc.nextDouble();
        sum+=adden;
        }
        String total = String.format("%10.0f", sum);
        for (int i = 0; i<10; i++){
            System.out.print(total.charAt(i));
        }
    }
}
