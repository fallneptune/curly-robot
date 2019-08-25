/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesyObjetos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author mbp
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
	
    
}
