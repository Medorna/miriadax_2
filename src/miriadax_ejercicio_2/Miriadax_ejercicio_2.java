/* pedir por teclado un número válido de DNI y formar una
cadena que sea el NIF equivalente al DNI; es decir el número del DNI
más la letra correspondiente.
La letra del NIF es la que esta almacenada en el índice de un array
que se corresponde con el resto de dividir el DNI por 23, que es el
número de letras que se utilizan para la formación del NIF.
El array de letras de NIF sería el siguiente:
char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P',
 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
Por simplicidad escribir todo el código en la función main.
*/

package miriadax_ejercicio_2;
import java.util.Scanner;

public class Miriadax_ejercicio_2 {

    public static void main(String[] args) {
        
        char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
       
        
        Scanner entrada = new Scanner(System.in);        
        System.out.println("Ingrese dni: ");
        
        int dni = entrada.nextInt();
        int nif = dni%23; 
        
        if(dni>100000000){
            
            System.out.println("DNi incorrecto, saliendo.");
        
        }
        
        else{
            
        System.out.println("El dni ingresado es: " + dni +" Su NIF correspondiente: "+letras[nif]);
        
        }
    }
    
}
