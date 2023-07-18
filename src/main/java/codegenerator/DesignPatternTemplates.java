package main.java.codegenerator;

public enum DesignPatternTemplates {

    OBSERVER("import java.util.ArrayList;\nimport java.util.List;\n\n" +
            "public interface Observer {\n\tvoid update();\n}\n\n" +
            "public class ConcreteObserverA implements Observer {\n" +
            "\tpublic void update() {\n\t\tSystem.out.println(\"ConcreteObserverA has been updated.\");\n\t}\n}\n\n" +
            "public class ConcreteObserverB implements Observer {\n" +
            "\tpublic void update() {\n\t\tSystem.out.println(\"ConcreteObserverB has been updated.\");\n\t}\n}\n\n" +
            "public interface Subject {\n" +
            "\tvoid attach(Observer observer);\n" +
            "\tvoid detach(Observer observer);\n" +
            "\tvoid notifyObservers();\n" +
            "}\n\n" +
            "public class ConcreteSubject implements Subject {\n" +
            "\tprivate List<Observer> observers;\n\n" +
            "\tpublic ConcreteSubject() {\n\t\tobservers = new ArrayList<>();\n\t}\n\n" +
            "\tpublic void attach(Observer observer) {\n\t\tobservers.add(observer);\n\t}\n\n" +
            "\tpublic void detach(Observer observer) {\n\t\tobservers.remove(observer);\n\t}\n\n" +
            "\tpublic void notifyObservers() {\n" +
            "\t\tfor (Observer observer : observers) {\n\t\t\tobserver.update();\n\t\t}\n\t}\n}"),
    STRATEGY("public interface Strategy {\n\tvoid execute();\n}\n\n" +
            "public class ConcreteStrategyA implements Strategy {\n" +
            "\tpublic void execute() {\n\t\tSystem.out.println(\"Executing strategy A.\");\n\t}\n}\n\n" +
            "public class ConcreteStrategyB implements Strategy {\n" +
            "\tpublic void execute() {\n\t\tSystem.out.println(\"Executing strategy B.\");\n\t}\n}\n\n" +
            "public class StrategyContext {\n\tprivate Strategy strategy;\n\n" +
            "\tpublic StrategyContext(Strategy strategy) {\n\t\tthis.strategy = strategy;\n\t}\n\n" +
            "\tpublic void executeStrategy() {\n\t\tstrategy.execute();\n\t}\n}"),
    TEMPLATE_METHOD("public abstract class AbstractClass {\n\tpublic void templateMethod() {\n\t\t" +
            "step1();\n\t\tstep2();\n\t}\n\n\tpublic abstract void step1();\n\n\tpublic abstract void step2();\n}\n\n" +
            "public class ConcreteClass extends AbstractClass {\n\t@Override\n\tpublic void step1() {\n\t\t" +
            "System.out.println(\"ConcreteClass: Step 1.\");\n\t}\n\n\t@Override\n\tpublic void step2() {\n\t\t" +
            "System.out.println(\"ConcreteClass: Step 2.\");\n\t}\n}"),
    BUILDER("public class Product {\n\tprivate String attribute1;\n\tprivate int attribute2;\n\n" +
            "\tpublic String getAttribute1() {\n\t\treturn attribute1;\n\t}\n\n" +
            "\tpublic void setAttribute1(String attribute1) {\n\t\tthis.attribute1 = attribute1;\n\t}\n\n" +
            "\tpublic int getAttribute2() {\n\t\treturn attribute2;\n\t}\n\n" +
            "\tpublic void setAttribute2(int attribute2) {\n\t\tthis.attribute2 = attribute2;\n\t}\n" +
            "}"),
    FACTORY("public interface Product {\n\tvoid doSomething();\n}\n\n" +
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
            "}"),
    SINGLETON("private static Singleton instance;\n\n" +
            "private Singleton() {\n\t// Private constructor\n}\n\n" +
            "public static Singleton getInstance() {\n" +
            "\tif (instance == null) {\n" +
            "\t\tinstance = new Singleton();\n" +
            "\t}\n" +
            "\treturn instance;\n" +
            "}"),
    ADAPTER("public interface Target {\n\tvoid request();\n}\n\n" +
            "public class Adaptee {\n\tpublic void specificRequest() {\n\t\tSystem.out.println(\"Adaptee's specific request.\");\n\t}\n}\n\n" +
            "public class Adapter implements Target {\n\tprivate Adaptee adaptee;\n\n" +
            "\tpublic Adapter(Adaptee adaptee) {\n\t\tthis.adaptee = adaptee;\n\t}\n\n" +
            "\tpublic void request() {\n\t\tadaptee.specificRequest();\n\t}\n}"),
    DECORATOR("public interface Component {\n\tvoid operation();\n}\n\n" +
            "public class ConcreteComponent implements Component {\n" +
            "\tpublic void operation() {\n\t\tSystem.out.println(\"ConcreteComponent operation.\");\n\t}\n}\n\n" +
            "public class Decorator implements Component {\n\tprivate Component component;\n\n" +
            "\tpublic Decorator(Component component) {\n\t\tthis.component = component;\n\t}\n\n" +
            "\tpublic void operation() {\n\t\tcomponent.operation();\n\t}\n}"),
    PROXY("public interface Subject {\n\tvoid request();\n}\n\n" +
            "public class RealSubject implements Subject {\n" +
            "\tpublic void request() {\n\t\tSystem.out.println(\"RealSubject request.\");\n\t}\n}\n\n" +
            "public class Proxy implements Subject {\n\tprivate RealSubject realSubject;\n\n" +
            "\tpublic Proxy() {\n\t\trealSubject = new RealSubject();\n\t}\n\n" +
            "\tpublic void request() {\n\t\trealSubject.request();\n\t}\n}");
    private String code;
    private DesignPatternTemplates(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
