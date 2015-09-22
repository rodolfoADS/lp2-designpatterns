package com.edupsousa.designpatterns.templatemethod;

public class ClasseComTemplateMethod {

	public String metodoTemplate(String valor) {
		String mensagem;
		mensagem = this.cabecalho();
		mensagem += valor;
		mensagem += this.rodape();
		
		return mensagem;
	}

	protected String rodape() {
		return "";
	}

	protected String cabecalho() {
		return "";
	}
	
}
