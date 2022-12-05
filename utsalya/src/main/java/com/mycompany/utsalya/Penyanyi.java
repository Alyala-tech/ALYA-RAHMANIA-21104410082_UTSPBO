/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsalya;

/**
 *
 * @author Alya
 */
public class Penyanyi {
   public static void main(String[]args){
        Pop pop = new Pop ("Blackpink", "How You Like That");
        Dangdut dangdut = new Dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Benruk Cinta");
        pop.cetakLabel();
        
        String penyanyi = "Joko Chandra";
        penyanyi = dangdut.penyanyi;
        dangdut.song("Via Vallen", "Kopi Dangdut");
        dangdut.cetakLabel();
    }
     
}
