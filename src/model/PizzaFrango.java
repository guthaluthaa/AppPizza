/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author UNIFGOLIVEIRA
 */
public abstract class PizzaFrango extends Pizza {
    @Override
    public String montarPizza(){
        return ("Pizza de Frango " + getTamanho() + " R$16,00");
    }      
         
}
