package com.edupsousa.designpatterns.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrategyTest {

	@Test
	public void testarPadraoStrategy() {
		ClasseComStrategy objeto = new ClasseComStrategy();
		
		objeto.defineStrategy(new StrategyConcretaA());
		assertEquals("Ação realizada por StrategyConcretaA", objeto.usaStrategyParaFazerAlgo());
		
		objeto.defineStrategy(new StrategyConcretaB());
		assertEquals("Ação realizada por StrategyConcretaB", objeto.usaStrategyParaFazerAlgo());
	}

}
