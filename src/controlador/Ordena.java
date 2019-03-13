package controlador;

import java.util.Collections;
import java.util.List;

import objeto.Pessoa;

public class Ordena {
	
	public String separadados(List<Pessoa> pessoa) {
		
		Collections.sort(pessoa);
	
		return  pessoa.get(2).getNome() + " é o mais velho. Já o mais novo é o " + 
		pessoa.get(0).getNome();
		
	}

}
