package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author hulys
 */
public class Calculator {

    public static void main(String[] args) {
        
        Scanner answer = new Scanner(System.in);
        double result;
        double number1;
        double number2;
        int opcao = 0; 
        String action = "s";
        
        Operations operation = null;
        
        System.out.println(" == === == === Calculadora === == === == \n ");
        
        while (action.equalsIgnoreCase("s")) {
            
            while (opcao < 1 || opcao > 4) {  
                System.out.println("\n Digite o número da opção desejada: \n 1 - SOMA; \n 2 - SUBTRAÇÃO; \n 3 - MULTIPLICAÇÃO; \n 4 - DIVISÃO.");
                opcao = answer.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println(" == === == === SOMA === == === == ");
                        operation = new Sum();
                        break;
                    case 2:
                        System.out.println(" == === == === SUBTRAÇÃO == === == === ");
                        operation = new Subtraction();
                        break;
                    case 3:
                        System.out.println(" == === == === MULTIPLICAÇÃO == === == === ");
                        operation = new Multiplication();
                        break;
                    case 4:
                        System.out.println(" == === == === DIVISÃO == === == === ");
                        operation = new Division();
                        break;
                    default:
                        System.out.println(" == === == === OPÇÃO INVÁLIDA == === == === ");
                        break;
                }  
            } 
            
            opcao = 0;

            System.out.println(" 1° valor: ");
            number1 = answer.nextDouble();
            System.out.println(" 2° valor: ");
            number2 = answer.nextDouble();

            if (opcao == 4 && number2 == 0){
                System.out.println(" ERRO: Divisão por zero não é permitida. ");
            } else {
                result = operation.calculation(number1, number2);
                System.out.println(" TOTAL = " + result);
            }    
            
            answer = new Scanner(System.in);
            
            System.out.println("\n  Deseje realizar um novo cálculo (s/n)? ");
            action = answer.nextLine();
        
        }
    }
}

