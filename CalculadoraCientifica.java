import java.lang.Math;

public class CalculadoraCientifica extends Calculadora {
    
    public double raizQuadrada(double number){
        try {
            double result = Math.sqrt(number);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético. Verifique os números inseridos.");
            return Double.NaN;
        } catch (Exception e) {
            System.out.println("Erro inesperado. Verifique os números inseridos.");
            return Double.NaN;
        }
    }

    public double potencia(double number1, double number2){
        try {
            double result = Math.pow(number1, number2);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Erro aritmético. Verifique os números inseridos.");
            return Double.NaN;
        } catch (Exception e) {
            System.out.println("Erro inesperado. Verifique os números inseridos.");
            return Double.NaN;
        }
    }

}
