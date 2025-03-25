public class TesteProfessor {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Brunin");
        pessoa1.setMatricula("101201012-121");
        System.out.println("Nome: " + pessoa1.getNome() + " | Matrícula: " + pessoa1.getMatricula());

        Aluno aluno1 = new Aluno();
        aluno1.setNota(10);
        System.out.println("Nota: " + aluno1.getNota());

        Professor professor1 = new Professor();
        professor1.setDisciplina("Matemática");
        System.out.println("Disciplina: " + professor1.getDisciplina());
    }
}