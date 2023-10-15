import java.util.Scanner;

public class Complex {
    public void add(int r1, int i1, int r2, int i2){
    int real=r1+r2;
    int imaginary=i1+i2;
    System.out.println("addition of given complex  number  is: ");
    System.out.println(real + " + "+ imaginary + "i");
}

    public void subtract(int r1,int i1,int r2,int i2){
        System.out.println("subtraction of given complex numbers is :");
        int real=r1-r2;
        int imaginary=i1-i2;
        if (imaginary<=0){
            System.out.println(real + "+" + imaginary + "i");

        }
        else {
            System.out.println(real + "-" + imaginary + "i");

        }

    }

    public void multiply(int r1,int i1,int r2, int i2){
        System.out.println("multiplication of given complex numbers is :");
        int  real=(r1*r2)-(i1*i2);
        int imaginary=(r1*r2)+(i1*i2);
        System.out.println(real + "+" + imaginary + "i") ;

    }
    public void division(double r1,double i1,double r2, double i2){
        System.out.println("division of given complex numbers is :");
        double real=(r1*r2 + i1*i2)/((r2*r2) + (i2*i2));
        float imaginary=(float) ( (i1 * r2 - r1*i2 )/((r2*r2)+(i2*i2)) );
        System.out.println(real + " + " + imaginary + "i");

    }

    public static void main(String[] args) {
        Complex c = new Complex();
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Complex operations App ");
        while (true) {



            System.out.println("Enter 1st real number");
            int r1 = s.nextInt();
            System.out.println("Enter 1st imaginary number");
            int i1 = s.nextInt();
            System.out.println("Enter 2nd real number");
            int r2 = s.nextInt();
            System.out.println("Enter 2nd imaginary number");
            int i2 = s.nextInt();


            System.out.println("Enter a option to proceed");
            System.out.println("Enter 1 to add ");
            System.out.println("Enter 2 to subtract");
            System.out.println("Enter 3 to multiply");
            System.out.println("Enter 4 to divide");
            int option = s.nextInt();
            if (option == 1) {
                c.add(r1, i1, r2, i2);

            } else if (option == 2) {
                c.subtract(r1, i1, r2, i2);
            } else if (option == 3) {
                c.multiply(r1, i1, r2, i2);

            } else if (option == 4) {
                c.division(r1, i1, r2, i2);

            } else
                System.out.println("Enter correct option to proceed");


            System.out.println("do you want to continue ");
            System.out.println("Enter 1 for yes");
            System.out.println("Enter 2 for no");
            int input1 = s.nextInt();
            if (input1 != 1){
                break;
            }
        }
        System.out.println("thank you for coming");
    }
}
