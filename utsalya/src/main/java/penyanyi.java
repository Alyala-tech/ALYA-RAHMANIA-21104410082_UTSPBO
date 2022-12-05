/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alya
 */
public class penyanyi extends Pop {
    public static void main(String[]args){
        Pop pop = new Pop ("Blackpink", "How You Like That");
        Dangdut dangdut = new Dangdut();
        
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.cetakLabel();
        
        String penyanyi;
        penyanyi = dangdut.penyanyi;
        dangdut.song("Kopi Dangdut");
        dangdut.cetakLabel();
    }
    
}
