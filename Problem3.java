import java.util.Scanner;
 
public class Problem3
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    integer sides;
    Double length;
    
    System.out.println("Enter number of sides:");
    sides = scan.nextInteger();
    System.out.println("Enter side length:");
    length = scan.nextDouble();
    
    RegularPolygon p1 = RegularPolygon(length, sides);
    RegularPolygon p2 = RegularPolygon(length + 1, sides * 2);
    
    System.out.println("The area of a " + p1 + " is: " + p1.getArea());
    System.out.println("The area of a " + p2 + " is: " + p2.getArea());
  }
}
