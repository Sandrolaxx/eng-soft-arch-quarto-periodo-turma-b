package calc;

import java.util.Scanner;

public class Numeros {
    
    public static float result;
    public static float num1;
    public static float num2;

        public static void setNum1(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual é o Primeiro Número? \n");
                num1 = scanner.nextFloat();
        }
        
        public static float getNum1() {
            return num1;
        }

        public static void setNum2(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Qual é o Segundo Número? \n");
                num2 = scanner.nextFloat();
        }

        public static float getNum2() {
            return num2;
        }
        public static void setResult(float result) {
            Numeros.result = result;
        }
        public static float getResult() {
            return result;
        }

    }