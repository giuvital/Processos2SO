package view;

import java.util.Scanner;

import controller.RedesController;

public class Main {

	public static void main(String[] args) {
		
		RedesController redesController = new RedesController();
		String os = null;
		System.out.println(os);
		int opc = 0;
		int pid;
		String nome;
		Scanner scanner = new Scanner(System.in);
		
		
		while (opc != 7) {
			System.out.println("Escolha uma opção para iniciar: \n 1 - Método identifica SO \n 2 - Listar Processos \n 3 - Matar processo por PID \n 4 - Matar processo por nome \n 7 - Finalizar");
			opc = scanner.nextInt();
			switch (opc) {
			case 1:
				os = redesController.indentificaSO();
			break;
			
			case 2:
				redesController.listarProcessos(os);
			break;
			case 3:
				System.out.println("Digite o PID: ");
				pid = scanner.nextInt();
				redesController.matarProcessoPID(pid, os);
			break;
			case 4:
				System.out.println("Digite o nome do processo: ");
				nome = scanner.next();
				redesController.matarProcessoNome(nome, os);
			break;
			case 7:
				System.out.println("Finalizado!");
			break;
			default:
				System.out.println("Opção invalida");
			break;
			}
			
		}
	}
}
		
		

	