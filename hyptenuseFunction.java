import java.util.Scanner;

public class hyptenuseFunction {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the value of 1 side 'A': ");
        a= scanner.nextInt();

        System.out.print("Enter the value of other side 'b': ");
        b=scanner.nextInt();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The value of hypotenuse 'C' is "+ c);




        scanner.close();
    }
}
