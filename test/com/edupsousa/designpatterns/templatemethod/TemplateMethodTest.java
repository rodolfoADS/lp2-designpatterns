package com.edupsousa.designpatterns.templatemethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemplateMethodTest {

	@Test
	public void testarFormatoPadrao() {
		ClasseComTemplateMethod objeto = new ClasseComTemplateMethod();
		
		assertEquals("Mensagem", objeto.metodoTemplate("Mensagem"));
	}
	
	@Test
	public void testarFormatoSubclasse() {
		SubClasseQueAlteraTemplateMethod objeto = new SubClasseQueAlteraTemplateMethod();
		
		assertEquals("Cabeçalho\nMensagem\nRodapé", objeto.metodoTemplate("Mensagem"));
	}
}
