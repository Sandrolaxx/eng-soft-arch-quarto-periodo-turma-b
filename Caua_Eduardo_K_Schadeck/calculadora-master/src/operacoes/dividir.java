package operacoes;

public class dividir {
   public static double calcular (double num1, double num2){
       if(num1 == 0 || num2 == 0) {
           System.out.println("Erro!\n Não é possível dividir por 0");

       }
        return num1 / num2;
    }
}
