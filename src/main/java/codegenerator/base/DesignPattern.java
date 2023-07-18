package main.java.codegenerator.base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public abstract class DesignPattern {

    public abstract String getClassName();

    public abstract String getPackageName();

    public abstract String generatePattern();

    public void generate() {
        String fileName = this.getClassName() + ".java";
        String directoryPath = "C:/code-generator/design-patterns/" + this.getPackageName().replace(".", "/");
        String filePath = directoryPath + "/" + fileName;

        try {
            Files.createDirectories(Path.of(directoryPath));
            Files.write(Path.of(filePath), this.generatePattern().getBytes(), StandardOpenOption.CREATE);
            System.out.println("Java class generated successfully at " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while generating the Java class.");
            e.printStackTrace();
        }
    }
}
