package main.java.codegenerator.factories;

import main.java.codegenerator.DesignPatternTemplates;
import main.java.codegenerator.base.DesignPattern;
import main.java.codegenerator.base.DesignPatternAbstractFactory;
import main.java.codegenerator.designpatterns.structural.Adapter;
import main.java.codegenerator.designpatterns.structural.Decorator;
import main.java.codegenerator.designpatterns.structural.Proxy;

public class StructuralDesignPatternFactory extends DesignPatternAbstractFactory {
    @Override
    public DesignPattern createDesignPattern(int number) {
        DesignPattern designPattern = null;

        switch (number) {
            case 1:
                designPattern = new Adapter(
                        "adapter",
                        "structural",
                        DesignPatternTemplates.ADAPTER.getCode()
                );
                break;
            case 2:
                designPattern = new Decorator(
                        "decorator",
                        "structural",
                        DesignPatternTemplates.DECORATOR.getCode()
                );
                break;
            case 3:
                designPattern = new Proxy(
                        "proxy",
                        "structural",
                        DesignPatternTemplates.PROXY.getCode()
                );
                break;
            default:
                System.out.println("Invalid choice. Exiting the program.");
        }
        return designPattern;
    }

    @Override
    public void showOptions() {
        System.out.println("Choose a structural design pattern:");
        System.out.println("1. Adapter");
        System.out.println("2. Decorator");
        System.out.println("3. Proxy");
        System.out.print("Enter your choice (1-3): ");
    }
}
