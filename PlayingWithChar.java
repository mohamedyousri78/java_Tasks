import java.util.Scanner;


public class PlayingWithChar {
  static Scanner input = new Scanner(System.in); 
  public static void CharToNum(){
      System.out.println("Please enter char you want to get Ascii of");
      char ch =  input.next().charAt(0);
      int num = (int) ch;
      System.out.println(num);
    } 
  public static void NumToChar(){

    System.out.println("Please enter Ascii you want to get char of");
    int ascii = input.nextInt();
    char ch = (char) ascii;
    System.out.println(ch);
  
  }
    
 
}