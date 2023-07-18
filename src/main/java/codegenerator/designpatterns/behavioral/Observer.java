package main.java.codegenerator.designpatterns.behavioral;

import main.java.codegenerator.base.DesignPattern;

public class Observer extends DesignPattern {
    private String className;
    private String packageName;
    private String pattern;

    public Observer(String className, String packageName, String pattern) {
        this.className = className;
        this.packageName = packageName;
        this.pattern = pattern;
    }

    @Override
    public String getClassName() {
        return this.className;
    }

    @Override
    public String getPackageName() {
        return this.packageName;
    }

    @Override
    public String generatePattern() {
        return this.pattern;
    }
}
