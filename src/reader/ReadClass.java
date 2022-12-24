package reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadClass {
    public ReadClass() {
    }

    static String path = "/home/wk/IdeaProjects/Katalog_Reader_Test_1/СЕЗОННЫЙ КАТАЛОГ ПЯТЕРОЧКА | СКИДКИ В ДЕКАБРЕ |.txt";
    static StringBuilder sb = new StringBuilder();
    static ArrayList<String> list = new ArrayList<>();
    static String str;
    static String percent;
    static String produkt;
    static String cost;
    static List<String> allLines = new ArrayList();

    public static void readMetod(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
//            String line = reader.readLine();
            while (reader.readLine() != null) {
                percent = reader.readLine() ;
                System.out.println("percent " + percent);
                produkt = reader.readLine();
                System.out.println("produkt: " + produkt);
                cost = reader.readLine();
                System.out.println("Cost: " + cost + "\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}