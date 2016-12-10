
package com.example.cresh.practica3.pojo;

import java.util.HashMap;
import java.util.Map;

public class PaymentDetails {

    private String methodId;
    private String methodTitle;
    private Boolean paid;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The paid
     */
    public Boolean getPaid() {
        return paid;
    }

    /**
     * 
     * @param paid
     *     The paid
     */
    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
