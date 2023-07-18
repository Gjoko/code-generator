package main.java.codegenerator;

public enum DesignPatternFactoryType {
    CREATIONAL(1),
    STRUCTURAL(2),
    BEHAVIORAL(3);

    private final int value;

    DesignPatternFactoryType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static DesignPatternFactoryType fromInteger(int value) {
        for (DesignPatternFactoryType category : DesignPatternFactoryType.values()) {
            if (category.getValue() == value) {
                return category;
            }
        }
        return null;
    }
}
