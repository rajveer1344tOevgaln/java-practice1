
import java.util.Scanner;

class user {

    String acc_holder;
    int acc_no;
    int amount;


    void display() {
        System.out.println("name : " + acc_holder + "\nacc no : " + acc_no + "\namount : " + amount);
    }
    

    public user(String acc_holder, int acc_no, int amount) {
        this.acc_holder = acc_holder;
        this.acc_no = acc_no;
        this.amount = amount;

    }
    int withdraw(int w){
        return w;
    }
}

public class bankobj {

    public static void main(String[] args) {
        user u1 = new user("joshept hord", 789875698, 108765);
        u1.display();
        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER WITHDRAW AMOUNT :");
        int a = scan.nextInt();
        int b = 108765 - a;
        if (a <= 108765) {
            System.out.println("....withdraw suscessfull.... " + a + "\nrest amount is = " + b);

        } else {
            System.out.println("insuffecient balance ");
        }

    }
}
