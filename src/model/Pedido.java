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
public class Pedido {
    private Cliente cliente;
    private static int numero;
    private ArrayList<Pizza> pizzas;

    public Pedido(Cliente cliente, ArrayList<Pizza> pizzas) {
        this.cliente = cliente;
        this.pizzas = pizzas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList getPizzas() {
        ArrayList lista = new ArrayList();
        for(int i=0; i<pizzas.size();i++){
            lista.add(pizzas.get(i).montarPizza());
        }
        return lista;
    }
    
    
    
}
