
package com.example.cresh.practica3.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LineItem {

    private Integer id;
    private String subtotal;
    private String subtotalTax;
    private String total;
    private String totalTax;
    private String price;
    private Integer quantity;
    private Object taxClass;
    private String name;
    private Integer productId;
    private String sku;
    private List<Object> meta = null;
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
     *     The subtotal
     */
    public String getSubtotal() {
        return subtotal;
    }

    /**
     * 
     * @param subtotal
     *     The subtotal
     */
    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * 
     * @return
     *     The subtotalTax
     */
    public String getSubtotalTax() {
        return subtotalTax;
    }

    /**
     * 
     * @param subtotalTax
     *     The subtotal_tax
     */
    public void setSubtotalTax(String subtotalTax) {
        this.subtotalTax = subtotalTax;
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

    /**
     * 
     * @return
     *     The totalTax
     */
    public String getTotalTax() {
        return totalTax;
    }

    /**
     * 
     * @param totalTax
     *     The total_tax
     */
    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    /**
     * 
     * @return
     *     The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * 
     * @param price
     *     The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The taxClass
     */
    public Object getTaxClass() {
        return taxClass;
    }

    /**
     * 
     * @param taxClass
     *     The tax_class
     */
    public void setTaxClass(Object taxClass) {
        this.taxClass = taxClass;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The product_id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * 
     * @param sku
     *     The sku
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * 
     * @return
     *     The meta
     */
    public List<Object> getMeta() {
        return meta;
    }

    /**
     * 
     * @param meta
     *     The meta
     */
    public void setMeta(List<Object> meta) {
        this.meta = meta;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
