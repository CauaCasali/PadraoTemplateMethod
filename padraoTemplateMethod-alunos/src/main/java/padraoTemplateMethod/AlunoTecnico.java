package padraoTemplateMethod;

public class AlunoTecnico extends Aluno {

    public String verificarAprovacao() {
        if (this.calcularMediaNotas() >= this.getMediaCorte()) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    public float getMediaCorte() {
        return 6.0f;
    }

    @Override
    public String getTipoCurso() {
        return "AlunoTecnico";
    }
}
