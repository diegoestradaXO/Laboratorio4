import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    private Map map;
    try {
        Stream<String> lines = Files.lines(
                Paths.get("/Users/Diego/Desktop/aquiestatutext.txt");
                StandardCharsets.UTF_8;
        );
        lines.forEach(s -> System.out.println(s));
    }catch (IOException exception) {
        System. out .println( "Error!" );
    }
}
