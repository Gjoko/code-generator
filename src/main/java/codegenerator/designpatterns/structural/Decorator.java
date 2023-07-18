package main.java.codegenerator.designpatterns.structural;

import main.java.codegenerator.base.DesignPattern;

public class Decorator extends DesignPattern {

    private String className;
    private String packageName;
    private String pattern;

    public Decorator(String className, String packageName, String pattern) {
        this.className = className;
        this.packageName = packageName;
        this.pattern = pattern;
    }

    @Override
    public String getClassName() {
        return "Decorator";
    }

    @Override
    public String getPackageName() {
        return "structural";
    }

    @Override
    public String generatePattern() {
        return "public interface Component {\n\tvoid operation();\n}\n\n" +
                "public class ConcreteComponent implements Component {\n" +
                "\tpublic void operation() {\n\t\tSystem.out.println(\"ConcreteComponent operation.\");\n\t}\n}\n\n" +
                "public class Decorator implements Component {\n\tprivate Component component;\n\n" +
                "\tpublic Decorator(Component component) {\n\t\tthis.component = component;\n\t}\n\n" +
                "\tpublic void operation() {\n\t\tcomponent.operation();\n\t}\n}";
    }
}
