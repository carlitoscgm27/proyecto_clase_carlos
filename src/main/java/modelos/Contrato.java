package modelos;

import java.util.Objects;

public class Contrato {

    private Integer identificador;
    private Double salarioBase;
    private Enum TipoContrato;


    public Contrato() {
    }

    public Contrato(Integer identificador, Double salarioBase, Enum tipoContrato) {
        this.identificador = identificador;
        this.salarioBase = salarioBase;
        TipoContrato = tipoContrato;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Enum getTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(Enum tipoContrato) {
        TipoContrato = tipoContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contrato contrato = (Contrato) o;
        return Objects.equals(identificador, contrato.identificador) && Objects.equals(salarioBase, contrato.salarioBase) && Objects.equals(TipoContrato, contrato.TipoContrato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, salarioBase, TipoContrato);
    }

    @Override
    public String toString() {
        return "Contrato{" +
                "identificador=" + identificador +
                ", salarioBase=" + salarioBase +
                ", TipoContrato=" + TipoContrato +
                '}';
    }
}
