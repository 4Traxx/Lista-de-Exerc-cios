package Exercicio_Futebol;

public class PartidaFutebol {
	
	private String estadio;
	private String divisao;
	private String horario;
	private String arbitro;
	
	public PartidaFutebol(String estadio, String divisao, String horario, String arbitro) 
	{
		this.estadio = estadio;
		this.divisao = divisao;
		this.horario = horario;
		this.arbitro = arbitro;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitros(String arbitro) {
		this.arbitro = arbitro;
	}
	
	
	
	public void exibirPartida ()
	{
		System.out.printf("Estádio: %s / Divisão: %s / Horário %s / Árbitro: %s \n ",
				getEstadio(), getDivisao(), getHorario(), getArbitro());
	}
	
	
	
}
