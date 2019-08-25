import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class ListaFechasNacimiento{
	private String nombreLista;
	private ArrayList<DateFormat> listaFechas;
	//^ atributos
	public ListaFechasNacimiento(String nombre){
		nombreLista = nombre;
		listaFechas = new ArrayList<DateFormat>();
	}
	//^Constructor

	public void AddDate(DateFormat fecha){
		listaFechas.add(fecha);

	}


}