package Exercicio_Futebol;

public class TimeCampBrasileiro {
	private String time;
	private String regiao;
	private String capitao;
	
	public TimeCampBrasileiro(String time, String regiao, String capitao) {
		
		this.time = time;
		this.regiao = regiao;
		this.capitao = capitao;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}



	public String getCapitao() {
		return capitao;
	}

	public void setCapitao(String capitao) {
		this.capitao = capitao;
	}
	
	public void exibirTime ()
	{
		System.out.printf("Time: %s / Região: %s / Capitão: %s \n",
				getTime(),getRegiao(), getCapitao());
	}
	
}
