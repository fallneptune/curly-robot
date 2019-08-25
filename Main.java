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

public class Main{

	public static void main(String[] args){
		List<String> lines = new ArrayList<String>();
		Scanner stdin = new Scanner(System.in);
                while(stdin.hasNextLine()){
			lines.add(stdin.nextLine());
		}
		stdin.close();
		//^ Lectura de Datos de Alpha Grader.

		
                //Instancias de las Clases
        ListaNombres lista1 = new ListaNombres("Lista de Nombres:");
		ListaFechasNacimiento lista2 = new ListaFechasNacimiento("Lista de Fechas de Nacimiento:");	
                
                SimpleDateFormat fechanueva = new SimpleDateFormat(lines.get(1));
            
                lista1.addName(lines.get(0));
                lista2.AddDate(fechanueva);   
                String fullname = lines.get(0);
                String date = lines.get(1);
                
                
                // Manipulacion de los Strings para formar el RFC.
                char[]rfc = new char[10];
                String[]name = fullname.split(" ");
                int elementos = 0;
                for (int i = 0; i < name.length; i++){
                    if(name[i] != null)
                        elementos++;
                }
                
                //Manipulacion del String de Fecha
                String[] fecha = date.split("/");
                fecha[2].getChars(2, 4, rfc, 4);
                fecha[1].getChars(0,2,rfc,6);
                fecha[0].getChars(0, 2, rfc, 8);
                     
                for (int i=elementos-1; i >= 0; i-- ){
                   //Apellido Materno
                   if(i == elementos - 1){
                        name[i].getChars(0, 1, rfc , 2);
                   }
                   //Nombre
                   else if ( i == 0){
                       name[i].getChars(0,1, rfc, 3);
                   }
                   //Apellido Paterno
                   else if(i == elementos - 2 ){
                       name[i].getChars(0 ,2, rfc, 0);
                   }
              
                }
                
                if((rfc[1]=='A' || rfc[1] =='I' || rfc[1] =='U'|| rfc[1] =='E'|| rfc[1] =='O')){
                	
                }else
                	rfc[1] ='A';
                
                System.out.println(rfc);
	}
}//test
