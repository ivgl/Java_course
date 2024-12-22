package com.example.subpackage;

import com.example.AccessModifiersExample;

public class DifferentPackageClass extends AccessModifiersExample {
    public void accessFieldsAndMethods() {
        // Доступ к protected полю и методу в подклассе в другом пакете
        System.out.println("protectedField: " + protectedField);
        protectedMethod();

        // Доступ к public полю и методу
        System.out.println("publicField: " + publicField);
        publicMethod();
    }
}