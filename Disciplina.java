package faeterj;

public class Disciplina {
	String Nome, Sigla, Turma, Professor;
	int Carga_Horaria;
	
	public Disciplina(String nome, String sigla, String turma, String professor, int carga_Horaria) {
		super();
		this.Nome = nome;
		Sigla = sigla;
		Turma = turma;
		Professor = professor;
		Carga_Horaria = carga_Horaria;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getSigla() {
		return Sigla;
	}
	public void setSigla(String sigla) {
		Sigla = sigla;
	}
	public String getTurma() {
		return Turma;
	}
	public void setTurma(String turma) {
		Turma = turma;
	}
	public String getProfessor() {
		return Professor;
	}
	public void setProfessor(String professor) {
		Professor = professor;
	}
	public int getCarga_Horaria() {
		return Carga_Horaria;
	}
	public void setCarga_Horaria(int carga_Horaria) {
		Carga_Horaria = carga_Horaria;
	}
}
