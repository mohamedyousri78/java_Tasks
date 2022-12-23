import java.util.Scanner;

public class Transpose2DArray {

public static void main(String[] args){

    System.out.println("Enter the raw size of your matrix: ");
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
    System.out.println("Enter the column size of your matrix: ");
    int column = input.nextInt();
    
    int orignal[][] = new int [row][column];
    int transpo[][] = new int [column][row];
    System.out.printf("enter your %d elements: \n", (row*column));
    for(int i =0;i< row; i++){
        for(int j=0;j<column;j++){
        
        orignal[i][j]= input.nextInt();
        //    System.out.print("   "+orignal[i][j]);
        }
      //  System.out.println("--------------------");
    }
    
    for(int i =0;i< column; i++){
        for(int j=0;j<row;j++){
        
        transpo[i][j]= orignal[j][i];
    //    System.out.print("   "+transpo[i][j]);
        }
  //  System.out.println("--------------------");
    }
 
    System.out.println("Your transposed matrix is:");
    for(int i =0;i< column; i++){
        for(int j=0;j<row;j++){
            System.out.printf("%d  ", transpo[i][j]); 
        }
        System.out.println("");
    }

}

    
}