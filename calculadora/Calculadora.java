package calculadora;

public class Calculadora {
    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }

    public static int dividir(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }
}
