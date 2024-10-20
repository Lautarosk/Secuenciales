/*import java.util.Scanner;

// Generador de horoscopo

class Secuenciales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento
        System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
         scanner.neString fecha =xtLine();

        // Dividir la fecha en día, mes y año
        String[] partes = fecha.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        // Determinar el signo del zodiaco
        String signo = obtenerSignoZodiaco(dia, mes);
        String horoscopo = obtenerHoroscopo(signo);

        // Imprimir el signo y el horóscopo
        System.out.println("Tu signo del zodiaco es: " + signo);
        System.out.println("Horóscopo: " + horoscopo);

        scanner.close();
    }

    public static String obtenerSignoZodiaco(int dia, int mes) {
        switch (mes) {
            case 1: return (dia <= 20) ? "Capricornio" : "Acuario";
            case 2: return (dia <= 18) ? "Acuario" : "Piscis";
            case 3: return (dia <= 20) ? "Piscis" : "Aries";
            case 4: return (dia <= 20) ? "Aries" : "Tauro";
            case 5: return (dia <= 21) ? "Tauro" : "Géminis";
            case 6: return (dia <= 21) ? "Géminis" : "Cáncer";
            case 7: return (dia <= 22) ? "Cáncer" : "Leo";
            case 8: return (dia <= 23) ? "Leo" : "Virgo";
            case 9: return (dia <= 23) ? "Virgo" : "Libra";
            case 10: return (dia <= 23) ? "Libra" : "Escorpio";
            case 11: return (dia <= 22) ? "Escorpio" : "Sagitario";
            case 12: return (dia <= 21) ? "Sagitario" : "Capricornio";
            default: return "Fecha inválida";
        }
    }

    public static String obtenerHoroscopo(String signo) {
        switch (signo) {
            case "Aries": return "Hoy es un buen día para tomar la iniciativa.";
            case "Tauro": return "La estabilidad financiera está a la vista.";
            case "Géminis": return "La comunicación será clave hoy.";
            case "Cáncer": return "Dedica tiempo a tu familia.";
            case "Leo": return "Brillará tu creatividad hoy.";
            case "Virgo": return "La atención al detalle te beneficiará.";
            case "Libra": return "Es un buen momento para la cooperación.";
            case "Escorpio": return "Tu intensidad será tu mejor aliada.";
            case "Sagitario": return "Aprovecha la aventura que se presenta.";
            case "Capricornio": return "La disciplina te llevará lejos.";
            case "Acuario": return "Las ideas innovadoras te distinguirán.";
            case "Piscis": return "Conéctate con tu intuición hoy.";
            default: return "No hay horóscopo disponible.";
        }
    }
}
*/

//  Calculadora de Calorías Quemadas

/*
import java.util.Scanner;

class CalculadoraCaloriasQuemadas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        String peso = scanner.nextLine();  // Cambié "calorias" a "kilogramos"

        System.out.print("Ingresa la duración del ejercicio en minutos: ");
        int ejercicioTime = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingresa si el ejercicio que hiciste fue: correr, nadar o andar en bicicleta: ");
        String ejercicioType = scanner.nextLine();

        scanner.close();

        int timeCorrer = 3 * ejercicioTime;
        int timeNadar = 5 * ejercicioTime;
        int timeBici = 4 * ejercicioTime;

        switch (ejercicioType.toLowerCase()) { // Cambié if por switch
            case "correr":
                System.out.println("Hoy quemaste: " + timeCorrer + " calorías.");
                break;
            case "nadar":
                System.out.println("Hoy quemaste: " + timeNadar + " calorías.");
                break;
            case "andar en bicicleta":
                System.out.println("Hoy quemaste: " + timeBici + " calorías.");
                break;
            default:
                System.out.println("Error: ejercicio no reconocido.");
        }
    }
}

 */

// Generador de Rutinas de Ejercicio

/*

import java.util.Scanner;

class GeneradorRutinasEjercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nivel de condición física: principiante, intermedio, avanzado ");
        String nivel = scanner.nextLine().toLowerCase();

        String rutina = "";

        switch (nivel) {
            case "principiante":
                rutina = "Lunes: 20 min caminata\n" +
                        "Martes: 15 min yoga\n" +
                        "Miércoles: Descanso\n" +
                        "Jueves: 20 min bicicleta\n" +
                        "Viernes: 15 min estiramientos\n" +
                        "Sábado: 30 min caminata\n" +
                        "Domingo: Descanso";
                break;

            case "intermedio":
                rutina = "Lunes: 30 min trote\n" +
                        "Martes: 20 min entrenamiento de fuerza\n" +
                        "Miércoles: 25 min natación\n" +
                        "Jueves: 30 min bicicleta\n" +
                        "Viernes: 20 min yoga\n" +
                        "Sábado: 40 min trote\n" +
                        "Domingo: Descanso";
                break;

            case "avanzado":
                rutina = "Lunes: 45 min carrera\n" +
                        "Martes: 30 min entrenamiento de fuerza\n" +
                        "Miércoles: 30 min natación\n" +
                        "Jueves: 45 min ciclismo\n" +
                        "Viernes: 30 min HIIT\n" +
                        "Sábado: 60 min carrera\n" +
                        "Domingo: Descanso";
                break;

            default:
                System.out.println("Nivel de condición física no reconocido.");
                return;
        }

        System.out.println("Tu rutina semanal de ejercicios es:\n" + rutina);
        scanner.close();
    }
}
*/

// Generador de Listas de Reproducción

/*

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlaylistGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuál es tu estado de ánimo (feliz, triste, enérgico, relajado)? ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        List<String> playlist = new ArrayList<>();

        switch (estadoAnimo) {
            case "feliz":
                playlist.add("Happy - Pharrell Williams");
                playlist.add("Walking on Sunshine - Katrina and the Waves");
                break;
            case "triste":
                playlist.add("Someone Like You - Adele");
                playlist.add("Fix You - Coldplay");
                break;
            case "energico":
                playlist.add("Eye of the Tiger - Survivor");
                playlist.add("Uptown Funk - Mark Ronson ft. Bruno Mars");
                break;
            case "relajado":
                playlist.add("Weightless - Marconi Union");
                playlist.add("River Flows in You - Yiruma");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido. Intenta de nuevo.");
                return;
        }

        System.out.println("Tu lista de reproducción para estado de ánimo \"" + estadoAnimo + "\":");
        for (String cancion : playlist) {
            System.out.println("- " + cancion);
        }

        scanner.close();
    }
}

 */

//  Calculadora de Costo de Viaje

/*

import java.util.Scanner;

public class CostoViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Introduce el consumo de combustible del vehículo (litros por kilómetro): ");
        double consumo = scanner.nextDouble();

        System.out.print("Introduce el precio del combustible por litro: ");
        double precioCombustible = scanner.nextDouble();

        double costoTotal = distancia * consumo * precioCombustible;

        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);

        scanner.close();
    }
}
*/

// Plan de Estudio

/*

import java.util.Scanner;

public class PlanEstudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasDiarias = scanner.nextInt();
        int horasTotales = horasDiarias * 7; // Horas totales en una semana

        String[] materias = {"Matemáticas", "Ciencias", "Historia", "Lengua", "Inglés"};
        int horasPorMateria = horasTotales / materias.length;

        System.out.println("Plan de estudio semanal:");
        for (String materia : materias) {
            System.out.println(materia + ": " + horasPorMateria + " horas");
        }

        scanner.close();
    }
}

/*
import java.util.Scanner;

public class GeneradorHoroscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu fecha de nacimiento (DD/MM/AAAA): ");
        String fecha = scanner.nextLine();
        String[] partes = fecha.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        String signo = "";
        String horoscopo = "";

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            horoscopo = "Hoy es un buen día para ser creativo.";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            horoscopo = "Conéctate con tus emociones.";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            horoscopo = "La energía positiva te rodea.";
        }
        // Agregar más signos según sea necesario

        System.out.println("Tu signo del zodiaco es: " + signo);
        System.out.println("Horóscopo: " + horoscopo);

        scanner.close();
    }
}

 */
/*
import java.util.Scanner;

public class CalculadoraCalorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa la duración del ejercicio en minutos: ");
        int minutos = scanner.nextInt();

        System.out.print("Ingresa el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        String ejercicio = scanner.next().toLowerCase();

        double caloriasPorMinuto = 0;

        switch (ejercicio) {
            case "correr":
                caloriasPorMinuto = 10; // Ejemplo: 10 calorías/minuto
                break;
            case "nadar":
                caloriasPorMinuto = 8; // Ejemplo: 8 calorías/minuto
                break;
            case "andar en bicicleta":
                caloriasPorMinuto = 6; // Ejemplo: 6 calorías/minuto
                break;
            default:
                System.out.println("Tipo de ejercicio no reconocido.");
                scanner.close();
                return;
        }

        double caloriasQuemadas = peso * caloriasPorMinuto * minutos;
        System.out.printf("Calorías quemadas: %.2f\n", caloriasQuemadas);

        scanner.close();
    }
}

import java.util.Scanner;

public class RutinaEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nivel de condición física (principiante, intermedio, avanzado):");
        String nivel = scanner.nextLine().toLowerCase();

        switch (nivel) {
            case "principiante":
                System.out.println("Rutina de Ejercicio Semanal:");
                System.out.println("Lunes: Caminata 30 min");
                System.out.println("Martes: Yoga 30 min");
                System.out.println("Miércoles: Descanso");
                System.out.println("Jueves: Bicicleta 30 min");
                System.out.println("Viernes: Fuerza (cuerpos 15 min)");
                System.out.println("Sábado: Natación 30 min");
                System.out.println("Domingo: Descanso");
                break;
            case "intermedio":
                System.out.println("Rutina de Ejercicio Semanal:");
                System.out.println("Lunes: Correr 40 min");
                System.out.println("Martes: HIIT 30 min");
                System.out.println("Miércoles: Descanso");
                System.out.println("Jueves: Fuerza (cuerpos 30 min)");
                System.out.println("Viernes: Bicicleta 40 min");
                System.out.println("Sábado: Yoga 30 min");
                System.out.println("Domingo: Descanso");
                break;
            case "avanzado":
                System.out.println("Rutina de Ejercicio Semanal:");
                System.out.println("Lunes: Correr 60 min");
                System.out.println("Martes: HIIT 45 min");
                System.out.println("Miércoles: Fuerza (cuerpos 45 min)");
                System.out.println("Jueves: Natación 60 min");
                System.out.println("Viernes: Ciclismo 60 min");
                System.out.println("Sábado: Yoga 45 min");
                System.out.println("Domingo: Descanso");
                break;
            default:
                System.out.println("Nivel no reconocido. Por favor, elige entre principiante, intermedio o avanzado.");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class ListaReproduccion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu estado de ánimo (feliz, triste, enérgico, relajado):");
        String estado = scanner.nextLine().toLowerCase();

        switch (estado) {
            case "feliz":
                System.out.println("Lista de reproducción: Canciones para sentirse feliz:");
                System.out.println("- 'Happy' - Pharrell Williams");
                System.out.println("- 'Uptown Funk' - Mark Ronson");
                break;
            case "triste":
                System.out.println("Lista de reproducción: Canciones para sentirse triste:");
                System.out.println("- 'Someone Like You' - Adele");
                System.out.println("- 'Fix You' - Coldplay");
                break;
            case "enérgico":
                System.out.println("Lista de reproducción: Canciones para sentirse enérgico:");
                System.out.println("- 'Eye of the Tiger' - Survivor");
                System.out.println("- 'Lose Yourself' - Eminem");
                break;
            case "relajado":
                System.out.println("Lista de reproducción: Canciones para sentirse relajado:");
                System.out.println("- 'Weightless' - Marconi Union");
                System.out.println("- 'River Flows in You' - Yiruma");
                break;
            default:
                System.out.println("Estado no reconocido.");
        }
        scanner.close();
    }
}

import java.util.Scanner;

public class CostoViaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la distancia del viaje en kilómetros:");
        double distancia = scanner.nextDouble();
        System.out.println("Ingresa el consumo de combustible del vehículo en litros por kilómetro:");
        double consumo = scanner.nextDouble();
        System.out.println("Ingresa el precio del combustible por litro:");
        double precio = scanner.nextDouble();

        double costoTotal = distancia * consumo * precio;
        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);
        scanner.close();
    }
}



import java.util.Scanner;

public class SistemaRecomendacionPeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu género de películas favorito (acción, comedia, drama, ciencia ficción): ");
        String favorito = scanner.nextLine();

        if (favorito.equalsIgnoreCase("acción")) {
            System.out.println("Te recomiendo que veas: Misión Imposible, John Wick");
        } else if (favorito.equalsIgnoreCase("drama")) {
            System.out.println("Te recomiendo que veas: El niño con el pijama de rayas, Marley y yo");
        } else if (favorito.equalsIgnoreCase("comedia")) {
            System.out.println("Te recomiendo que veas: ¿Qué pasó ayer?, Supercool");
        } else if (favorito.equalsIgnoreCase("ciencia ficción")) {
            System.out.println("Te recomiendo que veas: Inception, Blade Runner");
        } else {
            System.out.println("Género no reconocido. Por favor, elige acción, comedia, drama o ciencia ficción.");
        }

        scanner.close();
    }
}
*/
/*
import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita el precio del producto
        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();


        System.out.print("Ingresa la categoría del cliente (estudiante, adulto, jubilado): ");
        String categoria = scanner.next();

        double descuento = 0;

        // Determina el porcentaje de descuento basado en la categoría
        switch (categoria.toLowerCase()) {
            case "estudiante":
                descuento = 0.10; // 10% para estudiantes
                break;
            case "adulto":
                descuento = 0.05; // 5% para adultos
                break;
            case "jubilado":
                descuento = 0.15; // 15% para jubilados
                break;
            default:
                System.out.println("Categoría no reconocida
*/
/*
import java.util.Scanner;

public class SistemaRecomendacionLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita el género de libro favorito
        System.out.print("Ingresa tu género de libro favorito (fantasía, misterio, romance, ciencia ficción): ");
        String generoFavorito = scanner.nextLine();

        // Recomendaciones basadas en el género
        switch (generoFavorito.toLowerCase()) {
            case "fantasía":
                System.out.println("Te recomiendo que leas: 'El nombre del viento' de Patrick Rothfuss.");
                break;
            case "misterio":
                System.out.println("Te recomiendo que leas: 'La chica del tren' de Paula Hawkins.");
                break;
            case "romance":
                System.out.println("Te recomiendo que leas: 'Orgullo y prejuicio' de Jane Austen.");
                break;
            case "ciencia ficción":
                System.out.println("Te recomiendo que leas: 'Dune' de Frank Herbert.");
                break;
            default:
                System.out.println("Género no reconocido. Por favor, elige fantasía, misterio, romance o ciencia ficción.");
                break;
        }

        scanner.close(); // Cierra el Scanner
    }
}

 */
/*
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita el peso y la altura del usuario
        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcula el IMC
        double imc = peso / (altura * altura);

        // Imprime el resultado del IMC
        System.out.printf("Tu Índice de Masa Corporal (IMC) es: %.2f\n", imc);

        // Recomendaciones basadas en el IMC
        if (imc < 18.5) {
            System.out.println("Recomendación: Bajo peso. Considera consultar a un nutricionista.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Recomendación: Peso normal. ¡Sigue así!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Recomendación: Sobrepeso. Podrías considerar un plan de alimentación saludable.");
        } else {
            System.out.println("Recomendación: Obesidad. Es recomendable consultar a un médico o nutricionista.");
        }

        scanner.close(); // Cierra el Scanner
    }
}


 */
/*
import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String[] opciones = {"piedra", "papel", "tijera"};

        // Solicita la elección del usuario
        System.out.print("Elige entre piedra, papel o tijera: ");
        String eleccionUsuario = scanner.nextLine().toLowerCase();

        // Genera una elección aleatoria para la computadora
        int indiceComputadora = random.nextInt(opciones.length);
        String eleccionComputadora = opciones[indiceComputadora];

        // Imprime las elecciones
        System.out.println("Tu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);

        // Determina el ganador
        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste! La computadora ganó.");
        }

        scanner.close();
    }
}


 */
/*

import java.util.Scanner;

public class EvaluadorHabitosSaludables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita la cantidad de horas de sueño
        System.out.print("¿Cuántas horas al día duermes? ");
        int horasSueño = scanner.nextInt();

        // Solicita la cantidad de horas de ejercicio
        System.out.print("¿Cuántas horas al día haces ejercicio? ");
        int horasEjercicio = scanner.nextInt();

        // Solicita la cantidad de comidas saludables
        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();

        // Evaluación de hábitos
        System.out.println("\nEvaluación de tus hábitos saludables:");

        // Evaluación del sueño
        if (horasSueño < 7) {
            System.out.println("- Deberías dormir más. Se recomienda entre 7 y 9 horas de sueño.");
        } else {
            System.out.println("- ¡Buen trabajo! Estás durmiendo lo suficiente.");
        }

        // Evaluación del ejercicio
        if (horasEjercicio < 1) {
            System.out.println("- Intenta hacer al menos 1 hora de ejercicio al día.");
        } else {
            System.out.println("- ¡Excelente! Mantenerse activo es muy importante.");
        }

        // Evaluación de comidas saludables
        if (comidasSaludables < 3) {
            System.out.println("- Trata de consumir al menos 3 comidas saludables al día.");
        } else {
            System.out.println("- ¡Muy bien! Estás haciendo un buen esfuerzo en tu alimentación.");
        }

        scanner.close();
    }
}

 */
/*
import java.util.Scanner;

public class SistemaRecomendacionActividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita el estado de ánimo del usuario
        System.out.print("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        // Recomendaciones basadas en el estado de ánimo
        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Te recomiendo que salgas a disfrutar de un día con amigos o hagas una actividad al aire libre.");
                break;
            case "triste":
                System.out.println("Te recomiendo que veas una película que te haga reír o que hables con un amigo cercano.");
                break;
            case "enérgico":
                System.out.println("Te recomiendo que hagas ejercicio, como correr o practicar un deporte.");
                break;
            case "relajado":
                System.out.println("Te recomiendo que medites, leas un libro o disfrutes de un baño relajante.");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido. Por favor, elige feliz, triste, enérgico o relajado.");
                break;
        }

        scanner.close();
    }
}
*/
 */