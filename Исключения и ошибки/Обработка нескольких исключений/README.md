```java
try {
   ...
} catch (final Exception e) {
   ...
}
```
Использование ключевого слова final в объявлении переменной в блоке catch означает, что переменная e не может быть изменена после её инициализации. Это гарантирует, что переменная e будет ссылаться на тот же объект исключения, который был перехвачен, и не может быть переназначена на другой объект.