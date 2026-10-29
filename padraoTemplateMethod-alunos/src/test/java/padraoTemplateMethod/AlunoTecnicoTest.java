package padraoTemplateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoTecnicoTest {

    @Test
    void deveRetornarAprovado() {
        AlunoTecnico aluno = new AlunoTecnico();
        aluno.setNotaProva(6.0f);
        aluno.setNotaTrabalho(6.0f);
        assertEquals("Aprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarReprovado() {
        AlunoTecnico aluno = new AlunoTecnico();
        aluno.setNotaProva(6.0f);
        aluno.setNotaTrabalho(5.9f);
        assertEquals("Reprovado", aluno.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        AlunoTecnico aluno = new AlunoTecnico();
        aluno.setNotaProva(6.0f);
        aluno.setNotaTrabalho(5.9f);
        aluno.setNome("Marcelo");
        aluno.setMatricula(2);
        assertEquals("AlunoTecnico{matricula=2, nome='Marcelo', resultado=Reprovado}", aluno.getInfo());
    }
}
