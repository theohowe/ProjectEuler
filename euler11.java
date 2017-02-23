import java.util.*;
import java.io.*;
public class euler11 {

    public static void main(String[] args)throws FileNotFoundException {
        File file= new File("Euler11.txt");
        Scanner sc= new Scanner(file);
        int[][] grid=new int[20][20];
        int product=0;
        int holder=0;
        for (int r=0; r<20;r++){
            for (int c=0; c<20; c++){
                grid[r][c]=sc.nextInt();
            }
        }
        for (int r=0; r<20;r++){
            for (int c=0; c<20; c++){
                if (r>2 && c<17){
                    holder=grid[r][c]*grid[r-1][c+1]*grid[r-2][c+2]*grid[r-3][c+3];
                    if (holder>product)
                        product=holder;
                }
                if (c<17){
                    holder=grid[r][c]*grid[r][c+1]*grid[r][c+2]*grid[r][c+3];
                    if (holder>product)
                        product=holder;
                }
                if (r<17 && c<17){
                    holder=grid[r][c]*grid[r+1][c+1]*grid[r+2][c+2]*grid[r+3][c+3];
                    if (holder>product)
                        product=holder;
                }
                if (r<17){
                    holder=grid[r][c]*grid[r+1][c]*grid[r+2][c]*grid[r+3][c];
                    if (holder>product)
                        product=holder;
                }
            }
        }
        System.out.println(product);

    }

}
