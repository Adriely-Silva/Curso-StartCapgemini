package Questao05;

import java.util.Scanner;

/*5. Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto dessa
classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho.
Escreva os seguintes métodos para esta classe:
a. media final : calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
b. prova final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)*/
public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		register(student, scanner);
		
		System.out.println(student.toString());
		scanner.close();
	}
	
	public static void register(Student student, Scanner scanner) {
		System.out.println("Informe a matrícula do aluno:");
		Integer enrolment = scanner.nextInt();
		
		System.out.println("Informe o nome do aluno:");
		String name = scanner.next();
		
		System.out.println("Informe a nota da primeira prova:");
		Double noteForTheFirstTest = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		System.out.println("Informe a nota da segunda prova:");
		Double noteForTheSecundTest = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		System.out.println("Informe a nota de trabalho:");
		Double workNote = Double.parseDouble(scanner.next().replaceAll(",", "."));
		
		student.setEnrolment(enrolment);
		student.setName(name);
		student.setNoteForTheFirstTest(noteForTheFirstTest);
		student.setNoteForTheSecundTest(noteForTheSecundTest);
		student.setWorkNote(workNote);		
	}

}
