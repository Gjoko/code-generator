package main.java.codegenerator;

import main.java.codegenerator.base.DesignPatternAbstractFactory;
import main.java.codegenerator.factories.BehavioralDesignPatternFactory;
import main.java.codegenerator.factories.CreationalDesignPatternFactory;
import main.java.codegenerator.factories.StructuralDesignPatternFactory;

public class DesignPatternGenerator {
    public void generateDesignPattern(DesignPatternFactoryType category) {
        DesignPatternAbstractFactory factory = null;
        switch (category) {
            case CREATIONAL:
                factory = new CreationalDesignPatternFactory();
                break;
            case STRUCTURAL:
                factory = new StructuralDesignPatternFactory();
                break;
            case BEHAVIORAL:
                factory = new BehavioralDesignPatternFactory();
                break;
        }
        factory.generateDesignPattern();
    }

}
