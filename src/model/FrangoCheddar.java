/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author UNIFGOLIVEIRA
 */
public class FrangoCheddar extends PizzaFrango {
    @Override
    public String montarPizza(){
        return ("Pizza de Frango com Cheddar " + getTamanho() + " R$20,00");
    }      
}
