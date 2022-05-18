package Arrays;
/*
The class teacher wants to stare marks obtained by 44 students of a class in english , maths and science . 
WAP to input values in 3 separate arrays. 
Calculate : i) Average marks of each student ii) Class average of each subject 

*/
import java.util.Scanner;

public class avgStudent_Subject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eng[]=new int [44];
        int math[]=new int [44];
        int sci[]=new int [44];
        System.out.println("Enter marks of student in English , Maths and Science for 44 students");
        for (int i=0;i<44;i++){
            eng[i]=sc.nextInt();
            math[i]=sc.nextInt();
            sci[i]=sc.nextInt();
        }
        int sumStu =0;  //  total marks of student 
        int sumS=0, sumE=0 ,sumM=0; // total marks in subject of all student s

        for (int i=0;i<44;i++){
            sumStu=eng[i]+math[i]+sci[i];
            sumE+=eng[i];
            sumM+=math[i];
            sumS+=sci[i];
            System.out.println("Student Average : "+(sumStu/3.0));
        }
        System.out.println("Class Average : ");
        System.out.println("English : "+(sumE/44.0));
        System.out.println("Maths : "+(sumM/44.0));
        System.out.println("Science : "+(sumS/44.0));
        sc.close();
    }
}
