import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Vendedor("Marcos", "1234", 2589.65, 5));
        funcionarios.add(new Assistente("Wesley", "5678", 2550.58));
        funcionarios.add(new Gerente("Raica", "1472", 25850.58));

        for(int i = 0;  i < funcionarios.size(); i++){
            System.out.println(funcionarios.get(i).getNome());
            System.out.println(funcionarios.get(i).getSalario_base());
            System.out.println(funcionarios.get(i).calcularSalario());
        }

        for(Funcionario f: funcionarios){
            imprimir(f);
        }
    }
    public static void imprimir(Funcionario f){
        System.out.println("---------------------------");
        System.out.println("Nome: " + f.getNome());
        System.out.println("Salário Base: R$ " + f.getSalario_base());
        System.out.println("Novo salário: R$ : " + f.calcularSalario());
    }
}