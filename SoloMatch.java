/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class SoloMatch {
    private int player;
    private int winnings=0;
    private int defeats=0;
    private int machine;
    private String command1;
    private int command2;
    private int matches;
Scanner s=new Scanner(System.in);
    
    
    public SoloMatch() {
        Scanner s=new Scanner(System.in);
        Random random = new Random();
        Executar ex=new Executar();
        do{
        System.out.println("You choose play against the machine!");
        do{
        System.out.println("Choose Even(2) or Odd(1):");
        matches++;
        command2=s.nextInt();
        if(command2==1){
            OddMatch(command2);
        }else if(command2==2){
            EvenMatch(command2);
        }else{
            System.out.println("Comand Invalid, try again");
            command2=s.nextInt();
        }
        
        }while(command2!=2 && command2!=1);
            System.out.println("Now you have a total of:");
            System.out.println(winnings + " Winnings \n"+defeats+" Defeats");
            System.out.println("With a total of: "+((winnings/matches)*100) +"% of victorys");
            System.out.println("Another match?");
            command1=s.next();
        }while(command1.equalsIgnoreCase("S"));
        ex.Executar();
    }
    private void OddMatch(int command2){
        System.out.println("You Choose Odd");
        System.out.println("Choose your number: ");
        player=s.nextInt();
        Random random = new Random();
        machine = random.nextInt(3);
        System.out.println("Machine choose:"+machine);
        DoTheSoloMach(player,command2);
    }
    private void EvenMatch(int command2){
        System.out.println("You Choose Even");
        System.out.println("Choose your number: ");
        player=s.nextInt();
        Random random = new Random();
        machine = random.nextInt(3);
        System.out.println("Machine choose:"+machine);
        DoTheSoloMach(player,command2);
    }

    private String DoTheSoloMach(int player, int command2) {
        int sum;
        
        sum=player+machine;
        if((sum%2==0)){
            if(command2==2 ){
                winnings++;
                return "You win";
            }else{
                defeats++;
                return "You lost";
            }
        }else{
            if(command2==1){
                winnings++;
                return "You win";
            }else{
                defeats++;
                return "You lost";
            }
        }
        
        
    }

    
    
}
