import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Solución problema 5.
 * Para hayar el patrón de la progresión aritmética se toman los dos primeros valores del
 * arreglo, se obtiene la diferencia restando el segundo con el primero. Una vez definido
 * el patrón, se empieza a comprobar que el patrón esté en la sucesión, si no está se suma
 * el patrón al número donde no se encuentra la correcta progresión y ésta será la respuesta.
 */

/**
 * @author Alison Juliana López C.
 *
 */
public class progresionAritmetica5 {
	/**
	 * Pasa el arreglo de Strings a un arreglo de Enteros.
	 * @param datos = Arreglo de String que se recibe.
	 * @return = Retorna arreglo de enteros.
	 */
	public static int[] array (String datos [])
	{
		int [] entero = new int [datos.length]; 
		for (int i= 0; i<datos.length; i++)
			entero[i] = Integer.parseInt(datos[i]);
		return entero;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			String n = br.readLine(); //Se lee la entrada.
			String [] datos = n.split(","); //Se almacenan los datos de entrada en un arraglo de Strings.
			int [] entero = array(datos); //Se llama a la función para crear el arreglo de enteros.
			
			int resp =0;
			int patron = entero[1] - entero[0]; //Se define el patrón de la secuencia.
			for (int i = 1; i<entero.length; i++) { 
				if (entero [i]-entero[i-1] != patron) //Se busca dónde la sucesión no cumple la diferencia del patrón.
					resp = entero [i-1] + patron; //Se obtiene el número faltante.
				
			}
			bw.write("Respuesta: "+resp);
			bw.flush();
			
		}
		catch(Exception ex) {}

	}

}
