import java.util.Scanner;

public class StartApp {

    static Funcionario func;
    static Gerente gerente;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String nome, cpf;
        double salario;

        /*System.out.print("Digite o nome do funcionario: ");
            nome = scan.nextLine();
        System.out.print("Digite seu CPF: ");
            cpf = scan.nextLine();
        System.out.print("Digite o seu salario: ");
            salario = printDouble();*/

        //func = new Funcionario(nome, cpf, salario);

        gerente = new Gerente(1234);

        gerente.setNome("Carlos");
        gerente.setCpf("1098765283-98");
        gerente.setSalario(2345.65);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());
        System.out.println(func + "/n");
        System.out.println(gerente.bonificacao());

    }

    public static double printDouble() {
        double valor = scan.nextDouble();  scan.nextLine();
        return valor;
    }
}
