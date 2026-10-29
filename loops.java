import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print( "ENTER NUMBER :");
int a = scan.nextInt();
System.out.print("enter your range :");
int b = scan.nextInt();
int i = a;
while(i<=a*b){
    System.out.print(i+",");
i=(i+a);
}

    }
    }