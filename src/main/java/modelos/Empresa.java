package modelos;

import java.util.List;
import java.util.Objects;

public class Empresa {

    private Integer identificador;
    private String codigoEmpresa;
    private List<Empleado> empleados;
    private  Enum TipoEmpresa;


    public Empresa() {
    }

    public Empresa(Integer identificador, String codigoEmpresa, List<Empleado> empleados, Enum tipoEmpresa) {
        this.identificador = identificador;
        this.codigoEmpresa = codigoEmpresa;
        this.empleados = empleados;
        TipoEmpresa = tipoEmpresa;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(String codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Enum getTipoEmpresa() {
        return TipoEmpresa;
    }

    public void setTipoEmpresa(Enum tipoEmpresa) {
        TipoEmpresa = tipoEmpresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(identificador, empresa.identificador) && Objects.equals(codigoEmpresa, empresa.codigoEmpresa) && Objects.equals(empleados, empresa.empleados) && Objects.equals(TipoEmpresa, empresa.TipoEmpresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador, codigoEmpresa, empleados, TipoEmpresa);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "identificador=" + identificador +
                ", codigoEmpresa='" + codigoEmpresa + '\'' +
                ", empleados=" + empleados +
                ", TipoEmpresa=" + TipoEmpresa +
                '}';
    }
}

