package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {  // OR catch IOException instead
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String key : this.dictionary.keySet()) {
                writer.println(key + ":" + this.dictionary.get(key));
            }
            return true;
        } catch (Exception e) {  //  OR catch IOException instead
            return false;
        }
    }

    public void add(String word, String translation) {
        if (!this.dictionary.containsKey(word) && !this.dictionary.containsKey(translation)) {
            this.dictionary.put(word, translation);
            // this.dictionary.put(translation, word);
        }
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        for (String key : this.dictionary.keySet()) {
            if (this.dictionary.get(key).equals(word)) {
                return key;
            }
        }
        return null;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
            return;
        }
        for (String key : this.dictionary.keySet()) {
            if (this.dictionary.get(key).equals(word)) {
                this.dictionary.remove(key);
                return;
            }
        }
    }
}
