package hopital;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FilaNormal filaN = new FilaNormal();
		FilaLeve filaL = new FilaLeve();
		FilaModerado filaM = new FilaModerado();
		FilaSevero filaS = new FilaSevero();
		GestaoHospital gestaoHospital = new GestaoHospital();
		int opcao;
		do {
			
			System.out.println("Selecione uma opção: ");
			System.out.println("1- Cadastrar Clientes ");
			System.out.println("2- Listar Clientes ");
			System.out.println("3- Sair ");
			
			opcao = scan.nextInt();
			switch (opcao) {
				case 1:
					gestaoHospital.criar();
					break;
				case 2:
					//Tiago coringou aqui e é isso
					//tive ideias melhores mas preciso decidir entre
					//fazer bonito ou fazer todas as atividades :(
					//... não tá funcionando.. deu certo return null meu amigo
					//não ta funcionando... novamente, eu tentei ao menos
					System.out.println(filaS.top());
					System.out.println(filaS.pop());
					
					System.out.println(filaM.top());
					System.out.println(filaM.pop());
					
					System.out.println(filaL.top());
					System.out.println(filaL.pop());
					
					System.out.println(filaS.top());
					System.out.println(filaS.pop());
					
					System.out.println(filaM.top());
					System.out.println(filaM.pop());
					
					System.out.println(filaS.top());
					System.out.println(filaS.pop());
					
					System.out.println(filaN.top());
					System.out.println(filaN.pop());
					break;
				case 3:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida. Tente de novo.");
					break;
			}
			
		
		}while (opcao != 3);
		scan.close();
	}
}
