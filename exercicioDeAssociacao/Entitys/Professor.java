package exercicioDeAssociacao.Entitys;

public class Professor {
	private String name;
	private String spacialyting;
	private Seminario[] seminarys;
	private Seminario seminary;
	
	public Professor(String name, String spacialyting, Seminario[] seminarys) {
		this.name = name;
		this.spacialyting = spacialyting;
		this.seminarys = seminarys;
	}
	
	

	public Professor(String name, String spacialyting, Seminario seminary) {
		this.name = name;
		this.spacialyting = spacialyting;
		this.seminary = seminary;
	}

	public void imprimir() {
		System.out.println("Name: "+this.name);
		System.out.println("Spaciealyting: "+ this.spacialyting);
		if(seminary != null) {
			System.out.println("Seminary: "+seminary.getTetle());
		}else if(seminarys != null) {
			System.out.println("Seminarys: ");
			for(Seminario seminarys: seminarys) {
				System.out.println(seminarys.getTetle());
			}
		}
		System.out.println("----------------------");
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpacialyting() {
		return spacialyting;
	}

	public void setSpacialyting(String spacialyting) {
		this.spacialyting = spacialyting;
	}

	public Seminario getSeminary() {
		return seminary;
	}

	public void setSeminary(Seminario seminary) {
		this.seminary = seminary;
	}

	public Seminario[] getSeminarys() {
		return seminarys;
	}

	public void setSeminarys(Seminario[] seminarys) {
		this.seminarys = seminarys;
	}
	
	
}
