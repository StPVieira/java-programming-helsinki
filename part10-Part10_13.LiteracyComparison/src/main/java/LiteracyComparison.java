import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    // Método que lê e processa os dados do arquivo
    public static List<DataEntry> readData(String file) {
        List<DataEntry> entries = new ArrayList<>();
        try {
            entries = Files.lines(Paths.get(file))
                 .map(line -> line.split(","))
                 .map(parts -> {
                     // Remove '%' de parts[2]
                     String cleanedPart2 = parts[2].replace(" (%)", "");
                     // Extrai e converte o valor numérico de parts[5]
                     double value = Double.parseDouble(parts[5]);
                     // Cria uma nova entrada com a linha original e o valor numérico
                     return new DataEntry(parts[3] + " (" + parts[4] + ")," + cleanedPart2 + ", " + parts[5], value);
                 })
                 .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return entries;
    }
    public static void main(String[] args) {
        // Caminho do arquivo
        String file = "literacy.csv";

        // Lê e processa os dados
        List<DataEntry> entries = readData(file);

        // Ordena a lista usando stream e sorted
        List<String> sortedEntries = entries.stream()
                    .sorted((e1, e2) -> Double.compare(e1.value, e2.value))
                    .map(DataEntry::toString)
                    .collect(Collectors.toList());

        // Imprime as entradas ordenadas
        sortedEntries.forEach(System.out::println);
    }
}

          
