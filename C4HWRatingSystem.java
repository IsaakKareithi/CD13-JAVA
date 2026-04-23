import java.util.*;

public class C4HWRatingSystem {
    public static void main(String[] args){
    int sum=0;
        String result;
        Scanner scn = new Scanner(System.in);

    System.out.println("Enter the number of Subjects: ");
    int noOfSubjects = scn.nextInt();
    int marks[] = new int[noOfSubjects]; // initializing array

    System.out.println("Enter the marks of " + noOfSubjects + " subjects. Press enter to give maeks for another subject"); // entering marks

    for(int i = 0; i<noOfSubjects; i++){
        marks[i] = scn.nextInt();
    }// calculating sum
    for (int j=0; j<noOfSubjects; j++){
        sum = sum+marks[j];
    } // generating result
    int percentage = sum/noOfSubjects;
    }
    
}
