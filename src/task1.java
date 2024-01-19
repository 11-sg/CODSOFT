import java.util.*;
public class task1
{ // number game
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO GUESSING GAME");
        int round=0,i,f;
        while(true)
        {   
            System.out.println("How many chances you want to guess");
            int chance=sc.nextInt();
            System.out.println("Enter the range");
            int min=sc.nextInt();
            int max=sc.nextInt();
            int rand=min+(int)(Math.random()*((max-min)+1));
            f=0;
            for(i=1;i<=chance;i++)
            {
            System.out.println("Enter the guess "+(i));
            int guess=sc.nextInt();
            if (guess==rand)
            {
                System.out.println("Congratulation you are correct!");
                f=1;
                break;
            }
            else if (guess>rand)
            {
                System.out.println("Too High");
            }
            else
            System.out.println("Too Low");
            }

            if(f==0)
            System.out.println("ALL CHANCES ARE OVER SORRY\nANSWER IS " +rand);
            else{
            System.out.println("ROUND "+(++round)+ " SCORE");
            System.out.println("OUT OF "+chance+ " CHANCES, YOU GUSSED IN "+ i + " CHANCES");
            }
            System.out.println("Do you want to play again(y/n)");
            String anser=sc.next().toLowerCase();
            if(anser.equals("n")){
                sc.close();
            System.exit(0);}
            else
            continue;
        }
    }
}