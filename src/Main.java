import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        System.out.print("Ingrese la ruta del archivo del mapa: ");
        String mapPath = Reader.ReadUtil.readString();
        Map map = getMap(mapPath);
        System.out.print(map);   }
}
