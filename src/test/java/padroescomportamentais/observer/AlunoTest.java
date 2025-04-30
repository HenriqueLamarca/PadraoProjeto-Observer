//package padroescomportamentais.observer;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AlunoTest {
//
//    @Test
//    void deveNotificarUmAluno() {
//        StatusPedido turma = new StatusPedido(2021, 1, "Algoritmos", "A");
//        Pedido aluno = new Pedido("Aluno 1");
//        aluno.matricular(turma);
//        turma.lancarNotas();
//        assertEquals("Aluno 1, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", aluno.getUltimaNotificacao());
//    }
//
//    @Test
//    void deveNotificarAlunos() {
//        StatusPedido turma = new StatusPedido(2021, 1, "Algoritmos", "A");
//        Pedido aluno1 = new Pedido("Aluno 1");
//        Pedido aluno2 = new Pedido("Aluno 2");
//        aluno1.matricular(turma);
//        aluno2.matricular(turma);
//        turma.lancarNotas();
//        assertEquals("Aluno 1, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", aluno1.getUltimaNotificacao());
//        assertEquals("Aluno 2, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", aluno2.getUltimaNotificacao());
//    }
//
//    @Test
//    void naoDeveNotificarAluno() {
//        StatusPedido turma = new StatusPedido(2021, 1, "Algoritmos", "A");
//        Pedido aluno = new Pedido("Aluno 1");
//        turma.lancarNotas();
//        assertEquals(null, aluno.getUltimaNotificacao());
//    }
//
//    @Test
//    void deveNotificarAlunoTurmaA() {
//        StatusPedido turmaA = new StatusPedido(2021, 1, "Algoritmos", "A");
//        StatusPedido turmaB = new StatusPedido(2021, 1, "Algoritmos", "B");
//        Pedido aluno1 = new Pedido("Aluno 1");
//        Pedido aluno2 = new Pedido("Aluno 2");
//        aluno1.matricular(turmaA);
//        aluno2.matricular(turmaB);
//        turmaA.lancarNotas();
//        assertEquals("Aluno 1, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", aluno1.getUltimaNotificacao());
//        assertEquals(null, aluno2.getUltimaNotificacao());
//    }
//}