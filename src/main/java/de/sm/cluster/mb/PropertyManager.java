package de.sm.cluster.mb;

import de.sm.cluster.ejb.StatefulData;
import de.sm.cluster.pojo.Property;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sascha
 * Date: 01.08.13
 * Time: 16:11
 * To change this template use File | Settings | File Templates.
 */

@SessionScoped
@Named(value="manager")
public class PropertyManager implements Serializable {

    @Inject
    StatefulData ejb;

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

    public void save() {
        ejb.put(key, value);
    }

    public void clear() {
        ejb.delete();

    }
    public List<Property> getCacheList() {
        return ejb.getCache();
    }
}