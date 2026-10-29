import java.util.Scanner;
public class nested{
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("ENTER A :");
int a =scan.nextInt();
System.out.print("ENTER B :");
int b =scan.nextInt();
System.out.print("ENTER C :");
int c =scan.nextInt();
if(a>b){
    if(a>c){
        System.out.print("GREATER NUMBER IS:"+a);
    }else{
        System.out.print("GREATER NUMBER IS:"+b);
    }
    }
    else{
        if(b>c){
            System.out.print("GREATER NUMBER IS:"+b);
        }else{
            System.out.print("GREATER NUMBER IS:"+c);
        }
    }

    }
}
