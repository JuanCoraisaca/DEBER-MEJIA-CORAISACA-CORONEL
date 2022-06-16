/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Auto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class AutoServicio implements IAutoServicio{
    
    private static List<Auto> autoList = new ArrayList<>();

    @Override
    public Auto crear(Auto auto) {
        this.autoList.add(auto);
        return auto;
  }

    @Override
    public Auto modificar(int codigoAuto, Auto autoNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoAuto));
        this.listar().get(posicion).setCodigo(autoNuevo.getCodigo());
        this.listar().get(posicion).setColor(autoNuevo.getColor());
        this.listar().get(posicion).setMarca(autoNuevo.getMarca());
        this.listar().get(posicion).setYear(autoNuevo.getYear());
        this.listar().get(posicion).setPrecio(autoNuevo.getPrecio());
        
        return autoNuevo;
        
  }

    @Override
    public Auto eliminar(int codigoAuto) {
        Auto auto=this.buscarPorCodigo(codigoAuto);
        var posicion=this.buscarPosicion(auto);
        this.listar().remove(posicion);
        return auto;
        
  }

    @Override
    public Auto buscarPorCodigo(int codigoAuto) {
        Auto auto=null;
        for(var b:this.autoList){
            if(codigoAuto==b.getCodigo()){
                auto=b;
                break;
            }
        }
        return auto;
   }

    @Override
    public int buscarPosicion(Auto auto) {
        int posicion=-1;
        for(var b:this.autoList){
            posicion++;
            if(b.getCodigo()==auto.getCodigo()){
                break;
            }
        }
        return posicion;
        
  }

    @Override
    public List<Auto> listar() {
        return this.autoList;
  }
    
}
