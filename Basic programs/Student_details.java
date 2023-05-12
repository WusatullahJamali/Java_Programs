
import java.util.Scanner;

public class Student_details{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter your roll no");
String roll_no=sc.next();

System.out.println("Enter your name");
String StudentName=sc.next();

System.out.println("Enter your NIC no");
long Nic_no=sc.nextLong();

System.out.println("Enter your gender");
String gender=sc.next();

System.out.println("Enter your Gender");
char gender1=sc.next().charAt(0);

System.out.println("Are you Female?");
boolean b=sc.nextBoolean();

System.out.println("Are you male?");
boolean b1=sc.nextBoolean();

System.out.println("what is your university name");
String university_name=sc.nextLine();

System.out.println("what is your district");
String district=sc.next();
}
}