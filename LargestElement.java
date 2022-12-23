import java.util.Scanner;
public class LargestElement {
    
    public static void main (String[] args){
    
        Scanner input = new Scanner(System.in);
        System.out.println("enter the array size: "  );
        int ArrSize = input.nextInt();
        int Arr[] = new int[ArrSize];
        System.out.println("\nenter elements : ");
        int temp;
        for(int i=0; i < ArrSize; i++){
        temp = input.nextInt();
        Arr[i]= temp;
        }
        int Maxi=-1;
        for (int i : Arr){
            //System.out.printf("%f   here  %f\n",i , Maxi);
        if (Maxi < i) Maxi = i;
        
        }
        
        System.out.printf("\nLargest number is %d", Maxi);
    
    }
    
}
