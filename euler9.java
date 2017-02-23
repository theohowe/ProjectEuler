
public class euler9 {


    public static void main(String[] args) {
        boolean found = false;
        double a=0,b=0,c=0, check=0, product=0, sum=0, asquare=0, bsquare=0, csquare=0;
        
        for (a=1; a<1000 && found==false; a++){
            asquare=a*a;
            for (b=a+1; b<1000 && found==false; b++){
                bsquare=b*b;
                check=asquare+bsquare;
                for (c=b+1; c<1000 && found==false; c++){
                    csquare=c*c;
                    sum=a+b+c;
                    if(check==csquare && sum==1000){
                        found=true;
                        product=a*b*c;
                        System.out.printf("A = %1.0f \n", a);
                        System.out.printf("B = %1.0f \n", b);
                        System.out.printf("C = %1.0f \n", c);
                        System.out.printf("Sum = %1.0f\n", sum);
                        System.out.printf("Product = %1.0f", product);

                    }
                }
            }
        }
    }

}
