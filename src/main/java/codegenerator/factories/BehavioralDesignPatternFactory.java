package main.java.codegenerator.factories;

import main.java.codegenerator.base.DesignPatternAbstractFactory;
import main.java.codegenerator.DesignPatternTemplates;
import main.java.codegenerator.designpatterns.behavioral.Observer;
import main.java.codegenerator.base.DesignPattern;
import main.java.codegenerator.designpatterns.behavioral.Strategy;
import main.java.codegenerator.designpatterns.behavioral.TemplateMethod;


public class BehavioralDesignPatternFactory extends DesignPatternAbstractFactory {


    @Override
    public DesignPattern createDesignPattern(int number) {
        DesignPattern designPattern = null;
        switch (number) {
            case 1:
                designPattern = new Observer(
                        "Observer",
                        "behavioral",
                        DesignPatternTemplates.OBSERVER.getCode()
                );
                break;
            case 2:
                designPattern = new Strategy(
                        "Strategy",
                        "behavioral",
                        DesignPatternTemplates.STRATEGY.getCode());
                break;
            case 3:
                designPattern = new TemplateMethod(
                        "TemplateMethod",
                        "behavioral",
                        DesignPatternTemplates.TEMPLATE_METHOD.getCode()
                );
                break;
            default:
                System.out.println("Invalid choice. Exiting the program.");
        }

        return designPattern;
    }

    @Override
    public void showOptions() {
        System.out.println("Choose a behavioral design pattern:");
        System.out.println("1. Observer");
        System.out.println("2. Strategy");
        System.out.println("3. Template Method");
        System.out.print("Enter your choice (1-3): ");
    }
}
