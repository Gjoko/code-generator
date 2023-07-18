package main.java.codegenerator.base;

import java.util.Scanner;

public abstract class DesignPatternAbstractFactory {

    private final Scanner scanner;

    public DesignPatternAbstractFactory() {
        scanner = new Scanner(System.in);
    }
    public abstract DesignPattern createDesignPattern(int number);

    public abstract void showOptions();

    public final void generateDesignPattern() {
        showOptions();
        int creationalChoice = scanner.nextInt();
        createDesignPattern(creationalChoice).generate();
    }
}
