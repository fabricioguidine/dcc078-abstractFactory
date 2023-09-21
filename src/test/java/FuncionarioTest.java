import org.example.FabricaFuncionarioInterno;
import org.example.FabricaFuncionarioTerceirizado;
import org.example.Funcionario;
import org.example.FabricaAbstrata;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FuncionarioTest {
    @Test
    void deveEmitirHoleriteFuncionarioInterno() {
        FabricaAbstrata fabrica = new FabricaFuncionarioInterno();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Holerite Funcionário: Interno.", funcionario.emitirHolerite());
    }
    @Test
    void deveEmitirHoleriteFuncionarioTerceirizado() {
        FabricaAbstrata fabrica = new FabricaFuncionarioTerceirizado();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Holerite Funcionário: Terceirizado.", funcionario.emitirHolerite());
    }
    @Test
    void deveEmitirRelatorioFuncionarioInterno() {
        FabricaAbstrata fabrica = new FabricaFuncionarioInterno();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Relatório Funcionário: Interno.", funcionario.emitirRelatorio());
    }
    @Test
    void deveEmitirRelatorioFuncionarioTerceirizado() {
        FabricaAbstrata fabrica = new FabricaFuncionarioTerceirizado();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Relatório Funcionário: Terceirizado.", funcionario.emitirRelatorio());
    }
}
