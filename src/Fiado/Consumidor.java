package Fiado;

public class Consumidor {
	
	// Atributos
	private String nome;
	private int[] fiados;
	private String telefone;
	private int posicao = 0;
	
	// Construtor
	public Consumidor(String nome, int compras, String telefone) {
		this.nome = nome;
		this.fiados = new int[compras];
		this.telefone = telefone;
	}
	
	// GETTER E SETTER
	public String getNome( ) {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
	
	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
}
 