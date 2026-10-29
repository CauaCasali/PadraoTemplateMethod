package padraoTemplateMethod;

public class AlunoExtensao extends Aluno {

    public String verificarAprovacao() {
        if (this.calcularMediaNotas() >= this.getMediaCorte()) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    public float getMediaCorte() {
        return 5.0f;
    }

    @Override
    public String getTipoCurso() {
        return "AlunoExtensao";
    }
}
