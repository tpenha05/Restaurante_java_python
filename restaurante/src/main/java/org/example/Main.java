package org.example;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Restaurante> restaurantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu Principal:");
        System.out.println("1. Cadastrar restaurante");
        System.out.println("2. Listar restaurantes");
        System.out.println("3. Cadastrar item no menu de um restaurante");
        System.out.println("4. Sair");
        int option = scanner.nextInt();
        while (option != 4){
                if (option == 1){
                    Restaurante novo_restaurante = new Restaurante();
                    System.out.print("Digite o nome do restaurante: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    novo_restaurante.nome = nome;
                    System.out.print("Digite a avaliação: ");
                    novo_restaurante.avaliacao = scanner.nextDouble();
                    restaurantes.add(novo_restaurante);
                    System.out.println("Restaurante " + nome + " cadastrado");

            }
                if (option == 2){
                    for (int i=0; i < restaurantes.size(); i++ ) {
                        System.out.println(i + ":" + restaurantes.get(i).nome);
                        restaurantes.get(i).imprimirMenu();
                    }
                }

                if (option==3){
                    System.out.println("Digite o número do restaurante escolhido");
                    int idx = scanner.nextInt();
                    Restaurante restaurante = restaurantes.get(idx);
                    System.out.println("DIgite o nome do item: ");
                    scanner.nextLine();
                    String nomeItem = scanner.nextLine();
                    System.out.println("Digite o preço: ");
                    double precoItem = scanner.nextDouble();
                    Item item = new Item();
                    item.nome = nomeItem;
                    item.preco = precoItem;
                    restaurante.adicionarItem(item);
                    System.out.println("Item " + nomeItem + "adicionado ao restaurante "+ restaurante.nome);
                }
            System.out.println("Menu Principal:");
            System.out.println("1. Cadastrar restaurante");
            System.out.println("2. Listar restaurantes");
            System.out.println("3. Cadastrar item no menu de um restaurante");
            System.out.println("4. Sair");
            option = scanner.nextInt();
        }
        System.out.println("Obrigado por usar nosso sistema");
    }
}