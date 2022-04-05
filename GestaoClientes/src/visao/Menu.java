package visao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import modelo.Cliente;
import modelo.Funcionario;
import modelo.Pessoa;
import modelo.Vendas;

public class Menu {

	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Cliente> clientes = new ArrayList<>();
	private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
	private static ArrayList<Vendas> vendas = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		int menu = 0;
		while(menu != 6) {
			System.out.print("\n=== Gest�o de Clientes e Funcionarios ===");
			System.out.println("\n1 - Cadastrar Cliente"
					+ "\n2 - Cadastrar Funcionario"
					+ "\n3 - Listar Cliente"
					+ "\n4 - Listar Funcionario"
					+ "\n5 - Cadastrar Venda"
					+ "\n6 - Sair");
			
			System.out.print("Digite a op��o que deseja: ");
			menu = scan.nextInt();
			
			if(menu > 6) {
				System.out.println("Op��o Incorreta.");
			}
			switch(menu) {
			case 1:
				cadastrarCliente();
				break;
			case 2:
				cadastrarFuncionario();
				break;
			case 3:
				listarClientes();
				break;
			case 4:
				listarFuncionarios();
				break;
			case 5:
				cadastrarVenda();
				break;
			case 6:
				System.out.println("Voc� Saiu.");
				break;
			}
		}
	}
	
	private static void cadastrarCliente() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("--- Cadastrar Cliente ---");
		System.out.println("Nome\tTelefone\tData de Nascimento\tID\tCr�dito");
		Cliente cliente = new Cliente(scan.next(), scan.next(), df.parse(scan.next()), scan.nextInt(), scan.nextDouble());
		clientes.add(cliente);
	}
	
	private static void cadastrarFuncionario() throws ParseException{
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("--- Cadastrar Funcionario ---");
		System.out.println("Nome\tTelefone\tData de Nascimento\tMatr�cula\tComiss�o");
		Funcionario funcionario = new Funcionario(scan.next(), scan.next(), df.parse(scan.next()), scan.nextInt(), scan.nextDouble());
		funcionarios.add(funcionario);
	}
	
	private static void listarClientes() {
		System.out.println("--- Listar Clientes ---");
		for(Cliente c: clientes) {
			System.out.println(c.toString());
		}
	}
	
	private static void listarFuncionarios() {
		System.out.println("--- Listar Funcionario ---");
		for(Funcionario f: funcionarios) {
			System.out.println(f.toString());
		}	
	}
	
	private static void cadastrarVenda() throws ParseException {
		System.out.println("--- Cadastrar Vendas ---");
		System.out.print("Digite a Matr�cula do Funcion�rio: ");
		int matricula = scan.nextInt();
		
		for(Funcionario f: funcionarios) {
			if (f.getMatricula() == matricula) {
				
				System.out.println("Id Cliente\tValor da Venda ");
				Vendas venda = new Vendas(scan.nextInt(), scan.nextFloat());
				vendas.add(venda);
				System.out.println("Comiss�o: ");
				System.out.println(venda.getValor());
			} else {
				System.out.println("Funcion�rio n�o encontrado");
				break;
			}
		}
	}
}