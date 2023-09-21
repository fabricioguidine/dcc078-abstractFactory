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
        assertEquals("Holerite do Funcionário: Interno.", funcionario.emitirHolerite());
    }
    @Test
    void deveEmitirHoleriteFuncionarioTerceirizado() {
        FabricaAbstrata fabrica = new FabricaFuncionarioTerceirizado();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Holerite do Funcionário: Terceirizado.", funcionario.emitirHolerite());
    }
    @Test
    void deveEmitirRelatorioFuncionarioInterno() {
        FabricaAbstrata fabrica = new FabricaFuncionarioInterno();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Relatório do Funcionário: Interno.", funcionario.emitirRelatorio());
    }
    @Test
    void deveEmitirRelatorioFuncionarioTerceirizado() {
        FabricaAbstrata fabrica = new FabricaFuncionarioTerceirizado();
        Funcionario funcionario = new Funcionario(fabrica);
        assertEquals("Relatório do Funcionário: Terceirizado.", funcionario.emitirRelatorio());
    }
}
