package Corredor;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Corredor e1 = new Corredor();
        int correr,recarga;
        String run = null;
        
        
       System.out.print("Ingrese la energia total del corredor: ");
       e1.setEnergia(in.nextInt());
       do{
           System.out.println("\nIngrese el número de veces que el competidor correrá: ");
           correr = in.nextInt();
           
       
            System.out.println("\nEl competidor cempezará a correr...");
            
            for(int i =0 ; i < correr ; i ++){
                    e1.correr();
                    e1.verificarEnergia();
            }
            
            System.out.print("\nLa energia del corredor es: " + e1.getEnergia()); 
            
            
            if(e1.getEnergia() == 0){
                System.out.println();
                e1.energiaCero();
                System.out.println("\nRecargando energia...");
                System.out.println("Indique el número veces que el competidor entrenará: "); recarga = in.nextInt();
                for(int i = 0 ; i < recarga ; i ++){
                    e1.recargarEnergia(10);
                    e1.entrenar();
                }
                System.out.print("\nLa energia del corredor es: " + e1.getEnergia());
            }
           
            else{
                System.out.println("\nRecargando energia...");
                System.out.println("Indique el número veces que el competidor entrenará: "); recarga = in.nextInt();
                for(int i = 0 ; i < recarga ; i ++){
                    e1.recargarEnergia(10);
                    e1.entrenar();
                }
                System.out.print("\nLa energia del corredor es: " + e1.getEnergia());
            }
            
            System.out.println("\n\nDesea que el competidor vuelva a correr? [Si/No]");
            run = in.next();
            System.out.println("\n\n");
        }while("s".equals(run) || "S".equals(run) || "si".equals(run) || "SI".equals(run) || "Si".equals(run));    
               
    }
    
}