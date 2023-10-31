import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("carro", "car");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("árbol", "tree");
        diccionario.put("sol", "sun");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("libro", "book");
        diccionario.put("computador", "computer");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("amigo", "friend");
        diccionario.put("canción", "song");
        diccionario.put("ciudad", "city");
        diccionario.put("mar", "sea");
        diccionario.put("montaña", "mountain");
        diccionario.put("luz", "light");
        diccionario.put("aire", "air");
        diccionario.put("trabajo", "job");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int preguntas = 5;
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (int i = 0; i < preguntas; i++) {
            String palabraAleatoria = obtenerPalabraAleatoria(diccionario, random);
            String traduccionCorrecta = diccionario.get(palabraAleatoria);

            System.out.println("Traduce la palabra '" + palabraAleatoria + "' al inglés:");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + traduccionCorrecta);
                respuestasIncorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }

    private static String obtenerPalabraAleatoria(Map<String, String> diccionario, Random random) {
        int indiceAleatorio = random.nextInt(diccionario.size());
        int i = 0;
        for (String palabra : diccionario.keySet()) {
            if (i == indiceAleatorio) {
                return palabra;
            }
            i++;
        }
        return null;
    }
}
