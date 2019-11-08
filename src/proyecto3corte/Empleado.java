/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3corte;


/**
 *
 * @author Soporte_lab
 */
public class Empleado extends Persona{
    
    private String cargo;
    private String fechaDeIngreso;
    private String fechaDeSalida;
    private String tipoContrato;
    private String ARL;
    private String EPS;
    private String cesantias;
    private String pension;    
    

    public Empleado(String nombre, String apellido, int id, String nacimiento, String direccion, String email, String genero, int NHijos, String estadoCivil, String profesion, String nivelEducativo, String cargo, String fechaDeIngreso, String fechaDeSalida, String tipoContrato, String ARL, String EPS, String cesantias, String pension) {
        super(nombre, apellido, id, nacimiento, direccion, email, genero, NHijos, estadoCivil, profesion, nivelEducativo);
        this.cargo = cargo;
        this.fechaDeIngreso = fechaDeIngreso;
        this.fechaDeSalida = fechaDeSalida;
        this.tipoContrato = tipoContrato;
        this.ARL = ARL;
        this.EPS = EPS;
        this.cesantias = cesantias;
        this.pension = pension;
    }

    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getARL() {
        return ARL;
    }

    public void setARL(String ARL) {
        this.ARL = ARL;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getCesantias() {
        return cesantias;
    }

    public void setCesantias(String cesantias) {
        this.cesantias = cesantias;
    }

    public String getPension() {
        return pension;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }
    
    
}
