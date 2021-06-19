package calculadora;
/*
Crie uma classe Calculadora. Esta classe deve ser abstrata e implementar as
operações básicas (soma, subtração, divisão e multiplicação). Utilizando o
conceito de herança crie uma calculadora científica que implementa os seguintes
cálculos: raiz quadrada e a potência. Dica: utilize a classe Math do pacote
java.lang. Crie também um contador de instâncias (contador de objetos da
classe) para a classe da calculadora científica. Crie uma classe Principal para
testar os métodos desenvolvidos e o contador criado.
*/
public class CalculadoraMain {
    public static void main(String[] args) {
        CalculadoraCientifica calc1 = new CalculadoraCientifica();
        System.out.println("Número de instâncias da calculadora atualmente:");
        System.out.println(CalculadoraCientifica.getNumInstancias());

        System.out.println(calc1.somar(5, 5, 6.5, 88));
        System.out.println(calc1.multiplicar(5, 5, 6.5, 88));
        System.out.println(calc1.dividir(5, 5, 6.5, 88));
        System.out.println(calc1.subtrair(5, 5, 6.5, 88));
        System.out.println(calc1.potencia(5, 5));
        System.out.println(calc1.raizQuadrada(5));
        CalculadoraCientifica calc2 = new CalculadoraCientifica();

        System.out.println("Número de instâncias da calculadora atualmente:");
        System.out.println(CalculadoraCientifica.getNumInstancias());

        calc2 = null;
        System.gc();
        System.out.println("Número de instâncias da calculadora atualmente:");
        System.out.println(CalculadoraCientifica.getNumInstancias());

    }
}