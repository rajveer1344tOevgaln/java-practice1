import java.util.Scanner;
public class input{
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print( "ENTER YOUR NAME :");
String name = scan.nextLine();
System.out.print("ENTER YOUR AGE :");
int a =scan.nextInt();
System.out.print("ENTER YOUR HEIGHT :");
float b =scan.nextFloat();
System.out.println("good morning "+ name);
System.out.println("Your age is :"+ a);
System.out.println("your height is "+b);

    }
    }