package exercicioDeAssociacao;


import exercicioDeAssociacao.Entitys.Aluno;
import exercicioDeAssociacao.Entitys.Professor;
import exercicioDeAssociacao.Entitys.Seminario;

public class Program {

	public static void main(String[] args) {
		Seminario seminary1 = new Seminario("Tecnologia Empresárial", "Centur");
		Seminario seminary2 = new Seminario("Educação Fsica", "Bem-Estar");
		Seminario seminary3 = new Seminario("Saúde Animal", "Teatro da Paz");
		
		Professor teacher1 = new Professor("Alan Carlos", "Engenharia de Software", seminary1);
		Seminario[] seminarys = {seminary2,seminary3};
		Professor teacher2 = new Professor("João Almir", "Pedagogo", seminarys);
		
		seminary1.setTeacher(teacher1);
		seminary2.setTeacher(teacher2);
		seminary3.setTeacher(teacher2);
		
		Aluno student1 = new Aluno("Marcos",23,seminary1);
		Aluno student2 = new Aluno("Heloísa",6,seminary1);
		Aluno student3 = new Aluno("João",44,seminary3);
		Aluno student4 = new Aluno("Matheus",28,seminary3);
		Aluno student5 = new Aluno("Evair",23,seminary1);
		
		Aluno[] studentsSemi1 = {student1,student2, student5};
		seminary1.setStudent(studentsSemi1);
		
		Aluno[] studentsSemi3 = {student3,student4};
		seminary3.setStudent(studentsSemi3);
		
		System.out.println("Seminarys: ");
		seminary1.imprimir();
		seminary2.imprimir();
		seminary3.imprimir();
		
		System.out.println();
		System.out.println("Teaches: ");
		teacher1.imprimir();
		teacher2.imprimir();
		
		System.out.println();
		System.out.println("Students:");
		student1.imprimir();
		student2.imprimir();
		student3.imprimir();
		student4.imprimir();
		student5.imprimir();
	}

}
