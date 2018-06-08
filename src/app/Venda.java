package app;

import helper.Factory;
import model.Compra;
import model.Item;

public class Venda {

	public static void main(String[] args) {
		
		Item produto1 = new Item("Arroz", 26, 3.75);
		Item produto2 = new Item("Leite",5, 4.00);
		Item produto3 = new Item("Racao",56, 8.50);
		Item produto4 = new Item("Carne",10,60.00);
		
		Compra compraDomingo = new Compra(produto1,7.75,100,false);
		Factory aplicandoDesconto = new Factory(compraDomingo); System.out.println(aplicandoDesconto.politicaDeDesconto());
		
		
		Compra compraSegunda = new Compra(produto2,1020.00,80,false);
		Factory aplicandoDescontoSeg = new Factory(compraSegunda); System.out.println(aplicandoDescontoSeg.politicaDeDesconto());
	
		Compra compraTerca = new Compra(produto3,67.00, 1999,true);
		Factory aplicandoDescontoTer = new Factory(compraTerca); System.out.println(aplicandoDescontoTer.politicaDeDesconto());
	    
		Compra compraQuarta = new Compra(produto4,125.00, 900,false);
		Factory aplicandoDescontoQua = new Factory(compraQuarta); System.out.println(aplicandoDescontoQua.politicaDeDesconto());
	
		
	
	}

}
