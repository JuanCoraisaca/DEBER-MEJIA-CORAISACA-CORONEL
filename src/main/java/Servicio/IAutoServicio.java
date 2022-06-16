/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Auto;
import java.util.List;


/**
 *
 * @author usuario
 */
public interface IAutoServicio {
    
    public Auto crear(Auto auto);
    public Auto modificar(int codigoAuto, Auto autoNuevo);
    public Auto eliminar(int codigoAuto);
    public Auto buscarPorCodigo(int codigoAuto);
    public int buscarPosicion(Auto auto);
    public List<Auto> listar(); 
}
