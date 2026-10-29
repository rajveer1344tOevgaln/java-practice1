import java.util.Scanner;
public class work{
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("enter your monthly bill :");
int a =scan.nextInt();
System.out.print("Enter your month :");
int b =scan.nextInt();
int c =(a*b*10)/100;
if(b<6){
    System.out.println("penelty of "+ b + "  month is ="+c);

    System.out.println("your merged amount is ="+ (a+c));
}else{
    System.out.print("enter valid details");
}

    }
    }