/*1) Desenvolva um programa em java que leia o nome e a idade de 3 pessoas
e mostre o nome da pessoa mais velha e o nome da pessoa mais nova.*/

package apk;

import controlador.Entrada;
import controlador.Ordena;
import objeto.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	private static List<Pessoa> guardadados;

	public static void main(String[] args) {
		
		guardadados = new ArrayList<>();
		
		System.out.println("*** Insira 3 nomes com suas idades ***");
		
		Entrada entrada = new Entrada();
		guardadados = entrada.recebe();
		
		Ordena ordena = new Ordena();
		
		System.out.println(ordena.separadados(guardadados));		

	}

}
