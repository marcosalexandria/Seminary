package exercicioDeAssociacao.Entitys;

public class Seminario {
	private String tetle;
	private Aluno[] student;
	private String place;
	private Professor teacher;
	
	public Seminario(String tetle, Aluno[] student, String place) {
		this.tetle = tetle;
		this.student = student;
		this.place = place;
	}
	
	public Seminario(String tetle, String place) {
		this.tetle = tetle;
		this.place = place;
	}
	
	public void imprimir() {
		System.out.println("Title: "+this.tetle);
		System.out.println("Place: "+place);
		if(teacher != null) {
			System.out.println("Teacher: "+teacher.getName());
		}
		if(student != null) {
			System.out.println("Students:");
			for(Aluno students: student) {
				System.out.println(students.getName());
			}
		}
		System.out.println("-------------");
	}

	public String getTetle() {
		return tetle;
	}

	public void setTetle(String tetle) {
		this.tetle = tetle;
	}

	public Aluno[] getStudent() {
		return student;
	}

	public void setStudent(Aluno[] student) {
		this.student = student;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Professor getTeacher() {
		return teacher;
	}

	public void setTeacher(Professor teacher) {
		this.teacher = teacher;
	}
	
	
}
