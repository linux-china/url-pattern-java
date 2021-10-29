URLPattern Java
=================

URLPattern API implementation with Java. 

Alternatives:

* AntPathMatcher
* Spring PathPattern 

# How to use?

Add following dependency to your pom.xml:

```xml

<dependency>
    <groupId>org.mvnsearch</groupId>
    <artifactId>url-pattern-java</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```
     
Java example as following: 

```java
public class DemoTest {
    @Test
    public void testValidate() {
        URLPattern pattern = new URLPattern("https://example.com/books/:id");
        final boolean result = pattern.test("https://example.com/books/123");
        System.out.println(result);
    }

    @Test
    public void testExec() {
        URLPattern pattern = new URLPattern("https://example.com/books/:id");
        final URLPatternResult result = pattern.exec("/users/joe");
        System.out.println(result.getPathname().getGroups().get("id"));
    }
}
```

# References

* URLPattern API: https://wicg.github.io/urlpattern/
* Web APIs - URLPattern: https://developer.mozilla.org/en-US/docs/Web/API/URL_Pattern_API
* URLPattern Rust: https://github.com/denoland/rust-urlpattern