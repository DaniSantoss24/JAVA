package modelo;

import java.util.Date;

public class Funcionario extends Pessoa{

	private int matricula;
	private double comissao;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, String telefone, Date nascimento, int matricula, double comissao) {
		super(nome, telefone, nascimento);
		this.matricula = matricula;
		this.comissao = comissao;
	}
	
	public String toString() {
		return "Matrícula: " + matricula + "\n" + "Comissão: " + comissao + "\n" + super.toString();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
