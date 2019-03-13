package objeto;

public class Pessoa implements Comparable<Pessoa>{
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Pessoa outrapessoa) {
		
		if(this.idade < outrapessoa.getIdade())
			return -1;
			
		if(this.idade > outrapessoa.getIdade())
			return 1;
		
		return 0;
	}

}
