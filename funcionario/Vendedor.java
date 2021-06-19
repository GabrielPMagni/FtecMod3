package funcionario;

public class Vendedor extends Funcionario {
    public double valorComissao = 0;

    @Override
    public double calculaSalario() {
        return this.horasTrabalhadas * this.valorHora + this.valorComissao;
    }
}
