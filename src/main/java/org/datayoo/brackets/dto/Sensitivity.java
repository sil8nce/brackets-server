package org.datayoo.brackets.dto;

import java.io.Serializable;

/**
 * Created by hadoop on 16-4-7.
 * 敏感度级别以及执行策略
 */
public class Sensitivity implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String level;

    private String strategy;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
