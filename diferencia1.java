import java.io.*;

/**
 * Solución al primer punto del taller.
 * 
 * Se deben dividir los datos ingresados por consola, que estáran separados por comas. Estos datos
 * se almacenarán en un vector de enteros para poder operarlos y poder obtener una salida.
 */

/**
 * @author Alison Juliana Lòpez C.
 *
 */
public class diferencia1 {
	/**
	 * 
	 * @param arreglo = Arreglo que contiene la serie de números que se ingresarán por consola.
	 * @param k = Resultado que se debe obtener para que sume el acumulador.
	 * @return acumu = Se sumará uno cada vez que se cumpla la condición.
	 */
	public static int salida(int [] array, int k) 
	{
		int acumulador=0;
		for (int i= 0; i<array.length; i++) {
			for(int j = 0; j<array.length; j++) {
				if (array[i] - array[j] == k)
					acumulador ++;
			}
		}
		return acumulador;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); //Buffer para leer entradas.
			BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out)); //Buffer para imprimir.
			String serie; //Se leerá la línea de números ingresados.
			
			bw.write("Ingrese los números separados por comas: ");
			bw.flush();	
			serie = br.readLine(); //Se ingresa línea.
			bw.write("Ingrese 'k': ");
			bw.flush();
			int k = Integer.parseInt(br.readLine()); //Se ingresa K.
			
			String [] datos = serie.split(",");
			int [] array = new int [datos.length]; //Se almacenarán los datos.
			for (int i= 0; i<datos.length ; i++) //Se almacenan los datos del vector de strings, en uno de enteros.
				array [i] = Integer.parseInt(datos[i]);
			
			bw.write(""+salida(array, k)); //Se imprime llamando a la función.
			bw.flush();
			
		}
		catch (Exception ex) {}

	}

}
