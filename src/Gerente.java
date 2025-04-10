public class Gerente extends Funcionario{
    public Gerente(String nome, String matricula, Double salario_base) {
        super(nome, matricula, salario_base);
    }

    @Override
    public double calcularSalario() {
        double novoSalario = this.getSalario_base() * 2;
        this.setSalario_base(novoSalario);
        return novoSalario;
        //return this.getSalario_base() * 2;
    }
}
