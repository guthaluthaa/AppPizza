/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author UNIFGOLIVEIRA
 */
public class Queijo extends Pizza {
    @Override
    public String montarPizza(){
        return ("Pizza de Queijo " + getTamanho() + " R$12,00");
    }   
    
}
