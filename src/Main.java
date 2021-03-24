
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p1= new Pizza();
		p1.adicionaIngredientes("Calabresa");
		p1.adicionaIngredientes("Calabresa");
		p1.adicionaIngredientes("Queijo");
		
		Pizza p2= new Pizza();
		p2.adicionaIngredientes("Calabresa");
		p2.adicionaIngredientes("Queijo");
		
		Pizza p3= new Pizza();
		p3.adicionaIngredientes("Calabresa");
		p3.adicionaIngredientes("Salame");
		p3.adicionaIngredientes("Queijo");
		p3.adicionaIngredientes("Picles");
		
		CarrinhoDeCompras Carrinho = new CarrinhoDeCompras();
		Carrinho.adicionaPizza(p1);
		Carrinho.adicionaPizza(p2);
		Carrinho.adicionaPizza(p3);
		
		Carrinho.getCarrinho();
	}

}
