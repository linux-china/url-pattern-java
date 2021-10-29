package org.mvnsearch;

import org.jetbrains.annotations.Nullable;

/**
 * URLPattern
 *
 * @author linux_china
 */
public class URLPattern {
    private @Nullable String protocol;
    private @Nullable String username;
    private @Nullable String password;
    private @Nullable String hostname;
    /**
     * URL port, null without assign
     */
    private @Nullable Integer port;
    private @Nullable String pathname;
    /**
     * URL query string
     */
    private @Nullable String search;
    /**
     * URL fragment
     */
    private @Nullable String hash;

    public URLPattern(URLPatternInit input) {

    }

    public URLPattern(String patternString) {

    }

    public URLPattern(String patternString, String baseUrl) {

    }

    public boolean test(URLPatternInit input) {
        return false;
    }

    public boolean test(String input) {
        return false;
    }

    public boolean test(String url, String baseURL) {
        return false;
    }

    @Nullable
    public URLPatternResult exec(URLPatternInit input) {
        return null;
    }

    @Nullable
    public URLPatternResult exec(String url) {
        return null;
    }

    @Nullable
    public URLPatternResult exec(String url, String baseURL) {
        return null;
    }
}
