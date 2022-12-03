public class Main {
    public static void main(String[] args) {
        Aluno[] studentsHistory = new Aluno[3];
        studentsHistory[0] = new Aluno("João", 25);
        studentsHistory[1] = new Aluno("Sarah", 30);
        studentsHistory[2] = new Aluno("Luna", 18);

        Turma history = new Turma("História", studentsHistory);

        Aluno[] studentsGeography = new Aluno[2];
        studentsGeography[0] = new Aluno("João", 25);
        studentsGeography[1] = new Aluno("Luna", 18);

        Turma geography = new Turma("Geografia", studentsGeography);

        for(int i = 0; i < studentsHistory.length; i ++) {
            studentsHistory[i].setNota(Math.random() * 10, Math.random() * 10, history);
        }

        for(int i = 0; i < studentsGeography.length; i ++) {
            studentsGeography[i].setNota(Math.random() * 10, Math.random() * 10, history);
        }

        history.imprimir();
        System.out.println("");
        geography.imprimir();
    }
}