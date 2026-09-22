import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String args[]){
        String message="\n";

        int[] lottery={0,0,0,0,0};
        Random newRandom=new Random();
        for(int c=1;c<=lottery.length;c++){
            int newInt=newRandom.nextInt(0,10);
            lottery[c-1]=newInt;

            message=message+"|"+newInt;
        }

        message=message+"|\n-----------\n";

        int[] user={0,0,0,0,0};
        Scanner newScanner=new Scanner(System.in);
        for(int c=1;c<=user.length;c++){
            int input=-1;
            while(input>9||input<0){
                System.out.print("Enter a number from 0-9: ");
                input=newScanner.nextInt();
            }
            
            user[c-1]=input;
            message=message+"|"+input;
        }

        message=message+"|\n-----------\n";

        int matches=0;
        for(int c=1;c<=lottery.length;c++){
            if(lottery[c-1]==user[c-1]){
                matches++;
            }
        }

        System.out.print(message);

        if(matches==5){
            System.out.print("You win a big prize!");
        }else{
            System.out.print("You got "+matches+" matches.");
        }
    }
}
