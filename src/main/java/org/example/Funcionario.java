package org.example;

public class Funcionario {
    private Holerite holerite;
    private Relatorio relatorio;
    public Funcionario(FabricaAbstrata fabrica) {
        this.holerite = fabrica.createHolerite();
        this.relatorio = fabrica.createRelatorio();
    }
    public String emitirDiploma() {
        return this.holerite.emitir();
    }
    public String emitirHistorico() {
        return this.relatorio.emitir();
    }
}