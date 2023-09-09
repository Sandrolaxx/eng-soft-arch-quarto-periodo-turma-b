package com.mycompany.calculadora;

import java.util.Scanner;

public class Principal {
    
    private static float a;
    private static float b;
    
    private static final Scanner scan = new Scanner(System.in);    
    
    public static void main(String[] args) {

        pedirOperacao();

        
        
    }
    
    public static void pedirOperacao() {
        
        System.out.println("Qual operacao matematica deseja realizar?");
        System.out.println("[ 1 ] Soma");
        System.out.println("[ 2 ] Subtracao");
        System.out.println("[ 3 ] Divisao");
        System.out.println("[ 4 ] Multiplicacao");
        System.out.println("[ 0 ] Sair do programa");
        
        int op = scan.nextInt();
        
        OperacaoMatematica operacaoMatematica;
        
        switch (op) {
            case 1 -> {
                
                System.out.println("Digite o valor 1: ");  
                a = scan.nextFloat();
                
                System.out.println("Digite o valor 2: ");  
                b = scan.nextFloat();
                
                operacaoMatematica = new Soma();

                System.out.println("O resultado da soma entre " + a + " e " + b + " e de: " + operacaoMatematica.calcular(a, b));
                
                pedirOperacao();
 
            }
            case 2 -> {
                
                System.out.println("Digite o valor 1: ");  
                a = scan.nextFloat();
                
                System.out.println("Digite o valor 2: ");  
                b = scan.nextFloat();
                
                operacaoMatematica = new Subtracao();

                System.out.println("O resultado da subtracao entre " + a + " e " + b + " e de: " + operacaoMatematica.calcular(a, b));
                
                pedirOperacao();
                
            }
            case 3 -> {
                
                System.out.println("Digite o valor 1: ");  
                a = scan.nextFloat();
                
                System.out.println("Digite o valor 2: ");  
                b = scan.nextFloat();      
                
                if (b == 0) {
                    
                    System.out.println("Digite um valor diferente de 0 no valor 2");
            
                    pedirOperacao();
                    
                } else{
                
                    operacaoMatematica = new Divisao();

                    System.out.println("O resultado da divisao entre " + a + " e " + b + " e de: " + operacaoMatematica.calcular(a, b));
                    
                    pedirOperacao();
                
                }
  
            }
            case 4 -> {
                
                System.out.println("Digite o valor 1: ");  
                a = scan.nextFloat();
                
                System.out.println("Digite o valor 2: ");  
                b = scan.nextFloat();

                operacaoMatematica = new Multiplicacao();

                System.out.println("O resultado da multiplicacao entre " + a + " e " + b + " e de: " + operacaoMatematica.calcular(a, b));
                
                pedirOperacao();
                
            }
            case 0 -> {
            
                System.exit(0);
            
            }
            default -> {
                
                System.out.println("Selecione uma opcao valida!");   
                pedirOperacao();
                
            }
        }
            
    }



    

    
    
}
