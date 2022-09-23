/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author UNIFGOLIVEIRA
 */
public class Portuguesa extends Pizza {
    @Override
    public String montarPizza(){
        return ("Pizza Portuguesa " + getTamanho() + " R$24,00");
    }    
}
