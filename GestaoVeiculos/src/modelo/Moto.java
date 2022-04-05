package modelo;

public class Moto extends Veiculo{
	
	private int cilindradas;
	
	public Moto() {
	}
	
	public Moto(String placa, int anoModelo, int anoFabricacao, String modelo, String marca, double valor, int cilindradas) {
		super(placa, anoModelo, anoFabricacao, modelo, marca, valor);
		this.cilindradas = cilindradas;
	}
	
	public String toString() {
		return "Cilindradas: " + cilindradas + "\n" + super.toString();
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
}