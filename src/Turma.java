public class Turma {
    private String nome;
    private Aluno[] alunos;
    public Aluno[] imprimir;
    public Turma(String nome, Aluno[] alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    public void imprimir() {
        for (int i = 0; i < this.alunos.length; i ++) {
            System.out.printf("O aluno %s tirou %.2f e %.2f na turma %s nesse bimestre\n", this.alunos[i].getNome(),
                    this.alunos[i].getNota().getNota1(), this.alunos[i].getNota().getNota2(), this.nome);
        }
    }
}
