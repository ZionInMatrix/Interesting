package HomeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class RemoveDuplicatesInCSVFile {
    public static void main(String[] args) {
        String CSVFile = "quotes713.csv";
        BufferedReader br = null;
        String Line = "";

        HashSet<String> AllLines = new HashSet<>();

        try {
            br = new BufferedReader(new FileReader(CSVFile));
            while ((Line = br.readLine()) != null) {
                if (AllLines.add(Line)) {
                    Log("Processed line: " + Line);
                } else if (!IsNullOrEmpty(Line)) {
                    Log("-: " + Line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static boolean IsNullOrEmpty(String String) {

        return String == null || String.trim().isEmpty();
    }

    private static void Log(String s) {

        System.out.println(s);
    }
}


