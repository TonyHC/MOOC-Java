
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SaveableDictionary {
    /*
    private List<String> finnishWords;
    private List<String> anotherLanguageWords;
    */
    
    private Map<String, String> translations;
    private String file;
    
    public SaveableDictionary() {
        /*
        this.finnishWords = new ArrayList<>();
        this.anotherLanguageWords = new ArrayList<>();
        */
     
        this.translations = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    
    public void add(String word, String translation) {
        /*
        if(!this.finnishWords.contains(translations)) {
            this.finnishWords.add(translations);
            this.anotherLanguageWords.add(translation);
        }
        */
        
        if(this.translations.containsKey(word)) {
            return;
        }
        
        this.translations.put(word, translation);
        this.translations.put(translation, word);
    }
    
    public String translate(String word) {
        /*
        int index = 0;
        
        if(this.finnishWords.contains(word)) {
            index = this.finnishWords.indexOf(word);
            return this.anotherLanguageWords.get(index);
        }
        
        if(this.anotherLanguageWords.contains(word)) {
            index = this.anotherLanguageWords.indexOf(word);
            return this.finnishWords.get(index);
        }
        
        return null;
        */
        
       return this.translations.get(word);
    }
    
    public void delete(String word) {
        /*
        int index = 0;
        
        if(this.finnishWords.contains(word)) {
            index = this.finnishWords.indexOf(word);
            this.finnishWords.remove(index);
            this.anotherLanguageWords.remove(index);
        }
        
        if(this.anotherLanguageWords.contains(word)) {
            index = this.anotherLanguageWords.indexOf(word);
            this.anotherLanguageWords.remove(index);
            this.finnishWords.remove(index);
        }
        */
        String translate = translate(word);
        
        this.translations.remove(word);
        this.translations.remove(translate);
    }
    
    public boolean load() {
        /*
        try(Scanner scanner = new Scanner(Paths.get(file))) {
            while(scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(":");
                String finnishWord = parts[0];
                String anotherLanguageWord = parts[1];
                add(finnishWord, anotherLanguageWord);
            }
        } catch(Exception e) {
            return false;
        }
        
        return true;
        */
        
        try {
            Files.lines(Paths.get(this.file))
                    .map(parts -> parts.split(":"))
                    .forEach(parts -> {
                        add(parts[0], parts[1]);
                        add(parts[1], parts[0]);
                    });
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }
    
    public boolean save() {
        /*
        try(PrintWriter writer = new PrintWriter(file);) {
            for(int i = 0; i < this.finnishWords.size(); i++) {
                System.out.println(this.finnishWords.get(i));
                writer.write(this.finnishWords.get(i) + ":" + this.anotherLanguageWords.get(i) + "\n");
            }
            writer.close();
        } catch(Exception e) {
            return false;
        }
        
        return true;
        */
       
        try {
            PrintWriter writer = new PrintWriter(file);
            writeContentToFile(writer);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        
        return true;
    }
    
    public void writeContentToFile(PrintWriter writer) {
        List<String> allreadySaved = new ArrayList<>();
        this.translations.keySet().stream().forEach(word -> {
            if (allreadySaved.contains(word)) {
                return;
            }
 
            String translation = word + ":" + translations.get(word);
            writer.println(translation);
 
            allreadySaved.add(word);
            allreadySaved.add(translations.get(word));
        });
    }
}
