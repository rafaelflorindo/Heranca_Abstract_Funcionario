public class Vendedor extends Funcionario{
    private int comissao;

    public Vendedor(String nome, String matricula, Double salario_base, int comissao) {
        super(nome, matricula, salario_base);
        this.setComissao(comissao);
    }

    @Override
    public double calcularSalario() {
        double novoSalario = this.getSalario_base() +
                ((this.getSalario_base() * this.getComissao())/100);
        this.setSalario_base(novoSalario);
        return novoSalario;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }
}
