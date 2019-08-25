import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


class ListaNombres{
	private String nombreLista;
	private ArrayList<String> listaNombres;
	//^ atributos
	public ListaNombres(String nombre){
		nombreLista = nombre;
		listaNombres = new ArrayList<String>();
	}
	//^Constructor

	public void addName(String nombre){
		listaNombres.add(nombre);
	}

	public boolean delName(int index){
		if(index  >= 0 && index < listaNombres.size()){
			listaNombres.remove(index);
			return true;
		}
		else
			return false;
	}

	public int findName(String name){
		return(listaNombres.indexOf(name));
	}

	public boolean updateName(String name, String newName){
		int posicion = 0;
		posicion = listaNombres.indexOf(name);
		if(posicion == -1)
			return false;
		else{
			listaNombres.set(posicion, newName);
			return true;
		}
	}

	public int sizeName(String name){
		return(name.length());
	}
}
