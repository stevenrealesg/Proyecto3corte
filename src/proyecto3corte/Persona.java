/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3corte;


/**
 *
 * @author sreales4
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int id;
    private String nacimiento;
    private String direccion;
    private String email;
    private String genero;
    private int NHijos;
    private String estadoCivil;
    private String profesion;
    private String nivelEducativo;

    public Persona(String nombre, String apellido, int id, String nacimiento, String direccion, String email, String genero, int NHijos, String estadoCivil, String profesion, String nivelEducativo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nacimiento = nacimiento;
        this.direccion = direccion;
        this.email = email;
        this.genero = genero;
        this.NHijos = NHijos;
        this.estadoCivil = estadoCivil;
        this.profesion = profesion;
        this.nivelEducativo = nivelEducativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNHijos() {
        return NHijos;
    }

    public void setNHijos(int NHijos) {
        this.NHijos = NHijos;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }
    
}
