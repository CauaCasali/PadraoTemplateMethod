package padraoTemplateMethod;

public class AlunoGraduacao extends Aluno {

    public String verificarAprovacao() {
        if (this.calcularMediaNotas() >= this.getMediaCorte()) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    public float getMediaCorte() {
        return 7.0f;
    }

}
