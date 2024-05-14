import org.apache.commons.csv.*;
import com.google.gson.Gson;
import java.io.*;
import java.util.*;

class StarWarsCharacter {
    static List<StarWarsCharacter> charactersList = new ArrayList<StarWarsCharacter>();
    String name = "";
    String height = "";
    String mass = "";
    String hairColor = "";
    String skinColor = "";
    String eyeColor = "";
    String birthYear = "";
    String gender = "";
    String homeworld = "";
    String species = "";

    public StarWarsCharacter() {}
    public static void CSVReader(String filename) {

        try {
            Reader in = new FileReader(filename);
            CSVFormat CSVparser = CSVFormat.Builder.create().setHeader().build();

            Iterable<CSVRecord> records = CSVparser.parse(in);
            for (CSVRecord record : records) {
                StarWarsCharacter character = new StarWarsCharacter();


                System.out.println(((record.get("name")) == null) ? "N/A" : record.get("name"));

                character.name = ((record.get("name")) == null) ? "N/A" : record.get("name");
                character.height = (record.get("height") == null) ? "N/A" : record.get("height");
                character.mass = (record.get("mass") == null) ? "N/A" : record.get("mass");
                character.hairColor = (record.get("hair_color") == null) ? "N/A" : record.get("hair_color");
                character.eyeColor = (record.get("eye_color") == null) ? "N/A" : record.get("eye_color");
                character.skinColor = (record.get("skin_color") == null) ? "N/A" : record.get("skin_color");
                character.birthYear = (record.get("birth_year") == null) ? "N/A" : record.get("birth_year");
                character.gender = (record.get("gender") == null) ? "N/A" : record.get("gender");
                character.homeworld = (record.get("homeworld") == null) ? "N/A" : record.get("homeworld");
                character.species = (record.get("species") == null) ? "N/A" : record.get("species");

                charactersList.add(character);

            }

        } catch (FileNotFoundException ex) {
            System.out.println("No such file!");
        } catch (IOException ex) {
            System.out.println("IO Exception!");
        }

    }

    public static void toJSON() {
        try {
            Writer out = new FileWriter("characters.json");
            Gson gson = new Gson();
            gson.toJson(charactersList, out);
            out.close();
        } catch (IOException ex) {
            System.out.println("IO Exception!");
        } 

    }

    public String toString() {
        String output  = "";

        return output;
    }
}

class JarJarBinks {

    public static void main(String[] args) {
           StarWarsCharacter.CSVReader("characters.csv");
           StarWarsCharacter.toJSON();
       }
   
   }
