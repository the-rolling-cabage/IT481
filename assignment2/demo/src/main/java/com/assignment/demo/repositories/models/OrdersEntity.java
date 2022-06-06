package com.assignment.demo.repositories.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Orders", schema = "dbo", catalog = "Northwind")
public class OrdersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "OrderID", nullable = false)
    private int orderId;
    @Basic
    @Column(name = "CustomerID", nullable = true, length = 5)
    private String customerId;
    @Basic
    @Column(name = "EmployeeID", nullable = true)
    private Integer employeeId;
    @Basic
    @Column(name = "OrderDate", nullable = true)
    private Date orderDate;
    @Basic
    @Column(name = "RequiredDate", nullable = true)
    private Date requiredDate;
    @Basic
    @Column(name = "ShippedDate", nullable = true)
    private Date shippedDate;
    @Basic
    @Column(name = "ShipVia", nullable = true)
    private Integer shipVia;
    @Basic
    @Column(name = "Freight", nullable = true)
    private Object freight;
    @Basic
    @Column(name = "ShipName", nullable = true, length = 40)
    private String shipName;
    @Basic
    @Column(name = "ShipAddress", nullable = true, length = 60)
    private String shipAddress;
    @Basic
    @Column(name = "ShipCity", nullable = true, length = 15)
    private String shipCity;
    @Basic
    @Column(name = "ShipRegion", nullable = true, length = 15)
    private String shipRegion;
    @Basic
    @Column(name = "ShipPostalCode", nullable = true, length = 10)
    private String shipPostalCode;
    @Basic
    @Column(name = "ShipCountry", nullable = true, length = 15)
    private String shipCountry;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Integer getShipVia() {
        return shipVia;
    }

    public void setShipVia(Integer shipVia) {
        this.shipVia = shipVia;
    }

    public Object getFreight() {
        return freight;
    }

    public void setFreight(Object freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdersEntity that = (OrdersEntity) o;

        if (orderId != that.orderId) return false;
        if (customerId != null ? !customerId.equals(that.customerId) : that.customerId != null) return false;
        if (employeeId != null ? !employeeId.equals(that.employeeId) : that.employeeId != null) return false;
        if (orderDate != null ? !orderDate.equals(that.orderDate) : that.orderDate != null) return false;
        if (requiredDate != null ? !requiredDate.equals(that.requiredDate) : that.requiredDate != null) return false;
        if (shippedDate != null ? !shippedDate.equals(that.shippedDate) : that.shippedDate != null) return false;
        if (shipVia != null ? !shipVia.equals(that.shipVia) : that.shipVia != null) return false;
        if (freight != null ? !freight.equals(that.freight) : that.freight != null) return false;
        if (shipName != null ? !shipName.equals(that.shipName) : that.shipName != null) return false;
        if (shipAddress != null ? !shipAddress.equals(that.shipAddress) : that.shipAddress != null) return false;
        if (shipCity != null ? !shipCity.equals(that.shipCity) : that.shipCity != null) return false;
        if (shipRegion != null ? !shipRegion.equals(that.shipRegion) : that.shipRegion != null) return false;
        if (shipPostalCode != null ? !shipPostalCode.equals(that.shipPostalCode) : that.shipPostalCode != null)
            return false;
        if (shipCountry != null ? !shipCountry.equals(that.shipCountry) : that.shipCountry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (customerId != null ? customerId.hashCode() : 0);
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
        result = 31 * result + (requiredDate != null ? requiredDate.hashCode() : 0);
        result = 31 * result + (shippedDate != null ? shippedDate.hashCode() : 0);
        result = 31 * result + (shipVia != null ? shipVia.hashCode() : 0);
        result = 31 * result + (freight != null ? freight.hashCode() : 0);
        result = 31 * result + (shipName != null ? shipName.hashCode() : 0);
        result = 31 * result + (shipAddress != null ? shipAddress.hashCode() : 0);
        result = 31 * result + (shipCity != null ? shipCity.hashCode() : 0);
        result = 31 * result + (shipRegion != null ? shipRegion.hashCode() : 0);
        result = 31 * result + (shipPostalCode != null ? shipPostalCode.hashCode() : 0);
        result = 31 * result + (shipCountry != null ? shipCountry.hashCode() : 0);
        return result;
    }
}
