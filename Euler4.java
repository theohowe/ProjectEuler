
public class Euler4 {

    public static void main(String[] args) {
        int highbound = 999*999; //highest possible value
        int lowbound = 100*100; //lowest possible value
        int palindrome=0;
        int factor1=0;
        int factor2=0;
        while (highbound >= lowbound && palindrome==0){
            if (highbound>100000 && highbound%10==highbound/100000 && highbound/10%10==highbound/10000%10 && highbound/100%10==highbound/1000%10){
                for (int n=999; n>=100; n--){
                    if (highbound%n==0 && (highbound/n)>=100 && (highbound/n)<1000){
                        palindrome=highbound;
                        factor1=n;
                        factor2=highbound/n;
                    }
                }
            } else if (highbound%10==highbound/10000&& highbound/10%10==highbound/1000%10){
                for (int n=999; n>=100; n--){
                    if (highbound%n==0 && (highbound/n)>=100 && (highbound/n)<1000){
                        palindrome=highbound;
                        factor1=n;
                        factor2=highbound/n;
                    }
                }
            }
            highbound--;
        }
        System.out.println("Palindrome = " + palindrome);
        System.out.println("Factor 1 = " + factor1);
        System.out.println("Factor 2 = " + factor2);    
    }
}