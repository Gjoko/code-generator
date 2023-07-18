package main.java.codegenerator.designpatterns.structural;

import main.java.codegenerator.base.DesignPattern;

public class Proxy extends DesignPattern {

    private String className;
    private String packageName;
    private String pattern;

    public Proxy(String className, String packageName, String pattern) {
        this.className = className;
        this.packageName = packageName;
        this.pattern = pattern;
    }

    @Override
    public String getClassName() {
        return "Proxy";
    }

    @Override
    public String getPackageName() {
        return "structural";
    }

    @Override
    public String generatePattern() {
        return "public interface Subject {\n\tvoid request();\n}\n\n" +
                "public class RealSubject implements Subject {\n" +
                "\tpublic void request() {\n\t\tSystem.out.println(\"RealSubject request.\");\n\t}\n}\n\n" +
                "public class Proxy implements Subject {\n\tprivate RealSubject realSubject;\n\n" +
                "\tpublic Proxy() {\n\t\trealSubject = new RealSubject();\n\t}\n\n" +
                "\tpublic void request() {\n\t\trealSubject.request();\n\t}\n}";
    }
}
