package org.example;

import java.util.ArrayList;

public class Restaurante {
    String nome;
    Double avaliacao;
    ArrayList<Item> menu = new ArrayList<>();
    void getNome() {
        System.out.println("Nome: " + nome);
        };
    void adicionarItem(Item item) {
        menu.add(item);
    }
    void imprimirMenu() {
        for (Item item : menu){
            System.out.println(item.nome + ":" + item.preco);
        }
    }
}
