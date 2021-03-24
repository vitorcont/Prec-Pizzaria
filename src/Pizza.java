import java.util.Map;
import java.util.HashMap;

public class Pizza {
	int numIngredientes=0;
	static int numIngredientesTotal=0; 
	static Map <String,Integer> listaIngredientes = new HashMap<String,Integer>();
	
	
	
	public void adicionaIngredientes(String novo)
	{
		if (listaIngredientes.containsKey(novo))
		{
			int num = listaIngredientes.get(novo);
			listaIngredientes.put(novo,num+1);
		}
		else
			listaIngredientes.put(novo, 1);
		numIngredientes++;
		contabilizaIngrediente();
	}
	
	public int getPreco()
	{
		if(numIngredientes<3)
			return 15;
		else if(numIngredientes<6)
			return 20;
		else
			return 23;
	}
	public static void contabilizaIngrediente()
	{
		numIngredientesTotal++;
	}
	
	public static void getIngredientes()
	{
		for (Map.Entry<String, Integer> saida : listaIngredientes.entrySet()) 
		{ 
			System.out.printf("\n%dX ",saida.getValue());
			System.out.printf(saida.getKey()); 
		}
	}
}

// Pizza
// Ingredientes
// Preço

//adicionaIngredientes(Str)
//getPreço
//getIngredientes
