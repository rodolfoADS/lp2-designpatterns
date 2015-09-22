package com.edupsousa.designpatterns.strategy;

public class ClasseComStrategy {

	private StrategyInterface strategyUtilizada;
	
	public String usaStrategyParaFazerAlgo() {
		return "Ação realizada por " + strategyUtilizada.fazAlgumaCoisa();
	}
	
	public void defineStrategy(StrategyInterface strategy) {
		strategyUtilizada = strategy;
	}
}
