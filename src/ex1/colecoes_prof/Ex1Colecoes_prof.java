/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.colecoes_prof;

/**
 *
 * @author JBP1996 Atec
 */

public class Ex1Colecoes_prof {

    private int[] est= new int[]{2,4,6,8};
    
    public Ex1Colecoes_prof(){
        int[] t1 = addNumber(10);
        for (int i=0;i< t1.length; System.out.println(t1[i++]));
    }
    
    public int[] addNumber(int novoN){
        int[] tmp = new int[est.length+1];
        for(int i=0; i< tmp.length-1;tmp[i]=est[i++]);
        tmp[est.length]=novoN;
        return tmp;
    }
    
    public int [] delNumber(int pos){
        int[] tmp = new int[est.length-1];
        
        for(int i=0;i< tmp.length;i++){
            if (i==pos){
                continue;
            }else{
                if(i>pos){
                    tmp[i-1]=est[i-1];
                }else{
                    tmp[i]= est[i];
                }
            }
            
        }return tmp;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
