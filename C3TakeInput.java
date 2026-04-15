import java.util.Scanner;

public class C3TakeInput {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scn.nextLine();
        System.out.println("The string is " + str);

        System.out.print("Enter an integer number: ");
        int num = scn.nextInt();
        System.out.println("The number is " + num);

        System.out.print("Enter a floating number: ");
        float fnum = scn.nextFloat();
        System.out.println("The floating number is "+ fnum);

        scn.close();

    }
    
}
