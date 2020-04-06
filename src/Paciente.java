/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marianam
 */
public class Paciente implements Comparable<Paciente>{
    private String Nombre;
    private String Estado;
    private String Sintoma;
    
    //Compara el estado de los pacientes
    public int compareTo(Paciente pacient){
        return this.getEstado().compareTo(pacient.getEstado());
    }
    
    //Devuelve el nombre del paciente
    public String getNombre(){
        return Nombre;
    }
    
    //Ingresa el nombre del paciente
    public void setNombre(String nombre){
        this.Nombre=nombre;
    }
    
    //Devuelve el estado del paciente
    public String getEstado(){
        return Estado;
    }
    
    //Ingresa el estado del paciente
    public void setEstado(String estado){
        this.Estado=estado;
    }
    
    //Devuelve el sintoma del paciente
    public String getSintoma(){
        return Sintoma;
    }
    
    //Ingresa el nombre del paciente
    public void setSintoma(String sintoma){
        this.Sintoma=sintoma;
    }
    
}
