package u6u7.entregable;

import u6u7.entregable.Artistas.estilo;

public class Principal {
public static void main(String[] args) throws ExcepEstilo {
	Festival fest1=new Festival("PuroLatino", 41960);
	
	Manager man1=new Manager("Jesus Munoz", 25, 678873918);
	Manager man2=new Manager("Ignacio Sanz", 32, 657883801);

	Musicos mus1=new Musicos("Imanol", 27);
	Musicos mus2=new Musicos("Jose", 28);
	
	Artistas art1=new Artistas("Jhay Cortez", 10000000, estilo.POP, man2);
	
	Artistas art2=new Artistas("Eladio Carrion", 70000000, estilo.POP, man1);

	fest1.cuantosInscritos();
	
	// fest1.inscribeArtista(estilo.Reggueton, art1); Probar estilo no dispo
	
	// fest1.inscribeArtista(estilo.POP, art2);
	
	// fest1.cuantosInscritos();
	
	// fest1.guardarArtistas();
	
	// fest1.cargarArtistas();
	
	art1.addMusico(mus1);
	art1.addMusico(mus2);
	art1.delMusico(mus1);
	art1.imprimeMusicos();
	
}
}
