package padraoTemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoExtensaoTest {

    @Test
    void deveRetornarAprovado() {
        AlunoExtensao aluno = new AlunoExtensao();
        aluno.setNotaProva(5.0f);
        aluno.setNotaTrabalho(5.0f);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovado() {
        AlunoExtensao aluno = new AlunoExtensao();
        aluno.setNotaProva(5.0f);
        aluno.setNotaTrabalho(4.9f);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoExtensao aluno = new AlunoExtensao();
        aluno.setNotaProva(5.0f);
        aluno.setNotaTrabalho(4.9f);
        aluno.setNome("Marcelo");
        aluno.setMatricula(2);
        assertEquals("AlunoExtensao{matricula=2, nome='Marcelo', resultado=Reprovado}", aluno.getInfo());
    }
}
