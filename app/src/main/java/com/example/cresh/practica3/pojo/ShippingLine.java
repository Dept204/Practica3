
package com.example.cresh.practica3.pojo;

import java.util.HashMap;
import java.util.Map;

public class ShippingLine {

    private Integer id;
    private String methodId;
    private String methodTitle;
    private String total;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The methodId
     */
    public String getMethodId() {
        return methodId;
    }

    /**
     * 
     * @param methodId
     *     The method_id
     */
    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    /**
     * 
     * @return
     *     The methodTitle
     */
    public String getMethodTitle() {
        return methodTitle;
    }

    /**
     * 
     * @param methodTitle
     *     The method_title
     */
    public void setMethodTitle(String methodTitle) {
        this.methodTitle = methodTitle;
    }

    /**
     * 
     * @return
     *     The total
     */
    public String getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
