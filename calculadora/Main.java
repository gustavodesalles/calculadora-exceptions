package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repetir = true;
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora!");

        int opcao = 0;
        do {
            try {
                System.out.println("Digite a operação que deseja efetuar: ");
                System.out.println("1 - Somar");
                System.out.println("2 - Subtrair");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                opcao = input.nextInt();
                if (opcao > 4 || opcao < 1) {
                    System.out.println("Opção inválida.");
                } else {
                    repetir = false;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Favor inserir um número inteiro.");
                System.out.println(inputMismatchException.getMessage());
                input.nextLine();
            }
        } while (repetir);

        repetir = true;

        do {
            try {
                System.out.println("Digite o primeiro número: ");
                int num1 = input.nextInt();
                System.out.println("Digite o segundo número: ");
                int num2 = input.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println(Calculadora.soma(num1,num2));
                        break;
                    case 2:
                        System.out.println(Calculadora.subtracao(num1,num2));
                        break;
                    case 3:
                        System.out.println(Calculadora.multiplicar(num1,num2));
                        break;
                    case 4:
                        System.out.println(Calculadora.dividir(num1,num2));
                        break;
                    default:
                        break;
                }
                repetir = false;
            } catch (ArithmeticException arithmeticException) {
                System.out.println(arithmeticException.getMessage());
                System.out.println("O segundo número não pode ser 0 (zero).");
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Favor inserir um número inteiro.");
                System.out.println(inputMismatchException.getMessage());
                input.nextLine();
            }

        } while (repetir);



//        try {
//            System.out.println(Calculadora.soma(2, 3));
//            System.out.println(Calculadora.subtracao(5, 1));
//            System.out.println(Calculadora.multiplicar(4, 2));
//            System.out.println(Calculadora.dividir(5432, 0));
//        } catch (ArithmeticException e) {
//            System.out.println("Oops! I did it again");
//            System.out.println(e.getMessage());
//        }
    }
}
