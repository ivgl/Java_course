```java
interface Interface {
  ...
}
```
Область видимости: Интерфейс имеет область видимости по умолчанию. Это означает, что он доступен только в пределах того же пакета, в котором он объявлен.

```java
public interface Interface {
  ...
}
```
Область видимости: Интерфейс имеет публичную область видимости. Это означает, что он доступен из любого другого пакета, если указать правильный путь к нему.

```java
protected interface Interface {
  ...
}
```
Область видимости: Модификатор protected не может быть использован для интерфейсов. Это приведет к ошибке компиляции. Интерфейсы могут быть либо public, либо иметь область видимости по умолчанию.

```java
private interface Interface {
  ...
}
```
Область видимости: Модификатор private не может быть использован для интерфейсов. Это приведет к ошибке компиляции. Интерфейсы могут быть либо public, либо иметь область видимости по умолчанию.