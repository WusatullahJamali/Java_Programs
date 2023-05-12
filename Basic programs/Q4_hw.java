
import java.util.Scanner;
//area = 1/2 * base * height
public class Q4_hw{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the base of triangle");
float base=sc.nextFloat();

System.out.println("Enter the height of triangle");
float height=sc.nextFloat();

//double area=1/2*base*height;
System.out.println("the area of Triangle is ");
// double area=(1/2)*(base*height); here 1/2 is equals to 0.5 and wrt int it is 0 that why it gives result 0
float area=(float) 0.5*(height *base);
System.out.println(area);
}
}