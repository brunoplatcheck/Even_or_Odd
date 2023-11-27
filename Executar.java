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
class Executar {
private int comand;
    void Executar() {
        Menu();
    }
    private void Menu(){
        Scanner s=new Scanner(System.in);
            System.out.println("Choose to play against the machine or another player?");
            System.out.println("press 1 to play solo or two to play with a friend");
            comand=s.nextInt();
            do{
            if(comand==1){
                new SoloMatch();
            }else if(comand==2){
                new MultiMatch();
            }else{
                System.out.println("Invalid number, Choose another command:");
                comand=s.nextInt();
            }
            }while(comand!=1 && comand!=2);
    }
}
