/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;
import java.util.Scanner;

/**
 *
 * @author Formação
 */
public class Table {
    
    private int num[] = new int[2];
    
    Scanner in = new Scanner(System.in);
    
    public Table(){
        System.out.println("Insira os valores para retornar os diferentes formatos: \n");
        for(int i = 0; i<num.length; i++ ){
            num[i] = in.nextInt();
        }
    }
    
    public void print(Printer printer){
        for(int i = 0; i<num.length; i++ ){
            System.out.println(printer.format(num[i]));
        }
    }
}
