package main.java.codegenerator.designpatterns.creational;

import main.java.codegenerator.base.DesignPattern;

public class Factory extends DesignPattern {

    private String className;
    private String packageName;
    private String pattern;

    public Factory(String className, String packageName, String pattern) {
        this.className = className;
        this.packageName = packageName;
        this.pattern = pattern;
    }

    @Override
    public String getClassName() {
        return "Factory";
    }

    @Override
    public String getPackageName() {
        return "creational";
    }

    @Override
    public String generatePattern() {
        return "public interface Product {\n\tvoid doSomething();\n}\n\n" +
                "public class ConcreteProductA implements Product {\n" +
                "\tpublic void doSomething() {\n\t\tSystem.out.println(\"Doing something in ConcreteProductA.\");\n\t}\n" +
                "}\n\n" +
                "public class ConcreteProductB implements Product {\n" +
                "\tpublic void doSomething() {\n\t\tSystem.out.println(\"Doing something in ConcreteProductB.\");\n\t}\n" +
                "}\n\n" +
                "public class Factory {\n" +
                "\tpublic static Product createProduct(String type) {\n" +
                "\t\tswitch (type) {\n" +
                "\t\t\tcase \"A\":\n" +
                "\t\t\t\treturn new ConcreteProductA();\n" +
                "\t\t\tcase \"B\":\n" +
                "\t\t\t\treturn new ConcreteProductB();\n" +
                "\t\t\tdefault:\n" +
                "\t\t\t\tthrow new IllegalArgumentException(\"Invalid product type.\");\n" +
                "\t\t}\n" +
                "\t}\n" +
                "}";
    }
}
