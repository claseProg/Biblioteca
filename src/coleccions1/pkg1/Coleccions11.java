/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccions1.pkg1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author a11iagolp
 */
public class Coleccions11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        int numero;
        int suma=0;
        boolean correcto=false;
        ArrayList <Integer> numeros=new ArrayList<>();
        System.out.println("introduce un numero");
        
        do{
            numero=Utilidades.lerByte();
            if(numero==0){
                correcto=true;
            }else{
                 numeros.add(numero);
            }
        }while(!correcto);
     
       Iterator it=numeros.iterator();
       
       while(it.hasNext()){
           System.out.print(it.next()+" ");
           
       }
       /*duda, no suma el integer, no lo puedo pasar a int*/
       
       it=numeros.iterator();
        while(it.hasNext()){
          suma+=(Integer)it.next();
       }
        
        
        System.out.println("suma es "+suma);
       
        System.out.println("su media  "+suma/2);
        
        it=numeros.iterator();
        ArrayList <Integer> revertido=new ArrayList<>();
        
        for(int i=numeros.size()-1;i>-1;i--){
            
            revertido.add((Integer)numeros.get(i));
            
        }
        System.out.println("");
        Iterator ite=revertido.iterator();
        
        
        while(ite.hasNext()){
            System.out.print(" "+ite.next());
        }
    }
    
    
   
    
}
