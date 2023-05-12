
import java.util.Scanner;
public class Swapping{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter a integer value");
int num1=sc.nextInt();

System.out.println("Enter 2nd integer value");
int num2=sc.nextInt();

int num3=num1;
num1=num2;
num2=num3;


System.out.println("after swapping the value of num1 is "+ num1+"\n the value of num2 is"+num2 );
}
}
