package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLazy;
import one.digitalinovation.gof.singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.Comportamento;
import one.digitalinovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinovation.gof.strategy.ComportamentoNormal;
import one.digitalinovation.gof.strategy.Robo;

public class Test {
    
	//Singleton
	
	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		System.out.println("---------------------------------------------");
		
		
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		System.out.println("---------------------------------------------");
		
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		//Strategy
		System.out.println("---------------------------------------------");
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		Comportamento normal = new ComportamentoNormal();
		
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		//Facade
		
		
		Facade facade = new Facade();
		facade.migrarCliente("Henrique", "72862204");
		
	}

}
