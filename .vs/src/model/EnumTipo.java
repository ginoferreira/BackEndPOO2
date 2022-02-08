package model;

public enum EnumTipo {
    
    BASICO("Básico"), 
    MASTER("Master"), 
    PRESEDENCIAL("Suíte presidencial");

    private String valor;

    private EnumTipo(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
