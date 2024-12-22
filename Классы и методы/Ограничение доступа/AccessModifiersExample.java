package com.example;

// Класс с различными спецификаторами доступа
public class AccessModifiersExample {

    // private: доступен только внутри этого класса
    private int privateField = 1;

    // по умолчанию (без спецификатора): доступен внутри пакета
    int defaultField = 2;

    // protected: доступен внутри пакета и подклассам в других пакетах
    protected int protectedField = 3;

    // public: доступен всем классам
    public int publicField = 4;

    // private метод: доступен только внутри этого класса
    private void privateMethod() {
        System.out.println("Private method called");
    }

    // метод по умолчанию: доступен внутри пакета
    void defaultMethod() {
        System.out.println("Default method called");
    }

    // protected метод: доступен внутри пакета и подклассам в других пакетах
    protected void protectedMethod() {
        System.out.println("Protected method called");
    }

    // public метод: доступен всем классам
    public void publicMethod() {
        System.out.println("Public method called");
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();

        // Доступ к private полю и методу внутри класса
        System.out.println("privateField: " + example.privateField);
        example.privateMethod();

        // Доступ к полю и методу по умолчанию внутри пакета
        System.out.println("defaultField: " + example.defaultField);
        example.defaultMethod();

        // Доступ к protected полю и методу внутри пакета
        System.out.println("protectedField: " + example.protectedField);
        example.protectedMethod();

        // Доступ к public полю и методу
        System.out.println("publicField: " + example.publicField);
        example.publicMethod();
    }
}