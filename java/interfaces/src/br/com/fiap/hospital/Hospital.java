package br.com.fiap.hospital;

public class Hospital {

	public void realizarAtendimento(IAtendimento tipoAtendimento, String paciente) {
		tipoAtendimento.realizarAtendimento(paciente);
		System.out.println("Realizando atendimento de " + tipoAtendimento.obterTipoAtendimento());
	}

}
