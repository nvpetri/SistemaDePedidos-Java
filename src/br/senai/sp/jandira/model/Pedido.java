package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    public int numero;
    public double valorTotal;
    public LocalDate dataPedido;
    public Cliente cliente;
    public List<Produto> produtos = new ArrayList<>();

    public void exibirPedido(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Pedido: " + numero);
        System.out.println("-----------------------------------------------------");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("-----------------------------------------------------");
        System.out.println("Tel. Cliente: " + cliente.telefone);
        System.out.println("-----------------------------------------------------");
        System.out.println("Itens do pedido");
        for (Produto p : produtos){
            System.out.println(p.descricao);
        }
        System.out.println("-----------------------------------------------------");

    }

}
