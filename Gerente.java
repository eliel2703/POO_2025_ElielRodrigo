

class Gerente extends Funcionario { 
    private int senha;
    private int numDeFuncionarioGerenciados;

    public Gerente(){
        super();
        this.senha = 0;
        this.numDeFuncionarioGerenciados = 0;
    }

    public Gerente(String nome, String cpf, double salario, int senha, int numDeFuncionarioGerenciados){
        super(nome, cpf, salario);
        this.senha = senha;
        this.numDeFuncionarioGerenciados = numDeFuncionarioGerenciados;
    }

    public boolean autentica(int senha){
        return this.senha == senha;
    }

    public int getSenha() {
        return this.senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }


    public int getNumDeFuncionarioGerenciados() {
        return this.numDeFuncionarioGerenciados;
    }

    public void setNumDeFuncionarioGerenciados(int numDeFuncionarioGerenciados) {
        this.numDeFuncionarioGerenciados = numDeFuncionarioGerenciados;
    }

}