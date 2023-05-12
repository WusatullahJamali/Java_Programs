
import java.util.Scanner;
public class Temperature{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter temperature in celsius");
int a=sc.nextInt();


int b=273;
int c=a+b;
System.out.println("The temperature in kelvin is "+ c);

double d=(1.8*a)+32;
System.out.println("The temperature in fahrenheit is "+ d);

}
}