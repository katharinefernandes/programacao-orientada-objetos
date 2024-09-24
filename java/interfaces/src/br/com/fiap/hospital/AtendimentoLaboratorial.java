package br.com.fiap.hospital;

public class AtendimentoLaboratorial implements IAtendimento {

	@Override
	public void realizarAtendimento(String paciente) {
		System.out.println("Atendimento realizado no paciente " + paciente);
	}

	@Override
	public String obterTipoAtendimento() {
		return "Exame de Sangue";
	}

}
