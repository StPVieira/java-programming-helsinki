
package dictionary;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file){
        this.dictionary = new HashMap<>();
        this.file = file;
    }
    
    public boolean load(){
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
        }catch(Exception e){
            System.out.println("Error reading file.");
            return false;
        }
        return true;
    }
    
    public void add(String words, String translation){
        dictionary.putIfAbsent(words, translation);
        dictionary.putIfAbsent(translation, words);
    }
    
    public String translate(String word){
        return dictionary.getOrDefault(word, null);
    }
    
    public boolean save(){
    try (FileWriter writer = new FileWriter(file)) {
        HashMap<String, String> writtenTranslations = new HashMap<>();
        
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            String word = entry.getKey();
            String translation = entry.getValue();
            
            if (!writtenTranslations.containsKey(translation)) {
                writer.write(word + ":" + translation + System.lineSeparator());
                writtenTranslations.put(word, translation);
            }
        }
        return true;
    } catch (Exception e) {
        System.out.println("Error saving file.");
        return false;
    }
    }
    
    public void delete(String word){
        dictionary.remove(word);
        Iterator<Map.Entry<String, String>> iterator = this.dictionary.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(word)) {
                iterator.remove();
            }
        }    
    }
    
}
