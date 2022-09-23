/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.Janela;
import model.*;
import view.Aviso;
import view.Pedi;
/**
 *
 * @author UNIFGOLIVEIRA
 */
public class Controller {
    private Janela janela;
    private Pizza pizza;
    private Pedido pedido;
    private Pedi pedi;
    private Aviso aviso;
    private Cliente client;
    private int ped = 1;
    private ArrayList<Pizza> piz;
    private ArrayList<Pedido> pedd;
    public Controller(Janela janela){
        this.janela = janela;
        
        piz = new ArrayList<Pizza>();
        pedd = new ArrayList<Pedido>();
        pedi = new Pedi();
        aviso = new Aviso();
        
        
    }
    public Controller(Pedi pedi){
            this.pedi = pedi;        
            
        }    
    public Controller(Aviso aviso) {
            this.aviso = aviso;
    }    
    public void Concluir(){

                
        pedd.add(new Pedido(client,piz));
        
        pedi.getHist().append(("\nPedido " + ped +" - " +client+"\n")); 
            for(int u=0;u<piz.size();u++){
                String pi=(piz.get(u).montarPizza());
                pedi.getHist().append(pi+"\n");
            }
            
        aviso.getLabel1().setText("Pedido numero: "+ped);
        ped++;
        client = null;
        piz = new ArrayList<Pizza>();
        
        janela.getNome().setText("");
        janela.getTelefone().setText("");
        janela.getEndereco().setText("");   
        janela.getInformacao().setText("");
        
        
    }
    public void avi(){
        aviso.setVisible(true);
    }
    public void pedidoss(){

        pedi.setVisible(true);        
    }
    
    public void Queijo(){
        if(client == null){
            
            
            String nome = janela.getNome().getText();
            String tel = janela.getTelefone().getText();
            String end = janela.getEndereco().getText();
            client = new Cliente(nome,tel,end);        

            janela.getInformacao().setText(client.toString()); 
            
            

            pizza = new Queijo();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);            
            janela.getInformacao().append( "\n"+pizza.montarPizza() );            
        }
        else{
            

            pizza = new Queijo();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);                        
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                      
        }
 
        
        
        
    }
    
    public void FrangoCheddar(){
        if(client == null){
            String nome = janela.getNome().getText();
            String tel = janela.getTelefone().getText();
            String end = janela.getEndereco().getText();
            client = new Cliente(nome,tel,end);        

            janela.getInformacao().setText(client.toString()); 

                 
            pizza = new FrangoCheddar();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                         
        }
        else{
                   
            pizza = new FrangoCheddar();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                        
        }
        
    }
    public void FrangoCatupity(){
        if(client == null){
            String nome = janela.getNome().getText();
            String tel = janela.getTelefone().getText();
            String end = janela.getEndereco().getText();
            client = new Cliente(nome,tel,end);        

            janela.getInformacao().setText(client.toString());

                 
            
            pizza = new FrangoCatupity();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                      
        }
        else{
                   
            
            pizza = new FrangoCatupity();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                         
        }
          
    }
    public void Atum(){
        if(client == null){
            String nome = janela.getNome().getText();
            String tel = janela.getTelefone().getText();
            String end = janela.getEndereco().getText();
            client = new Cliente(nome,tel,end);        

            janela.getInformacao().setText(client.toString());

                   
            
            pizza = new Atum();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                         
        }
        else{
                        
            pizza = new Atum();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                                   
        }
          
    }
    
    public void Portuguesa(){
        if(client == null){
            String nome = janela.getNome().getText();
            String tel = janela.getTelefone().getText();
            String end = janela.getEndereco().getText();
            client = new Cliente(nome,tel,end);        

            janela.getInformacao().setText(client.toString());   
            
                       
            pizza = new Portuguesa();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                        
        }
        else{
            String tamanho = janela.getCombo().getSelectedItem().toString();              
            pizza = new Portuguesa();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );                   
        }
       
    }
    public void Calabresa(){
        if(client == null){
            String nome = janela.getNome().getText();
            String tel = janela.getTelefone().getText();
            String end = janela.getEndereco().getText();
            client = new Cliente(nome,tel,end);        

            janela.getInformacao().setText(client.toString());   
            
                    
            pizza = new Calabresa();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );            
        }
        else{
                        
            pizza = new Calabresa();
            pizza.setTamanho(janela.getCombo().getSelectedItem().toString());
            piz.add(pizza);
            janela.getInformacao().append( "\n"+pizza.montarPizza() );           
        }       
    }
}
