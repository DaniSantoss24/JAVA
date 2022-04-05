package visao;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Carro;
import modelo.Moto;

public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Carro> carros = new ArrayList<>();
	private static ArrayList<Moto> motos = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int menu = 0;
		while(menu != 5) {
			System.out.print("\n=== Gestão de Veículos ===");
			System.out.println("\n1 - Cadastrar Carro"
					+ "\n2 - Cadastrar Moto"
					+ "\n3 - Listar Carros"
					+ "\n4 - Listar Motos"
					+ "\n5 - Sair");
			
			System.out.print("Digite a opção que deseja: ");
			menu = scan.nextInt();
			
			if(menu > 5) {
				System.out.println("Opção Incorreta.");
			}
			switch(menu) {
			case 1: 
				cadastrarCarro();
				break;
			case 2:
				cadastrarMoto();
				break;
			case 3:
				listarCarros();
				break;
			case 4:
				listarMotos();
				break;
			case 5:
				System.out.println("Você Saiu.");
				break;
			}
		}
	}
	
	private static void cadastrarCarro() {
		System.out.println("--- Cadastrar Carro ---");
		System.out.println("Placa\tAno do Modelo\tAno de Fabricação\tModelo\tMarca\tValor\tTipo\tPassageiros");
		Carro carro = new Carro(scan.next(), scan.nextInt(), scan.nextInt(), scan.next(), scan.next(), scan.nextDouble(), scan.next(), scan.nextInt());
		carros.add(carro);
	}
	
	private static void cadastrarMoto() {
		System.out.println("--- Cadastrar Carro ---");
		System.out.println("Placa\tAno do Modelo\tAno de Fabricação\tModelo\tMarca\tValor\tCilindradas");
		Moto moto = new Moto(scan.next(), scan.nextInt(), scan.nextInt(), scan.next(), scan.next(), scan.nextDouble(), scan.nextInt());
		motos.add(moto);
	}
	
	private static void listarCarros() {
		System.out.println("--- Listar Carros ---");
		for(Carro c: carros) {
			System.out.println(c.toString());
		}
	}
	
	private static void listarMotos() {
		System.out.println("--- Listar Motos ---");
		for(Moto m: motos) {
			System.out.println(m.toString());
		}
	}

}
