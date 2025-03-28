public class Funcionario { 

    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(){
        this.nome = null;
        this.cpf = null;
        this.salario = 0;
    }
    
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }


    public String getNome(){
        return this.nome;
    }

  
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }


    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}