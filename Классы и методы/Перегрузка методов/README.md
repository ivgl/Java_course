Разница состоит в том, что в 1 вызове вызываются элементы массива num, каждый из которых является объектом типа Number, поэтому будет вываться только:
```java
	public void printNum(Number n) {
        System.out.println("Number=" + n);
    }
```
Итоговый вывод:
	Number=1
	Number=11
	Number=1.11
	Number=11.11
	Integer = 1
	int = 11
	Float = 1.1100
	Number=11.11