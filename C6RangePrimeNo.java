import java.util.Scanner;

public class C6RangePrimeNo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // What to enter:
        // Enter two integers: low and high e.g 10 to 27
        // program will print all prime numbers between low and high (inclusive)
        System.out.print("Enter low: ");
        int low = scn.nextInt();

        System.out.print("Enter high: ");
        int high = scn.nextInt();

        for (int n = low; n <= high; n++){
            if (n <= 1) continue; // 0 and 1 are not prime

            int count = 0;
            for(int div = 2; div*div <= n; div++){
                if (n%div == 0){
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.print(n+",");
            }
        }
    }
}
