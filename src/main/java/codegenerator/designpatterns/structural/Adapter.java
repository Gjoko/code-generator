package main.java.codegenerator.designpatterns.structural;

import main.java.codegenerator.base.DesignPattern;

public class Adapter extends DesignPattern {

    private String className;
    private String packageName;
    private String pattern;

    public Adapter(String className, String packageName, String pattern) {
        this.className = className;
        this.packageName = packageName;
        this.pattern = pattern;
    }

    @Override
    public String getClassName() {
        return "Adapter";
    }

    @Override
    public String getPackageName() {
        return "structural";
    }

    @Override
    public String generatePattern() {
        return "public interface Target {\n\tvoid request();\n}\n\n" +
                "public class Adaptee {\n\tpublic void specificRequest() {\n\t\tSystem.out.println(\"Adaptee's specific request.\");\n\t}\n}\n\n" +
                "public class Adapter implements Target {\n\tprivate Adaptee adaptee;\n\n" +
                "\tpublic Adapter(Adaptee adaptee) {\n\t\tthis.adaptee = adaptee;\n\t}\n\n" +
                "\tpublic void request() {\n\t\tadaptee.specificRequest();\n\t}\n}";
    }
}
