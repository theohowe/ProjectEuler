
public class Euler2 {

    public static void main(String[] args) {
        int last=1;
        int current =2;
        int sum=0;
        int next;
        while (current<=4000000){
            if (current%2==0)
                sum+=current;
            next=current+last;
            last=current;
            current=next;
        }
System.out.println(sum);
    }



}
