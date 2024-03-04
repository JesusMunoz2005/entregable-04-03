package u6u7.entregable;

import java.util.ArrayList;
import java.util.TreeSet;

public class Artistas {

private String nombre;
public enum estilo{POP,ROCK,INDIE, Reggueton};
private estilo estilo;
private int cache;
private Manager manager;
ArrayList<Musicos> musicos=new ArrayList<>();

public Artistas(String nombre,int cache, estilo estilo, Manager manager) throws ExcepEstilo{
	this.nombre=nombre;
	this.cache=cache;
	this.estilo=estilo;
	this.manager=manager;
	
}

public void addMusico(Musicos musicoadd) {
	musicos.add(musicoadd);
}

public void delMusico(Musicos musicoele){
	musicos.remove(musicoele);
}

public void imprimeMusicos(){
	System.out.println(musicos);
}

public String getNombre() {
	return nombre;
}

public estilo getEstilo() {
	return estilo;
}

public int getCache() {
	return cache;
}

public Manager getManager() {
	return manager;
}

public ArrayList<Musicos> getMusicos() {
	return musicos;
}


}


