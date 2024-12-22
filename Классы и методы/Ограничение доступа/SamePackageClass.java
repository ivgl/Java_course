package com.example;

public class SamePackageClass {
    public void accessFieldsAndMethods() {
        AccessModifiersExample example = new AccessModifiersExample();

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