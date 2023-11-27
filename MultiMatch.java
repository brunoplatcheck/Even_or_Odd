/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;


import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class MultiMatch {
    private int player1;
    private int winningsP1;
    private int defeatsP1;
    private int winningsP2;
    private int defeatsP2;
    private int player2;
    private int matches=0;
    private int p1Command;
    private String p2Command;
    private String command1;
    Scanner s=new Scanner(System.in);

    public MultiMatch() {
        
        Executar ex=new Executar();
        do{
        System.out.println("You choose play against a friend!");
        do{
        System.out.println("Player1 Choose Even(2) or Odd(1):");
        matches++;
        p1Command=s.nextInt();
        if(p1Command==1){
            ChooseNumber(p1Command);
        }else if(p1Command==2){
            ChooseNumber(p1Command);
        }else{
            System.out.println("Comand Invalid, try again");
            p1Command=s.nextInt();
        }
        }while(p1Command!=2 && p1Command!=1);
        
            System.out.println("The Score of Wins/Defeats is: ");
            System.out.println(DoTheMatch());
            System.out.println("Player1: "+winningsP1+" / "+defeatsP1);
            System.out.println("Player2: "+winningsP2+" / "+defeatsP2);
            System.out.println("Another match?");
            command1=s.next();
        }while(command1.equalsIgnoreCase("S"));
        ex.Executar();
    }

    private void ChooseNumber(int p1Command) {
        String message;
        if(p1Command==1){
            message="Odd";
        }else{
            message="Even";
        }
        System.out.println("Player 1 is: "+message);
        System.out.println("Player 1 choose your number: ");
        player1=s.nextInt();
        if(p1Command==1){
            message="Even";
        }else{
            message="Odd";
        }
        System.out.println("Player 2 is: "+message);
        System.out.println("Player 2 choose your number:");
        player2=s.nextInt();
        DoTheMatch();
    }

    private String DoTheMatch() {
        int sum;
        
        sum=player1+player2;
        
        if(sum%2==0){
            if(p1Command==2){
                winningsP1++;
                defeatsP2++;
                return "Player1 Win";
            }else{
                winningsP2++;
                defeatsP1++;
                return "Player2 Win";
            }
        }else{
            if(p1Command==2){
                winningsP1++;
                defeatsP2++;
                return "Player1 Win";
            }else{
                winningsP2++;
                defeatsP1++;
                return "Player2 Win";
            }
        }
    }

   
    
}
