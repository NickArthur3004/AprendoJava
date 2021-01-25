package br.com.devmedia.AprendendoJava.Aplicacao;

import br.com.devmedia.AprendendoJava.Dominio.Colecionador;
import br.com.devmedia.AprendendoJava.Dominio.Item;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome do colecionador: ");
        String name = sc.nextLine();

        Colecionador colecionador = new Colecionador(name);
        while(true) {
            System.out.println("=======================");
            System.out.print("Informe o nome do item: ");
            String nameItem = sc.nextLine();

            if(nameItem.isEmpty()){
                break;
            }

            System.out.println("Informe o ano que esse item foi fabricado");
            int anoCriacao = Integer.parseInt(sc.nextLine());

            Item item = new Item(nameItem, anoCriacao);
            colecionador.getColecao().add(item);
        }
        System.out.println("A coleção de "+ colecionador.getName()+" é "+colecionador.getColecao());

    }
}
