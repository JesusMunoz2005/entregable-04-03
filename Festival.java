package u6u7.entregable;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import u6u7.entregable.Artistas.estilo;

public class Festival{

	String nombreven;
	int codPost;
	HashMap<estilo,List<Artistas>> Arti;
	int numArti;
	
	public Festival(String nombreven, int codPost) {
		
		this.nombreven = nombreven;
		this.codPost = codPost;
	}
	
	public void inscribeArtista(estilo estilo, Artistas artista ) throws ExcepEstilo{

	if (!(estilo==estilo.INDIE || estilo==estilo.POP || estilo==estilo.ROCK )) {
		throw new ExcepEstilo("Estilo no disponible");
	}else {
		List<Artistas> artistas = null;
		artistas.add(artista);
		Arti.put(estilo, artistas);
		numArti++;
	}	
	}
	
	public void cuantosInscritos(){
		System.out.println("Hay "+numArti+" artistas inscritos");
	}
	
	/*public <T> void artistasByCache(estilo estilo) {
		ArrayList<String> byCache;
		for (Artistas artistas : (List<Artistas>) Arti) {
			Artistas string = artistas;
			if (estilo.equals(string)) {
				byCache.addAll(string);
			}
		}
		
		Collections.sort(byCache);
		System.out.println(byCache);
	
		} */
	
	public <Arti> void cargarArtistas() {
		try {
	           FileReader fileReader = new FileReader("artistas.dat");
	           BufferedReader bufferedReader = new BufferedReader(fileReader);
	           String linea;
	           while ((linea = bufferedReader.readLine()) != null) {
	               System.out.println(linea);
	           }
	           bufferedReader.close();
	       }catch (IOException e) {
	           System.out.println("No se pudo leer el archivo: " + e.getMessage());
	       }
	}
	
	public <Arti> void guardarArtistas() {
		try {
			FileInputStream entrada = new FileInputStream(Arti.toString());
			FileOutputStream guar=new FileOutputStream("artistas.dat");
			int byteLeido;
	        while ((byteLeido = entrada.read()) != -1) {
	            guar.write(byteLeido);
	        }
			
		}catch(IOException e) {
	        System.out.println("Error al duplicar el archivo: " + e.getMessage());
		}
	}
		
	}
	
