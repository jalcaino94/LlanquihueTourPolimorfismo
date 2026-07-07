/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();
        gestor.cargarServicios();
        
        System.out.println("=== LLANQUIHUE TOUR - RECORRIDO POLIMÓRFICO ===");
        
        // Recorremos la lista desde la referencia de la superclase ServicioTuristico
        for (ServicioTuristico servicio : gestor.getLista()) {
            servicio.mostrarInformacion(); 
        }
    }
}