package padraoTemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoGraduacaoTest {

    @Test
    void deveRetornarAprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaProva(7.0f);
        aluno.setNotaTrabalho(7.0f);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaProva(7.0f);
        aluno.setNotaTrabalho(6.9f);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.setNotaProva(7.0f);
        aluno.setNotaTrabalho(6.9f);
        aluno.setNome("Marcelo");
        aluno.setMatricula(2);
        assertEquals("Aluno{matricula=2, nome='Marcelo', resultado=Reprovado}", aluno.getInfo());
    }
}
