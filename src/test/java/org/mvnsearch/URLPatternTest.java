package org.mvnsearch;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * URLPattern test
 *
 * @author linux_china
 */
public class URLPatternTest {
    @Test
    public void testValidate() {
        URLPattern pattern = new URLPattern("https://example.com/books/:id");
        final boolean result = pattern.test("https://example.com/books/123");
        assertThat(result).isTrue();
    }

    @Test
    public void testExec() {
        URLPattern pattern = new URLPattern("https://example.com/users/:nick");
        final URLPatternResult result = pattern.exec("/users/joe");
        assertThat(result).isNotNull();
        assertThat(result).isNotNull();
        assertThat(result.getPathname().getGroups().get("nick")).isEqualTo("joe");
    }
}
