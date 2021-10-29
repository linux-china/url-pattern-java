package org.mvnsearch;

import org.jetbrains.annotations.Nullable;

/**
 * URLPatternResult
 *
 * @author linux_china
 */
public class URLPatternResult {
    private String[] inputs;
    @Nullable
    private URLPatternComponentResult protocol;
    @Nullable
    private URLPatternComponentResult username;
    @Nullable
    private URLPatternComponentResult password;
    @Nullable
    private URLPatternComponentResult hostname;
    @Nullable
    private URLPatternComponentResult port;
    @Nullable
    private URLPatternComponentResult pathname;
    @Nullable
    private URLPatternComponentResult search;
    @Nullable
    private URLPatternComponentResult hash;

    public String[] getInputs() {
        return inputs;
    }

    public void setInputs(String[] inputs) {
        this.inputs = inputs;
    }

    public @Nullable URLPatternComponentResult getProtocol() {
        return protocol;
    }

    public void setProtocol(URLPatternComponentResult protocol) {
        this.protocol = protocol;
    }

    public @Nullable URLPatternComponentResult getUsername() {
        return username;
    }

    public void setUsername(URLPatternComponentResult username) {
        this.username = username;
    }

    public @Nullable URLPatternComponentResult getPassword() {
        return password;
    }

    public void setPassword(URLPatternComponentResult password) {
        this.password = password;
    }

    public @Nullable URLPatternComponentResult getHostname() {
        return hostname;
    }

    public void setHostname(URLPatternComponentResult hostname) {
        this.hostname = hostname;
    }

    public @Nullable URLPatternComponentResult getPort() {
        return port;
    }

    public void setPort(URLPatternComponentResult port) {
        this.port = port;
    }

    public @Nullable URLPatternComponentResult getPathname() {
        return pathname;
    }

    public void setPathname(URLPatternComponentResult pathname) {
        this.pathname = pathname;
    }

    public @Nullable URLPatternComponentResult getSearch() {
        return search;
    }

    public void setSearch(URLPatternComponentResult search) {
        this.search = search;
    }

    public @Nullable URLPatternComponentResult getHash() {
        return hash;
    }

    public void setHash(URLPatternComponentResult hash) {
        this.hash = hash;
    }
}
