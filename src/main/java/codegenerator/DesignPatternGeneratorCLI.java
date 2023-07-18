package main.java.codegenerator;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DesignPatternGeneratorCLI {

    private static List<Integer> OPTIONS = Arrays.asList( 1, 2, 3);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int categoryChoice = chooseDesignPatternType(scanner);
        do {
            DesignPatternFactoryType category = DesignPatternFactoryType.fromInteger(categoryChoice);
            if (category != null) {
                DesignPatternGenerator generator = new DesignPatternGenerator();
                generator.generateDesignPattern(category);
            }

            categoryChoice = chooseDesignPatternType(scanner);

        } while (OPTIONS.contains(categoryChoice));

        System.out.println("Invalid choice. Exiting the program.");
    }

    private static int chooseDesignPatternType(Scanner scanner) {
        System.out.println("Choose a design pattern category:");
        System.out.println("1. Creational");
        System.out.println("2. Structural");
        System.out.println("3. Behavioral");
        System.out.print("Enter your choice (1-3): ");
        return scanner.nextInt();
    }

}
