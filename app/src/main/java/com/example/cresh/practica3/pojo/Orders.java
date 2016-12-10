
package com.example.cresh.practica3.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Orders {

    private List<Order> orders = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The orders
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * 
     * @param orders
     *     The orders
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
