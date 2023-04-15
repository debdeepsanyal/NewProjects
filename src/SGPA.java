import java.util.Scanner;

public class SGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,num,marks, credit, grade_total=0;
        double total,credit_total = 0.0;
        System.out.println("Enter number of subjects ");
        num = sc.nextInt();
        for(i = 1; i<=num; i++){
            System.out.println("Enter the marks awarded for subject "+ i);
            marks = sc.nextInt();
            System.out.println("Enter credit for this subject ");
            credit = sc.nextInt();
            credit_total+=credit;
            grade_total+=grade(marks)*credit;
        }
        System.out.println(credit_total);
        System.out.println(grade_total);
        total = (grade_total/credit_total);
        System.out.printf("Your SGPA stands as %.2f",total );


    }
    public static int grade(int marks){
        if(marks>=90){
            return 10;
        }
        else if(marks>=80){
            return 9;
        } else if (marks>=70){
            return 8;
        } else if (marks>=60) {
            return 7;
        } else if (marks>=50) {
            return 6;
        } else if (marks>=40) {
            return 5;
        }
        else{
            return  0;
        }
    }
}
