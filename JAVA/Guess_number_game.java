import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("!!!!!!Number guessing game!!!!!!!!");
        int max_attempt=7;
        
        Random r=new Random();
        int random_number=r.nextInt(100)+1;
        System.out.print("Take a guess from 1 to 100: ");
        int user=sc.nextInt();
        int score=70;
        while(user!=random_number && max_attempt>1){
            max_attempt--;
            score-=10;
            if(user>random_number){
                System.out.println("------------------");
                System.out.println("NAH it's too high");
                System.out.println("Number of attempt left is: "+max_attempt);
                System.out.println("------------------");
            }else if(user<random_number){
                System.out.println("------------------");
                System.out.println("NAH it's too low");
                System.out.println("Number of attempt left is: "+max_attempt);
                System.out.println("------------------");
            }
            System.out.print("Take a guess from 1 to 100: ");
            user=sc.nextInt();
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        if(user==random_number){
            System.out.println("YAY!!You got the number");
            System.out.println("Your score is: "+score);
        }else{
            System.out.println("Your maximum attempt is completed");
            System.out.println("Better luck for next time");
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        
    }
}

