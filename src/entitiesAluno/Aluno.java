package entitiesAluno;

public class Aluno {
	
	public String nome;
	
	public Double nota1;
	public Double nota2;
	public Double nota3;
	
	public Double somaNota() {
		return nota1 + nota2 + nota3;
	}
	
	
}
