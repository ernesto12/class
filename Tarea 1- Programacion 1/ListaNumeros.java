import java.util.Scanner;
import java.io.*;

public class ListaNumeros {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws IOException {
		
		// TODO Auto-generated method stub
		int tama�o = 0;
		int a;
		int b; 
		int c;
		int limite[] = new int[100];
		String date[] = new String[100];
		BufferedReader n = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite la cantidad de numeros que desse: ");
		String dato = n.readLine();
		tama�o = Integer.parseInt(dato);
		
		for(a = 0; a<tama�o; a++){
		
			int x = a + 1;
			System.out.print("Ingrese el numero " + x + ": ");
			date[a] = n.readLine();
			limite[a] = Integer.parseInt(date[a]);
			
			
		}
		
		
		for(a = 0; a<tama�o; a++){
		
			for(b = a+1; b<tama�o; b++){
			
				if(limite[b] < limite[a]){
				
					c = limite[a];
					limite[a] = limite[b];
					limite[b] = c;
				}
			}
			
			
		}
		
		System.out.println();
		System.out.println("El orden de menor a mayor es: ");
		
		for(a= 0; a<tama�o; a++)
		System.out.println(limite[a]);
		
		
		
		
	    
	    
	}

}
