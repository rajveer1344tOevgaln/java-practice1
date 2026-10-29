import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size :");
        int n =sc.nextInt();
        int[] arr =new int[n];
        System.out.println("enter elements : ");
        for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
        }
        System.out.print("array elements :");
        for (int i = 0; i <n; i++){
            System.out.print(arr[i]+",");
            // for sum of n array//
        } 
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+= arr[i];       
        }
             System.out.print("sum = "+ sum);
             // for even ond odd// 
             int even = 0;
             int odd = 0;
             for(int i = 0; i < n; i ++){
                if(arr[i] % 2 == 0){
                    System.out.println(" even number =" + arr[i]);
                }else{
                    System.out.println("odd number ="+arr[i]);
                }
             System.out.println("\n even count "+ even);
             System.out.println("\n odd count "+ odd);
             }

    }
}