public class Nota {
    private double nota1;
    private double nota2;
    private Turma turma;

    public Nota(double nota1, double nota2, Turma turma) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.turma = turma;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
