package models;

import java.util.ArrayList;
import java.util.List;

public class RegistroVendas {

    private List<Exemplar> lista = new ArrayList<>();
    private double total;
    //Polimorfismo
    public void adicionar(Exemplar item){
        System.out.println("Item adicionado " + item.getTitulo());
        total += item.getPreco();
        lista.add(item);
    }

    public void exibir(){
        System.out.println("-------------------------------------------------------");
        System.out.println("  ITENS COMPRADOS   ");
        System.out.println("Título adquirido    - Preço");
        lista.forEach(e ->
                System.out.println(e.getTitulo() + " -    " + e.getPreco()));
        System.out.println("-------------------------------------------------------" +
                "\nValor total da sua compra: R$ " + total);
    }

    public void teste(){

        for(Exemplar e : lista){
            System.out.println(e.getTitulo());
        }
    }
}
