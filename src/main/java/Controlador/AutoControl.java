/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Auto;
import Servicio.AutoServicio;
import java.util.List;

/**
 *
 * @author usuario
 */
public class AutoControl {
    
    private final  AutoServicio autoServicio = new AutoServicio();
    
    
    public Auto crear(String [] args){
        
        Auto auto = new Auto(Integer.valueOf(args[0]),args[1],args[2]
                ,Integer.valueOf(3),Integer.valueOf(4));
        this.autoServicio.crear(auto);
        return auto;
    }
    public Auto buscarAuto(String arg){
        return this.autoServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Auto eliminar(String arg){
        
        return this.autoServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Auto modificar(String [] args){
        
        Auto autoNuevo = new Auto(Integer.valueOf(args[0]),args[1],args[2]
                ,Integer.valueOf(3),Integer.valueOf(4));
        this.autoServicio.modificar(Integer.valueOf(args[0]), autoNuevo);
        return autoNuevo;
    }
    
    
    
    public List<Auto> listar(){
        return this.autoServicio.listar();
    }
    
}
