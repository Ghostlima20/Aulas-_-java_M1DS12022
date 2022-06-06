
public class Data {
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;

	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1;
	
	// Construtor dia mes e ano
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// Construtor completo data e horario
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		// Ira chamar  outro construtor da classe
		this (dia, mes, ano);
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	// mostar data e hora ao usuario.
	public void imprimir(int formato) {
		// Monta a string de impressão de data
		String data = dia + "/" + mes + "/" + ano;
		
		if (hora == -1) {
		
			// Então exibe só a data
			System.out.println(data);
		} else {
			
			String horario = ":" + minuto + ":" + segundo;
			
			if (formato == FORMATO_24H) {
				
				horario = hora + horario;
			} else {
				// Se o formato for 12h
				if (hora == 0) {
					horario = 12 + horario;
					horario += " AM";
				
				} else if (hora >= 12) {
					
					horario = (hora - 12) + horario;
					horario += " PM";
				
				} else {
				
					horario = hora + horario;
					horario += " AM";
				}
			}

			// mostra a data/hora formatada
			System.out.println(data + " " + horario);
		}
	}

	// Métodos getters
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
}
