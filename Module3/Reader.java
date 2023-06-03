// This is my practice class for the Name Generator App Project. To find that project, look in the file in
// Module3 called "namegenerator"

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Reader {
    public static void main(String[] args) {
        System.out.println(populate(0));
        // Parameter = 1 for male name
        // Parameter = 0 for female name
    }

    public static String populate(int BoyName) {
        String path = "Module3/name2.csv";
        String line = "";
        List<String> boyNames = new ArrayList<>();
        List<String> girlNames = new ArrayList<>();
        List<String> lastNames = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                boyNames.add(parts[0]);
                girlNames.add(parts[1]);
                lastNames.add(parts[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (BoyName == 1) {
            Random rnd1 = new Random();
            Random rnd2 = new Random();
            String fName = boyNames.get(rnd1.nextInt(1000));
            String lName = lastNames.get(rnd2.nextInt(1000));
            return String.format("%s %s", fName, lName);
        } else if (BoyName == 0) {
            Random rnd1 = new Random();
            Random rnd2 = new Random();
            String fName = girlNames.get(rnd1.nextInt(1000));
            String lName = lastNames.get(rnd2.nextInt(1000));
            return String.format("%s %s", fName, lName);
        } else {
            return "Error";
        }
    }
}
