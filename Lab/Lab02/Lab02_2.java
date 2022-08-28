
import java.util.Scanner;

public class Lab02_2 {
    public static void main(String[] args) {
        int Num=0;
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper(2): ");
        int player = input.nextInt();
        int com = (int)(Math.random()*3);
        String a="",b="";
        switch(com) {
            case 0: a="scissor";
            break;
            case 1: a="rock";
            break;
            case 2: a="paper";
            break;
        }
        switch(player) {
            case 0: b="scissor";
            break;
            case 1: b="rock";
            break;
            case 2: b="paper";
            break;
        }
        System.out.print("The computer is "+a+". You are "+b);

        if(com==0) {
            if(player==0) {
                Num=2;
            }
            else if(player==1) {
                Num=0;
            }
            else if(player==2) {
                Num=1;
            }
        }
        else if(com==1) {
            if(player==0) {
                Num=1;
            }
            else if(player==1) {
                Num=2;
            }
            else if(player==2) {
                Num=0;
            }
        }
        else if(com==2) {
            if(player==0) {
                Num=0;
            }
            else if(player==1) {
                Num=1;
            }
            else if(player==2) {
                Num=2;
            }
        }

        switch(Num) {
            case 0: System.out.println(". You won");
            break;
            case 1: System.out.println(". You lose");
            break;
            case 2: System.out.println("too. It is a draw");
            break;
        }
    }
}
