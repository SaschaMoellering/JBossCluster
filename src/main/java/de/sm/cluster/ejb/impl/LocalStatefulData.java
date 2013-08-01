package de.sm.cluster.ejb.impl;

import de.sm.cluster.ejb.StatefulData;
import de.sm.cluster.pojo.Property;
import org.jboss.annotation.ejb.Clustered;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sascha
 * Date: 01.08.13
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 */
@Stateful
@Clustered
@SessionScoped
@LocalBean
public class LocalStatefulData implements StatefulData, Serializable {
    private  List<Property> cache;

	@PostConstruct
    public void initCache(){
        this.cache = queryCache();
        if (cache == null) cache = new ArrayList<Property>();
    }


    @Override
    public void delete(){
        this.cache.clear();
    }

    @Override
    public void put(String key,String value){
        Property p = new Property();
        p.setKey(key);
        p.setValue(value);
        this.cache.add(p);
    }

    @Override
    public List<Property> getCache() {
        return cache;
    }

    @Override
    public List<Property> queryCache(){
        return cache;
    }
}
