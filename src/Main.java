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
*/
