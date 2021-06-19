package funcionario;

public class Professor extends Funcionario {
    
    @Override
    public double calculaSalario() {
        return this.horasTrabalhadas * this.valorHora;
    }

}
