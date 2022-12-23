import java.util.Scanner;

public class RemovingComma {

public static void main(String [] args){
Scanner input = new Scanner(System.in);
    System.out.println("Enter the line you want to remove comma from it:");
String line = input.nextLine();
    
String result = line.replace(',' , ' ');
    
    System.out.printf("Your line withput comma is: \n%s\n",result);
    String result2= "";
   for(int i= 0; i< line.length();i++){
   char ch = line.charAt(i);
   if(ch != ',') result2+=ch;
   
   }
    System.out.printf("Your line with comma enterliy deleted: \n%s\n ",result2);


}


 
    
}
