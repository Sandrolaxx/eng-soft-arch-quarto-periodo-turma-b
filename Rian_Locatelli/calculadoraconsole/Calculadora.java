import java.util.Scanner;

public class Calculadora {
    static Scanner ler = new Scanner(System.in);
    static float primeiroNumero = 0;
    static float segundoNumero = 0;
    public static void main(String[] args) {
        System.out.println("Digite um número:\n");
        primeiroNumero = ler.nextFloat();
        
        System.out.println("Digite qual operação deseja fazer:\n"
                + "1 - Adição\n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão\n");
        int operacao = ler.nextInt();
        
        System.out.println("Digite outro número:\n");
        segundoNumero = ler.nextFloat();
        while(segundoNumero == 0){
            System.out.println("Não é possível dividir por zero!\n"
                    + "Digite outro número novamente!\n");
            segundoNumero = ler.nextFloat();
        }
        
        switch(operacao){
            case 1:
                adicao();
                break;
            case 2:
                subtracao();
                break;
            case 3:
                multiplicacao();
                break;
            case 4:
                divisao();
                break;
            default:
                System.out.println("Operação Inválida!");
                break;
        }
    }
    
    public static void adicao(){
        System.out.println("Operação escolhida: Adição\n"
                + primeiroNumero + " + " + segundoNumero + " = " + (primeiroNumero + segundoNumero));
    }
    public static void subtracao(){
        System.out.println("Operação escolhida: Subtração\n"
                + primeiroNumero + " - " + segundoNumero + " = " + (primeiroNumero - segundoNumero));
    }
    public static void multiplicacao(){
        System.out.println("Operação escolhida: Multiplicação\n"
                + primeiroNumero + " * " + segundoNumero + " = " + (primeiroNumero * segundoNumero));
    }
    public static void divisao(){
        System.out.println("Operação escolhida: Divisão\n"
                + primeiroNumero + " / " + segundoNumero + " = " + (primeiroNumero / segundoNumero));
    }
}