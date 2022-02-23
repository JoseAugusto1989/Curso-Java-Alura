public class Gerente extends Funcionario {

    private Integer senha;


    public Gerente() {

    }

    public Gerente(Integer senha) {
        this.senha = senha;
    }

    public Integer getSenha() {
        return senha;
    }
    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Gerente: " +
                "senha= " + senha;
    }

    public double bonificacao() {
        return (super.getSalario() * 0.1) + super.getSalario();
    }
}
