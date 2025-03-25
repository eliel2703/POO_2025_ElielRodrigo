class Pessoa {
    private String nome;
    private String matricula;

    public Pessoa(){
        this.nome = null;
        this.matricula = null;
    }

    public Pessoa(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

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
}

class Aluno extends Pessoa {
    private double nota;

    public Aluno(){
        super();
        this.nota = 0;
    }

    public Aluno(String nome, String matricula, double nota) {
        super(nome, matricula); 
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

}

class Professor extends Pessoa {
    private String disciplina;

    public Professor(){
        super();
        this.disciplina = null;
    }

    public Professor(String nome, String matricula, String disciplina) {
        super(nome, matricula); 
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void ensinarAula() {
        System.out.println("Professor " + getNome() + " está ensinando a disciplina: " + disciplina);
    }
}