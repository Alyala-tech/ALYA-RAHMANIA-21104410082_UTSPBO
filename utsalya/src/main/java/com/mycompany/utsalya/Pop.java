/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utsalya;

/**
 *
 * @author Alya
 */
public class Pop {
   
    String penyanyi = "Raisa";
    String lagu = "Kali Kedua";
    
    Pop(){
        
    }
    
    Pop(String penyanyi, String lagu){
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi+"<=>"+this.lagu);
    }
    
    public void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    protected void song(String lagu){
        this.penyanyi = penyanyi;
    }
    
    void cetakLabel(){
        System.out.println(this.penyanyi+"<=>"+this.lagu);
    }
    
}
