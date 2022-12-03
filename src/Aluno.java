public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private Nota nota;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public int getIdade(){
        return this.idade;
    }

    public Nota getNota() {
        return this.nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNota(double nota1, double nota2, Turma turma) {
        this.nota = new Nota(nota1, nota2, turma);
    }
}
