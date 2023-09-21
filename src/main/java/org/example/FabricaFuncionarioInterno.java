package org.example;
public class FabricaFuncionarioInterno implements FabricaAbstrata{
    @Override
    public Holerite createHolerite() {
        return new HoleriteFuncionarioInterno();
    }
    @Override
    public Relatorio createRelatorio() {
        return new RelatorioFuncionarioInterno();
    }
}
