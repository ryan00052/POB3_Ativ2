package faeterj;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		int carga_horaria = 0;
		String nome = "", sigla = "", turma = "", professor = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da Disciplina.");
		System.out.print(">> ");
		nome = sc.next();
		
		sc.nextLine();
		
		System.out.println("Digite a sigla da disciplina.");
		System.out.print(">> ");
		sigla = sc.next();
		
		sc.nextLine();
		
		System.out.println("Digite o nome da turma.");
		System.out.print(">> ");
		turma = sc.next();
		
		sc.nextLine();
		
		System.out.println("Digite o nome do professor.");
		System.out.print(">> ");
		professor = sc.next();
		
		sc.nextLine();
		
		System.out.println("Digite a carga horária da disciplina.");
		System.out.print(">> ");
		carga_horaria = sc.nextInt();
		
		
		Disciplina disciplina = new Disciplina(nome, sigla, turma, professor, carga_horaria);
		
		System.out.println("Nome: " + disciplina.getNome());
		System.out.println("Disciplina: " + disciplina.getSigla());
		System.out.println("Turma: " + disciplina.getTurma());
		System.out.println("Matricula: " + disciplina.getProfessor());
		System.out.println("Carga Horaria: " + disciplina.getCarga_Horaria());
		System.out.println("Disciplina: " + disciplina.toString());
		
		sc.close();
	}

}
