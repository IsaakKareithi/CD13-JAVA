import java.util.Scanner;

public class C6NestedLoop {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        // What to enter:
        // first enter t = number of test cases
        // the enter t numbers (n), one per line
        System.out.print("Enter number of test cases (t): ");
        int t = scn.nextInt();

        for (int i = 1; i <= t; i++){
            System.out.println("Enter number " +i+ ": ");
            int n = scn.nextInt();

            int count = 0;
            for (int div = 2; div*div <= n; div++){
                if (n % div == 0){ 
                    count++;
                    break;
                }
            }

            if (n <= 1){
                System.out.println("Not a prime number.");
            } else if(count == 0){
                System.out.println("The number is prime.");
            } else{
                System.out.println("The number is not prime");
            }
        }
    }
}
