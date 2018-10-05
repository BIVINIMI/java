import java.io.*;
import java.util.*;
class greatestnumber {

 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
   
  System.out.print("Input the 1st number: ");
  int n1 = s.nextInt();
   
  System.out.print("Input the 2nd number: ");
  int n2 = s.nextInt();
   
  System.out.print("Input the 3rd number: ");
  int n3 =s.nextInt();
   
   
  if (n1 > n2)
   if (n1 > n3)
    System.out.println("The greatest: " + n1);
   
  if (n2 > n1)
   if (n2 > n3)
    System.out.println("The greatest: " + n2);
   
  if (n3 > n1)
   if (n3 > n2)
    System.out.println("The greatest: " + n3);
 }
}