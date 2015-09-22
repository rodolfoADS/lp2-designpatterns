package com.edupsousa.designpatterns.templatemethod;

public class SubClasseQueAlteraTemplateMethod extends ClasseComTemplateMethod {

	protected String cabecalho() {
		return "Cabeçalho\n";
	}
	
	protected String rodape() {
		return "\nRodapé";
	}
	
}
