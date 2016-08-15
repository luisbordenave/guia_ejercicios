package ejercicios.demo;

public class Demo2
{
	/**
	 * Devuelve verdadero si todos los elementos están en el conjunto.
	 */
	public static boolean estaEn(int elem , int[] conjunto){
		boolean estaEn= false;
		if(conjunto.length>0){
				for(int j=0; j < conjunto.length; j++){
				estaEn= estaEn || (elem == conjunto[j])
			}
		}
		return estaEn;
	}
	public static boolean pertenecenTodos(int[] elems, int[] conjunto) {
		boolean pertenecenConjunto= true;
		if(elems.length>conjunto.length || elems.length = 0){
			return false;
		}
		for(int k=0; k < elems.length; k++){
				pertenecenConjunto = pertenecenConjunto && estaEn( elems[k], conjunto[]);
			}
		return perteneceConjunto;
		}


	/**
	 * Devuelve el índice del pico en un arreglo unimodal.
	 *
	 * Nomenclatura: un arreglo unimodal de N elementos es estrictamente
	 * creciente hasta una determinada posición P, y estrictamente
	 * decreciente a partir de ella. Se cumple que 0 < P < N-1.
	 *
	 * Se garantiza que el arreglo pasado como parámetro tiene forma de
	 * pico y, por tanto, al menos 3 elementos.
	 */
	public static int indicePico(int[] arreglo) {
		// Ejemplos:
		//     [2, 4, 6, 19, 15, 8, -2] → se devuelve 3
		//     [10, 20, 30, 40, 50, 15] → se devuelve 4
		//     [50, 100, 75]            → se devuelve 1
		boolean esMayor= false;
		int m = 1;
	while( m < arreglo.length){
		if(esMayor = esMayor || (arrelgo[m] < arreglo [m-1])){
			return m-1;
		}
	}
		
	
		return -1;
	}
}
