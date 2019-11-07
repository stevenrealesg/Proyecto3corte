/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3corte;

import java.util.Date;

/**
 *
 * @author Soporte_lab
 */
public class Empleado {
    
    private String cargo;
    private Date fechaDeIngreso;
    private Date fechaDeSalida;
    private String tipoContrato;
    private String ARL;
    private String EPS;
    private String cesantias;
    private String pension;

    public Empleado(String cargo, Date fechaDeIngreso, Date fechaDeSalida, String tipoContrato, String ARL, String EPS, String cesantias, String pension) {
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

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Date fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
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
