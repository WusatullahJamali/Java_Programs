
import java.util.Scanner;

public class Q3_hw{
public static void main(String args []){

Scanner sc=new Scanner(System.in);

System.out.println("Enter a no: ");
int a=sc.nextInt();

System.out.println("Enter 2nd no:");
int b=sc.nextInt();

System.out.println("Enter 3rd no:");
int c=sc.nextInt();

double d=(a+b+c)/3;
System.out.println("The average of the numbers  is: "+d);

}
}