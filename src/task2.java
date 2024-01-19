import java.util.*;
public class task2{
    // student grade calculator
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects");
        int subjects=sc.nextInt();
        System.out.println("Enter your marks in all "+subjects+" subjects out of 100");
        double[] mark=new double[subjects];
        double sum=0.0;
        for(int i=0;i<mark.length;i++)
        {
            mark[i]=sc.nextDouble();
            sum+=mark[i];
        }
        double avg=(sum/subjects);
        System.out.println("Sum = "+ sum+"\nAverage percentage = "+avg+ " %");
        if (avg>=90.0)
        System.out.println("Grade A");
        else if(avg>=85.0)
        System.out.println("Grade B");
        else if(avg>=75.0)
        System.out.println("Grade C");
        else
        System.out.println("Grade F");
        sc.close();
    }
}