package modelo;

public class Veiculo {

	private String placa;
	private int anoModelo;
	private int anoFabricacao;
	private String modelo;
	private String marca;
	private double valor;
	
	public Veiculo() {
	}
	
	public Veiculo(String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor) {
		this.placa = placa;
		this.anoModelo = anoModelo;
		this.anoFabricacao = anoFabricacao;
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
	}
	
	public String toString() {
		return "Placa: " + placa + "\n" +  "Ano do Modelo: " + anoModelo + "\n" + "Ano de Fabricação: " + anoFabricacao + "\n" + "Modelo: " + modelo + "\n" + "Marca: " + marca + "\n" + "Valor: " + valor;
	}
}