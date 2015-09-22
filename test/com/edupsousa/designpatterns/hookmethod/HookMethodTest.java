package com.edupsousa.designpatterns.hookmethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class HookMethodTest {

	@Test
	public void testarHookMethod() {
		SubClasseConcretaA objetoA = new SubClasseConcretaA();
		SubClasseConcretaB objetoB = new SubClasseConcretaB();
		
		assertEquals("Método implementado por SubClasseConcretaA", objetoA.metodoQueUsaHookMethod());
		assertEquals("Método implementado por SubClasseConcretaB", objetoB.metodoQueUsaHookMethod());
	}

}
