package aula2;

import java.util.Scanner;
public class Vetor {
   
   public static int vetor_positivos(int[]vet,int[]positivo){
    int c=0;
    for (int i=0; i<vet.length; i++){
        if(vet[i]>0){
            positivo[c]=vet[i];
            c = c + 1; 
        } else{
            c = c; 
        }
    }
    return c;
   }
   
    public static void main(String[] args) {
        int []vet = new int[10];
        int []positivo = new int[10];
        int x=0;
        Scanner input = new Scanner(System.in);
        for (int i=0; i<vet.length;i++)
            vet[i]= input.nextInt();
        x = vetor_positivos(vet, positivo);
        for (int i=0; i<x; i++)
            System.out.println(positivo[i]);
     }
    
}
