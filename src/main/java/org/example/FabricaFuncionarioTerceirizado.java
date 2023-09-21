package org.example;
public class FabricaFuncionarioTerceirizado implements FabricaAbstrata{
    @Override
    public Holerite createHolerite() {
        return new HoleriteFuncionarioTerceirizado();
    }
    @Override
    public Relatorio createRelatorio() {
        return new RelatorioFuncionarioTerceirizado();
    }
}
