package org.mvnsearch;

import java.util.Map;

/**
 * URLPatternComponentResult
 *
 * @author linux_china
 */
public class URLPatternComponentResult {
    private String input;
    private Map<String, String> groups;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Map<String, String> getGroups() {
        return groups;
    }

    public void setGroups(Map<String, String> groups) {
        this.groups = groups;
    }
}
