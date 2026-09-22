import java.util.Scanner;

public class DriversLicenseExam {
    public static void main(String args[]){
        char[] answers={'A','D','B','B','C',
                        'B','A','B','C','D',
                        'A','C','D','B','D',
                        'C','C','A','D','B'};

        String message="\n";
        int correct=0;

        Scanner newScanner=new Scanner(System.in);

        for(int c=1;c<=answers.length;c++){
            char input='?';
            
            while (input!='A'&&input!='B'&&input!='C'&&input!='D') {
                System.out.print("Enter the answer for question #"+c+": ");
                input=newScanner.nextLine().charAt(0);    
            }

            if(input==answers[c-1]){
                message=message+c+".) Correct.\n";
                correct++;
            }else{
                message=message+c+".) Incorrect.\n";
            }
        }

        message=message+"\nYou got "+correct+" questions right and "+(answers.length-correct)+" questions wrong.";

        if(correct>15){
            message=message+"\n\nYou passed!";
        }else{
            message=message+"\n\nYou failed.";
        }

        System.out.print(message);
    }
}
