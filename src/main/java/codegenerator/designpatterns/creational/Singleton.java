package main.java.codegenerator.designpatterns.creational;

import main.java.codegenerator.base.DesignPattern;

public class Singleton extends DesignPattern {

    private String className;
    private String packageName;
    private String pattern;

    public Singleton(String className, String packageName, String pattern) {
        this.className = className;
        this.packageName = packageName;
        this.pattern = pattern;
    }

    @Override
    public String getClassName() {
        return "Singleton";
    }

    @Override
    public String getPackageName() {
        return "creational";
    }

    @Override
    public String generatePattern() {
        return "private static Singleton instance;\n\n" +
                "private Singleton() {\n\t// Private constructor\n}\n\n" +
                "public static Singleton getInstance() {\n" +
                "\tif (instance == null) {\n" +
                "\t\tinstance = new Singleton();\n" +
                "\t}\n" +
                "\treturn instance;\n" +
                "}";
    }
}
