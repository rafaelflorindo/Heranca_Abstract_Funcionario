public class Assistente  extends Funcionario{
    public Assistente(String nome, String matricula, Double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calcularSalario() {
        double novoSalario = this.getSalario_base() + 500.00;
        this.setSalario_base(novoSalario);
        return novoSalario;
    }
}
