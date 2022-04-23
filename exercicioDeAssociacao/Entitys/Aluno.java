package exercicioDeAssociacao.Entitys;

public class Aluno {
	private String name;
	private Integer age;
	private Seminario seminary;
	
	public Aluno(String name, Integer age, Seminario seminary) {
		this.name = name;
		this.age = age;
		this.seminary = seminary;
	}
	
	public void imprimir() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+ this.age);
		if(seminary != null) {
			System.out.println("Seminary: "+seminary.getTetle());
		}
		System.out.println("----------------------");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Seminario getSeminary() {
		return seminary;
	}

	public void setSeminary(Seminario seminary) {
		this.seminary = seminary;
	}
}
