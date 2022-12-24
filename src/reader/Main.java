package reader;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("\n<<<<<<<>>>>>>>\n Hello world! \n<<<<<<<>>>>>>>\n");

        String path = "/home/wk/IdeaProjects/Katalog_Reader_Test_1/СЕЗОННЫЙ КАТАЛОГ ПЯТЕРОЧКА | СКИДКИ В ДЕКАБРЕ |.txt";
        ReadClass.readMetod(path);
    }
}