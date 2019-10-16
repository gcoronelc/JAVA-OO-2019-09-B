/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.uni.project.service;

/**
 *
 * @author SAMUEL
 */
public class PedidoService2 {
    
    public double CalcularImpuesto( double importe){
        double impuesto;
        impuesto = importe *0.18;
        return impuesto;        
    }
    
    public double CalcularTotal( double importe){
        double impuesto, total;
        impuesto = CalcularImpuesto(importe);
        total = impuesto + importe;
        return total;        
    }
    
}
