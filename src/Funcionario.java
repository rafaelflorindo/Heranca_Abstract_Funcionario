abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salario_base;

    public Funcionario(String nome, String matricula, Double salario_base){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setSalario_base(salario_base);
    }

    abstract public double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }
}
