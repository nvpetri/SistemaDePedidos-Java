package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Pedido;
import br.senai.sp.jandira.model.Produto;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        //Criar Cliente
        Cliente cliente1 = new Cliente();
                cliente1.nome = "João Pefeijão";
                cliente1.email = "jaopefeijao@gmail.com";
                cliente1.telefone = "(11) 98210-9610";

                //Criar Produto

        Produto prod1 = new Produto();
        prod1.descricao = "Mouse P301 Pichau";
        prod1.valor = 150.0;

        Produto prod2 = new Produto();
        prod2.descricao = "Monitor Cepheus Pro 27'' ";
        prod2.valor = 1229.99;

        Produto prod3 = new Produto();
        prod3.descricao = "SSD Pichau Kepler 512GB";
        prod3.valor = 229.90;

        Pedido pedido = new Pedido();
        pedido.numero = 1028366457;
        pedido.valorTotal = 1789.99;
        pedido.dataPedido = LocalDate.of(2023, 7, 26);
        pedido.cliente = cliente1;
        pedido.produtos.add(prod3);
        pedido.produtos.add(prod1);
        pedido.exibirPedido();

    }

}
