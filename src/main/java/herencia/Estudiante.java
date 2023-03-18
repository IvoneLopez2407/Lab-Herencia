/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import javax.swing.JOptionPane;

/**
 * @author Valentina Vargas
 */
public class Estudiante extends Persona {
    
    //ATRIBUTOS DE LA SUBCLASE ESTUDIANTE
    private String carnet;
    private double promedioNotas;
    private int numeroMaterias;

    //CONSTRUCTOR DE LA CLASE
    public Estudiante() {
    }
    //CONSTRUCTOR DE LA SUBCLASE
    public Estudiante(String nombre, String apellido, int edad, double peso, String carnet, int numeroMaterias) {
        super(nombre, apellido, edad, peso);
        this.carnet = carnet;
        this.numeroMaterias = numeroMaterias;
        this.promedioNotas = 0.0;
    }
    
    //METODOS DE ENCAPSULAMIENTO
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public double getPromedioNotas() {
        return promedioNotas;
    }
    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }
    public int getNumeroMaterias() {
        return numeroMaterias;
    }
    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
    //METODOS PROPIOS DEL ESTUDIANTE
    public void calcularPromedioNotas(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma = suma + nota;
        }
        this.promedioNotas = suma / notas.length;
    }
    
    public void imprimirReporteEstudiante() {
    //Usamos nuevamente la herencia para llamar los métodos que imprimen los datos del empleado
    imprimirDatosPersona();
    //Ahora imprimimos los datos propios del estudiante
    JOptionPane.showMessageDialog(null,"Carnet:  " +carnet);
    JOptionPane.showMessageDialog(null,"Numero de materias:  " + numeroMaterias);
    JOptionPane.showMessageDialog(null,"Promedio:  " + promedioNotas);
    }
}