/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan30cakep;

import java.util.Scanner;

/**
 *
  * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program cakep
 */
public class PBO10118045Latihan30Cakep {

    /**
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[36m";
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(ANSI_RED+"Kamu"+ANSI_GREEN+"ngerjain sendiri"+ANSI_YELLOW+"latihan 17 sampe "+ANSI_BLUE+"latihan 30 ini?");
        System.out.print(ANSI_BLUE+"Jawab"+ANSI_RED+"(Yoi/Enggak) : ");
        Scanner jwb = new Scanner (System.in);
        String jawab = jwb.next();
        if ("yoi".equals(jawab))
            System.out.println(ANSI_RED+"Cakep Bener. "+ANSI_PURPLE+"Good Job");
        else 
            System.out.println(ANSI_RED+"Tetep cakep sih. \n"+ANSI_CYAN+"Sing penting paham konsep nya ye... \n"+ANSI_RESET+"Keep the code woks dude");
        
        
    }
    
}
