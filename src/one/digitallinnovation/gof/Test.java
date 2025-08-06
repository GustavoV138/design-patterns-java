package one.digitallinnovation.gof;

import one.digitallinnovation.gof.facade.Facade;
import one.digitallinnovation.gof.singleton.SingletonEager;
import one.digitallinnovation.gof.singleton.SingletonLazy;
import one.digitallinnovation.gof.singleton.SingletonLazyHolder;
import one.digitallinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args){

        //SINGLETON:

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //STRATEGY:

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        System.out.println();
        robo.mover();
        robo.setComportamento(defensivo);
        System.out.println();
        robo.mover();
        robo.setComportamento(agressivo);
        System.out.println();
        robo.mover();

        //FACADE

        Facade facade = new Facade();
        facade.migrarCliente("Zé da Manga", "12345688");

    }
}
