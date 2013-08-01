package de.sm.cluster.pojo;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: sascha
 * Date: 01.08.13
 * Time: 16:16
 * To change this template use File | Settings | File Templates.
 */
public class Property implements Serializable {

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
