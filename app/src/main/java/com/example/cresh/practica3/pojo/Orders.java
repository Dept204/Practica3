
package com.example.cresh.practica3.pojo;

import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;

import java.util.ArrayList;
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

    public List<BarEntry> getChartData(){
        List<BarEntry> entries = new ArrayList<>(orders.size());

        int i = 0;

        for (Order order: orders){
            BarEntry entry = new BarEntry(i, Float.parseFloat(order.getTotal()));
            entries.add(entry);
            i++;
        }

        return entries;
    }

}
