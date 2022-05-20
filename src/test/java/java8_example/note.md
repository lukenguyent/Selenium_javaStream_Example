# java 8 learning note
    > Functional programing - building software by using pure functions
    > and avoid share state - side effects
* <u>share state</u> : variable share by multiple function
* <u>side effect</u> : function modifies the variable

## SAM - single abstract method

Using @FunctionalInterface annotation 

```java
@FunctionalInterface
public interface Greeting{
    void greet(String name);
    void hi();
}
```
? When lambda execution

-> at the time it be called (e.g: abc.greet())
