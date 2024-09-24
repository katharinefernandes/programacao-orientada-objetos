package br.com.fiap.hospital;

public class Teste {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		IAtendimento emergencia = new AtendimentoEmergencia();
		IAtendimento consulta = new AtendimentoLaboratorial();
		IAtendimento cirurgia = new Cirurgia();

		hospital.realizarAtendimento(emergencia, "Caio");
		hospital.realizarAtendimento(consulta, "Giovanna");
		hospital.realizarAtendimento(cirurgia, "Luisa");
	}

}
