package pe.edu.cibertec.azure_01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.cibertec.azure_01.viewmodel.VehiculoModel;

@Controller
public class VehiculoController {
    @GetMapping("/")
    public String obtenerVehiculo(Model model) {
        List<VehiculoModel> listVehiculos =  new ArrayList<VehiculoModel>();
        
        VehiculoModel auto1 = new VehiculoModel(01,"Toyota", "Modelo1", "Rojo", "ADF-010");
        VehiculoModel auto2 = new VehiculoModel(02,"Chevrolet", "Modelo2", "Negro", "ADF-011");
        VehiculoModel auto3 = new VehiculoModel(03,"Ford", "Modelo3", "Blanco", "ADF-012");
        VehiculoModel auto4 = new VehiculoModel(04,"Honda", "Modelo4", "Azul", "ADF-013");
        VehiculoModel auto5 = new VehiculoModel(05,"Fiat", "Modelo5", "Gris", "ADF-014");

        listVehiculos.add(auto1);
        listVehiculos.add(auto2);
        listVehiculos.add(auto3);
        listVehiculos.add(auto4);
        listVehiculos.add(auto5);
        
        // Agregando datos al modelo
        model.addAttribute("vehiculos", listVehiculos);
        return "vehiculo";
    }

}
