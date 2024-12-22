```java
// Пример использования аннотации @Override
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Пример использования аннотации @Deprecated
class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

// Пример использования аннотации @SuppressWarnings
import java.util.ArrayList;
import java.util.List;

class Example {
    @SuppressWarnings("unchecked")
    void method() {
        List list = new ArrayList();
        list.add("String");
        list.add(123);
    }
}
```

Аннотация @Override:
Указывает, что метод переопределяет метод из суперкласса.

Аннотация @Deprecated:
Указывает, что метод, класс или поле устарело и не рекомендуется к использованию.

Аннотация @SuppressWarnings:
Подавляет предупреждения компилятора.
