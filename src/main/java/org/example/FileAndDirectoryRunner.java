package org.example;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;

public class FileAndDirectoryRunner {

    public static void main(String[] args) throws IOException {

        Path currentDir = Paths.get(".");

        //Files.list(currentDir).forEach(System.out::println);

        Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
        Files.walk(currentDir, 2).filter(predicate).forEach(System.out::println);


        Path dir = Paths.get("./resource/data.txt");
        //System.out.println(Files.readAllLines(dir));

        Files.lines(dir).map(String::toLowerCase).filter(str -> str.contains("a")).forEach(System.out::println);

        Path dir1 = Paths.get("./resource/data1.txt");
        List<String> list = List.of("apple", "banana", "cat", "rat");

        Files.write(dir1, list);

    }
}
