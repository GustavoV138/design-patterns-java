package one.digitallinnovation.gof;

//Singleton "Apressado"
public class SingletonEager {

    public static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
