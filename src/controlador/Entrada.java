package controlador;

import objeto.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrada {
	
	private static Scanner entrada;
	private List<Pessoa> dados;

	
	public List<Pessoa> recebe() {
			
			dados = new ArrayList<>();
			
			for(int i = 1; i < 4; i++) {
				
				entrada = new Scanner(System.in);
				
				System.out.print("Insira o " + i + "° nome = ");
				String auxiliar1 = entrada.nextLine();
				
				System.out.print("Insira sua idade = ");
				int auxiliar2 = entrada.nextInt();
				
				Pessoa pessoa = new Pessoa(auxiliar1, auxiliar2);
				dados.add(pessoa);
				
			}
			
			return dados;
			
	}

}
