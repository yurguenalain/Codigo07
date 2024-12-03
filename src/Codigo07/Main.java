package Codigo07;

import java.util.HashMap;
import java.util.Scanner;

public class Main {   // Se decide llamar Main en vez de Codigo07
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Se le agrega System.in para leer la entrada del usuario

        // Se crea el HashMap donde las claves son los nombres de los países y los valores son las capitales
        HashMap<String, String> capitales = new HashMap<String, String>(); // Se cambia 'ca' a 'capitales'
        
        // Se agrega cada país y su respectiva capital
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "México DF");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador"); // Se agrega la capital correcta de El Salvador
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        String c = "";

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital (escribe 'salir' para terminar): ");
            c = s.nextLine(); // Cambiado a nextLine para leer correctamente el nombre del país
            
            if (!c.equals("salir")) { // Se corrigió la comparación para verificar "salir"
                if (capitales.containsKey(c)) { // Se cambia value por key
                    System.out.println("La capital de " + c + " es " + capitales.get(c));  // Se arregla el método println
                } else {
                    System.out.print("No conozco la respuesta. ");
                    System.out.print("¿Cuál es la capital de " + c + "?: ");
                    String ca = s.nextLine();
                    capitales.put(c, ca);  // Se agrega el país y su capital al HashMap
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!c.equals("salir"));  // Se arregló el paréntesis que faltaba

        s.close();  // Se cierra el Scanner al final
    }
}
