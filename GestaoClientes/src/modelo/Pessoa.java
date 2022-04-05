package modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private Date nascimento;
	
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public Pessoa() {}
	
	public Pessoa(String nome, String telefone, Date nascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.nascimento = nascimento;
	}
	
	public String toString() {
		return "Nome: " + nome + "\n" + "Telefone: " + telefone + "\n" + "Data de Nascimento: " + df.format(nascimento);
	}
}
