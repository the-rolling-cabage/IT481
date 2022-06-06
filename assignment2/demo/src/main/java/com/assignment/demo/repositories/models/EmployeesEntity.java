package com.assignment.demo.repositories.models;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "Employees", schema = "dbo", catalog = "Northwind")
public class EmployeesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EmployeeID", nullable = false)
    private int employeeId;
    @Basic
    @Column(name = "LastName", nullable = false, length = 20)
    private String lastName;
    @Basic
    @Column(name = "FirstName", nullable = false, length = 10)
    private String firstName;
    @Basic
    @Column(name = "Title", nullable = true, length = 30)
    private String title;
    @Basic
    @Column(name = "TitleOfCourtesy", nullable = true, length = 25)
    private String titleOfCourtesy;
    @Basic
    @Column(name = "BirthDate", nullable = true)
    private Date birthDate;
    @Basic
    @Column(name = "HireDate", nullable = true)
    private Date hireDate;
    @Basic
    @Column(name = "Address", nullable = true, length = 60)
    private String address;
    @Basic
    @Column(name = "City", nullable = true, length = 15)
    private String city;
    @Basic
    @Column(name = "Region", nullable = true, length = 15)
    private String region;
    @Basic
    @Column(name = "PostalCode", nullable = true, length = 10)
    private String postalCode;
    @Basic
    @Column(name = "Country", nullable = true, length = 15)
    private String country;
    @Basic
    @Column(name = "HomePhone", nullable = true, length = 24)
    private String homePhone;
    @Basic
    @Column(name = "Salary", nullable = true)
    private Object salary;
    @Basic
    @Column(name = "Extension", nullable = true, length = 4)
    private String extension;
    @Basic
    @Column(name = "Photo", nullable = true)
    private byte[] photo;
    @Basic
    @Column(name = "Notes", nullable = true, length = -1)
    private String notes;
    @Basic
    @Column(name = "ReportsTo", nullable = true)
    private Integer reportsTo;
    @Basic
    @Column(name = "PhotoPath", nullable = true, length = 255)
    private String photoPath;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public Object getSalary() {
        return salary;
    }

    public void setSalary(Object salary) {
        this.salary = salary;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Integer getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Integer reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeesEntity that = (EmployeesEntity) o;

        if (employeeId != that.employeeId) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (titleOfCourtesy != null ? !titleOfCourtesy.equals(that.titleOfCourtesy) : that.titleOfCourtesy != null)
            return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (hireDate != null ? !hireDate.equals(that.hireDate) : that.hireDate != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (homePhone != null ? !homePhone.equals(that.homePhone) : that.homePhone != null) return false;
        if (salary != null ? !salary.equals(that.salary) : that.salary != null) return false;
        if (extension != null ? !extension.equals(that.extension) : that.extension != null) return false;
        if (!Arrays.equals(photo, that.photo)) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (reportsTo != null ? !reportsTo.equals(that.reportsTo) : that.reportsTo != null) return false;
        if (photoPath != null ? !photoPath.equals(that.photoPath) : that.photoPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (titleOfCourtesy != null ? titleOfCourtesy.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (homePhone != null ? homePhone.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (reportsTo != null ? reportsTo.hashCode() : 0);
        result = 31 * result + (photoPath != null ? photoPath.hashCode() : 0);
        return result;
    }
}
