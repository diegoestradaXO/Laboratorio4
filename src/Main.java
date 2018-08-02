import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        System.out.println("Ingrese la ruta de su archivo de MAPA: ");
        Scanner file = new Scanner(System.in);
        try {
            Stream<String> lines = Files. lines (
                    Paths. get (file.nextLine()),
                    StandardCharsets. UTF_8
            );
            lines.forEach(s -> System. out .println(s));
        } catch (IOException exception) {
            System. out .println( "Error!" );
        }
        System.out.println("Mapa leído exitosamente......");
        System.out.println("Ingrese la ruta de su archivo de INSTRUCCIONES");
        try {
            Stream<String> lines = Files. lines (
                    Paths. get (file.nextLine()),
                    StandardCharsets. UTF_8
            );
            lines.forEach(s -> System. out .println(s));
        } catch (IOException exception) {
            System. out .println( "Error!" );
        }
        System.out.println("Instrucciones leídas exitosamente......");

    }
}
