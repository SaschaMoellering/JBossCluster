package de.sm.cluster.ejb;

import de.sm.cluster.pojo.Property;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sascha
 * Date: 01.08.13
 * Time: 16:15
 * To change this template use File | Settings | File Templates.
 */
public interface StatefulData {
    public abstract void delete();
    public abstract void put(String key, String value);
    public abstract List<Property> getCache();
    public abstract List<Property> queryCache();
}
