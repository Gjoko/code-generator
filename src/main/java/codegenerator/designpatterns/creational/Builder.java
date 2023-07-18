package main.java.codegenerator.designpatterns.creational;

import main.java.codegenerator.base.DesignPattern;

public class Builder extends DesignPattern {

    private String className;
    private String packageName;
    private String pattern;

    public Builder(String className, String packageName, String pattern) {
        this.className = className;
        this.packageName = packageName;
        this.pattern = pattern;
    }

    @Override
    public String getClassName() {
        return "Builder";
    }

    @Override
    public String getPackageName() {
        return "creational";
    }

    @Override
    public String generatePattern() {
        return "public class Product {\n\tprivate String attribute1;\n\tprivate int attribute2;\n\n" +
                "\tpublic String getAttribute1() {\n\t\treturn attribute1;\n\t}\n\n" +
                "\tpublic void setAttribute1(String attribute1) {\n\t\tthis.attribute1 = attribute1;\n\t}\n\n" +
                "\tpublic int getAttribute2() {\n\t\treturn attribute2;\n\t}\n\n" +
                "\tpublic void setAttribute2(int attribute2) {\n\t\tthis.attribute2 = attribute2;\n\t}\n" +
                "}";
    }
}
