package calculadora;
abstract class Calculadora {

    public double somar(double... numbers) {  
        double result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) continue;
            try {
                result += numbers[i];
            } catch (ArithmeticException e) {
                System.out.println("Erro aritmético. Verifique os números inseridos.");
                return Double.NaN;
            } catch (Exception e) {
                System.out.println("Erro inesperado. Verifique os números inseridos.");
                return Double.NaN;
            }
        }
        return result;
    }

    public double subtrair(double... numbers) {
        double result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) continue;
            try {
                result -= numbers[i];
            } catch (ArithmeticException e) {
                System.out.println("Erro aritmético. Verifique os números inseridos.");
                return Double.NaN;
            } catch (Exception e) {
                System.out.println("Erro inesperado. Verifique os números inseridos.");
                return Double.NaN;
            }
        }
        return result;
    }

    public double multiplicar(double... numbers) {
        double result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) continue;
            try {
                result *= numbers[i];
            } catch (ArithmeticException e) {
                System.out.println("Erro aritmético. Verifique os números inseridos.");
                return Double.NaN;
            } catch (Exception e) {
                System.out.println("Erro inesperado. Verifique os números inseridos.");
                return Double.NaN;
            }
        }
        return result;
    }

    public double dividir(double... numbers) {
        double result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) continue;
            try {
                result /= numbers[i];
            } catch (ArithmeticException e) {
                System.out.println("Erro aritmético. Verifique os números inseridos.");
                return Double.NaN;
            } catch (Exception e) {
                System.out.println("Erro inesperado. Verifique os números inseridos.");
                return Double.NaN;
            }
        }
        return result;
    }

}