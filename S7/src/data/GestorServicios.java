/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import model.RutaGastronomica;
import model.ServicioTuristico;
import java.util.ArrayList;
import java.util.List;

public class GestorServicios {
   
    private List<ServicioTuristico> lista = new ArrayList<>();
    
    public void cargarServicios() { 
        // Instanciamos exactamente 5 objetos según la rúbrica
        lista.add(new RutaGastronomica(4, "Sabores del Sur", 5));
        lista.add(new RutaGastronomica(3, "Ruta del Queso Chiloé", 4));
        lista.add(new RutaGastronomica(5, "Tour de Mariscales Puerto Montt", 6));
        lista.add(new RutaGastronomica(2, "Circuito de Humahuaca", 3));
        lista.add(new RutaGastronomica(4, "Sabores Lacustres Frutillar", 4));
    }
             
    public List<ServicioTuristico> getLista() {
        return lista;
    } 
}