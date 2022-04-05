package modelo;

import java.util.Date;

public class Vendas{
	
	private int codCliente;
	private float valor;
	
	public Vendas() {
		}
	
	public Vendas(int codCliente, float valor) {
		this.codCliente = codCliente;
		this.valor = valor;
	}
	
	public String toString() {
		return "Código do Cliente: " + codCliente + "\n" + "Valor: " + valor;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public float getValor() {
		return (valor * 10) / 100 ;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}