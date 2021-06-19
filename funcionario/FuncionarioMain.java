package funcionario;

public class FuncionarioMain {
    public static void main(String[] args) {
        Vendedor vend1 = new Vendedor();
        vend1.horasTrabalhadas = 220;
        vend1.valorComissao = 20;
        vend1.valorHora = 8;

        System.out.println("Salário final do vendedor:");
        System.out.println(vend1.calculaSalario());

        Professor prof1 = new Professor();
        prof1.horasTrabalhadas = 220;
        prof1.valorHora = 8;

        System.out.println("Salário final do Professor:");
        System.out.println(prof1.calculaSalario());

    }
}
