package com.edupsousa.designpatterns.hookmethod;

public abstract class ClasseAbstrataComHookMethod {
	
	protected abstract String hookMethod();
	
	public String metodoQueUsaHookMethod() {
		return "Método implementado por " + hookMethod();
	}
	
}
