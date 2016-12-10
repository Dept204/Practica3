
package com.example.cresh.practica3.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    private Integer id;
    private Integer orderNumber;
    private String createdAt;
    private String updatedAt;
    private String completedAt;
    private String status;
    private String currency;
    private String total;
    private String subtotal;
    private Integer totalLineItemsQuantity;
    private String totalTax;
    private String totalShipping;
    private String cartTax;
    private String shippingTax;
    private String totalDiscount;
    private String shippingMethods;
    private PaymentDetails paymentDetails;
    private BillingAddress billingAddress;
    private ShippingAddress shippingAddress;
    private String note;
    private String customerIp;
    private String customerUserAgent;
    private Integer customerId;
    private String viewOrderUrl;
    private List<LineItem> lineItems = null;
    private List<ShippingLine> shippingLines = null;
    private List<Object> taxLines = null;
    private List<Object> feeLines = null;
    private List<Object> couponLines = null;
    private Customer customer;
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
     *     The orderNumber
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 
     * @param orderNumber
     *     The order_number
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 
     * @return
     *     The completedAt
     */
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     * 
     * @param completedAt
     *     The completed_at
     */
    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
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
     *     The totalLineItemsQuantity
     */
    public Integer getTotalLineItemsQuantity() {
        return totalLineItemsQuantity;
    }

    /**
     * 
     * @param totalLineItemsQuantity
     *     The total_line_items_quantity
     */
    public void setTotalLineItemsQuantity(Integer totalLineItemsQuantity) {
        this.totalLineItemsQuantity = totalLineItemsQuantity;
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
     *     The totalShipping
     */
    public String getTotalShipping() {
        return totalShipping;
    }

    /**
     * 
     * @param totalShipping
     *     The total_shipping
     */
    public void setTotalShipping(String totalShipping) {
        this.totalShipping = totalShipping;
    }

    /**
     * 
     * @return
     *     The cartTax
     */
    public String getCartTax() {
        return cartTax;
    }

    /**
     * 
     * @param cartTax
     *     The cart_tax
     */
    public void setCartTax(String cartTax) {
        this.cartTax = cartTax;
    }

    /**
     * 
     * @return
     *     The shippingTax
     */
    public String getShippingTax() {
        return shippingTax;
    }

    /**
     * 
     * @param shippingTax
     *     The shipping_tax
     */
    public void setShippingTax(String shippingTax) {
        this.shippingTax = shippingTax;
    }

    /**
     * 
     * @return
     *     The totalDiscount
     */
    public String getTotalDiscount() {
        return totalDiscount;
    }

    /**
     * 
     * @param totalDiscount
     *     The total_discount
     */
    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    /**
     * 
     * @return
     *     The shippingMethods
     */
    public String getShippingMethods() {
        return shippingMethods;
    }

    /**
     * 
     * @param shippingMethods
     *     The shipping_methods
     */
    public void setShippingMethods(String shippingMethods) {
        this.shippingMethods = shippingMethods;
    }

    /**
     * 
     * @return
     *     The paymentDetails
     */
    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * 
     * @param paymentDetails
     *     The payment_details
     */
    public void setPaymentDetails(PaymentDetails paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    /**
     * 
     * @return
     *     The billingAddress
     */
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * 
     * @param billingAddress
     *     The billing_address
     */
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    /**
     * 
     * @return
     *     The shippingAddress
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 
     * @param shippingAddress
     *     The shipping_address
     */
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    /**
     * 
     * @return
     *     The note
     */
    public String getNote() {
        return note;
    }

    /**
     * 
     * @param note
     *     The note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 
     * @return
     *     The customerIp
     */
    public String getCustomerIp() {
        return customerIp;
    }

    /**
     * 
     * @param customerIp
     *     The customer_ip
     */
    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    /**
     * 
     * @return
     *     The customerUserAgent
     */
    public String getCustomerUserAgent() {
        return customerUserAgent;
    }

    /**
     * 
     * @param customerUserAgent
     *     The customer_user_agent
     */
    public void setCustomerUserAgent(String customerUserAgent) {
        this.customerUserAgent = customerUserAgent;
    }

    /**
     * 
     * @return
     *     The customerId
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * 
     * @param customerId
     *     The customer_id
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * 
     * @return
     *     The viewOrderUrl
     */
    public String getViewOrderUrl() {
        return viewOrderUrl;
    }

    /**
     * 
     * @param viewOrderUrl
     *     The view_order_url
     */
    public void setViewOrderUrl(String viewOrderUrl) {
        this.viewOrderUrl = viewOrderUrl;
    }

    /**
     * 
     * @return
     *     The lineItems
     */
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    /**
     * 
     * @param lineItems
     *     The line_items
     */
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    /**
     * 
     * @return
     *     The shippingLines
     */
    public List<ShippingLine> getShippingLines() {
        return shippingLines;
    }

    /**
     * 
     * @param shippingLines
     *     The shipping_lines
     */
    public void setShippingLines(List<ShippingLine> shippingLines) {
        this.shippingLines = shippingLines;
    }

    /**
     * 
     * @return
     *     The taxLines
     */
    public List<Object> getTaxLines() {
        return taxLines;
    }

    /**
     * 
     * @param taxLines
     *     The tax_lines
     */
    public void setTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
    }

    /**
     * 
     * @return
     *     The feeLines
     */
    public List<Object> getFeeLines() {
        return feeLines;
    }

    /**
     * 
     * @param feeLines
     *     The fee_lines
     */
    public void setFeeLines(List<Object> feeLines) {
        this.feeLines = feeLines;
    }

    /**
     * 
     * @return
     *     The couponLines
     */
    public List<Object> getCouponLines() {
        return couponLines;
    }

    /**
     * 
     * @param couponLines
     *     The coupon_lines
     */
    public void setCouponLines(List<Object> couponLines) {
        this.couponLines = couponLines;
    }

    /**
     * 
     * @return
     *     The customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * 
     * @param customer
     *     The customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
