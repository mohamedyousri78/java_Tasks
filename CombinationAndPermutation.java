import java.util.Scanner;

public class CombinationAndPermutation {
    
    static double facto(double input){
       double result =1;
       for(int i=2;i<=input;i++){
           result*=i;
       }
       return result;
   }
    
    
    public static void main(String []args){
    double n,c,p,r;
    Scanner input = new Scanner(System.in);
    System.out.print("enter n ");
    n = input.nextDouble();
   
    System.out.print("enter r ");
    r = input.nextDouble();

    c = facto(n)/(facto(r)*facto(n-r));
    p= facto(n)/facto(n-r);

    System.out.println("nCr = " + (long)c);
    System.out.println("nPr = " + (long) p); 
    
    
    
    }
}
