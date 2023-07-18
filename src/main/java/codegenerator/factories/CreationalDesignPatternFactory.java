package main.java.codegenerator.factories;

import main.java.codegenerator.base.DesignPatternAbstractFactory;
import main.java.codegenerator.DesignPatternTemplates;
import main.java.codegenerator.designpatterns.creational.Builder;
import main.java.codegenerator.base.DesignPattern;
import main.java.codegenerator.designpatterns.creational.Factory;
import main.java.codegenerator.designpatterns.creational.Singleton;

public class CreationalDesignPatternFactory extends DesignPatternAbstractFactory {
    @Override
    public DesignPattern createDesignPattern(int number) {
        DesignPattern designPattern = null;

        switch (number) {
            case 1:
                designPattern = new Singleton(
                        "singleton",
                        "creational",
                        DesignPatternTemplates.SINGLETON.getCode()
                );
                break;
            case 2:
                designPattern = new Factory(
                        "factory",
                        "creational",
                        DesignPatternTemplates.FACTORY.getCode()
                );
                break;
            case 3:
                designPattern = new Builder(
                        "builder",
                        "creational",
                        DesignPatternTemplates.BUILDER.getCode()
                );
                break;
            default:
                System.out.println("Invalid choice. Exiting the program.");
        }
        return designPattern;
    }

    @Override
    public void showOptions() {
        System.out.println("Choose a creational design pattern:");
        System.out.println("1. Singleton");
        System.out.println("2. Factory Method");
        System.out.println("3. Builder");
        System.out.print("Enter your choice (1-3): ");
    }
}
