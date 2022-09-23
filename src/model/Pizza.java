/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author UNIFGOLIVEIRA
 */
public abstract class Pizza {
        private String tamanho;
        private Double preco;
        private ArrayList<String> ingredientes;

    public Pizza(String tamanho) {
        this.tamanho = tamanho;
    }

    public Pizza() {
    }
        
    public abstract String montarPizza();

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }
        
        
}

