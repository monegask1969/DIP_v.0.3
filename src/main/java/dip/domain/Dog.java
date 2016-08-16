/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moneg
 */
@Entity
@Table(name = "dogs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dogs.findAll", query = "SELECT d FROM Dogs d"),
    @NamedQuery(name = "Dogs.findById", query = "SELECT d FROM Dogs d WHERE d.id = :id"),
    @NamedQuery(name = "Dogs.findByBreed", query = "SELECT d FROM Dogs d WHERE d.breed = :breed"),
    @NamedQuery(name = "Dogs.findByGender", query = "SELECT d FROM Dogs d WHERE d.gender = :gender"),
    @NamedQuery(name = "Dogs.findByName", query = "SELECT d FROM Dogs d WHERE d.name = :name"),
    @NamedQuery(name = "Dogs.findByDob", query = "SELECT d FROM Dogs d WHERE d.dob = :dob"),
    @NamedQuery(name = "Dogs.findByColor", query = "SELECT d FROM Dogs d WHERE d.color = :color"),
    @NamedQuery(name = "Dogs.findByChip", query = "SELECT d FROM Dogs d WHERE d.chip = :chip"),
    @NamedQuery(name = "Dogs.findByBrand", query = "SELECT d FROM Dogs d WHERE d.brand = :brand"),
    @NamedQuery(name = "Dogs.findByPedigree", query = "SELECT d FROM Dogs d WHERE d.pedigree = :pedigree"),
    @NamedQuery(name = "Dogs.findByOwnerSCity", query = "SELECT d FROM Dogs d WHERE d.ownerSCity = :ownerSCity"),
    @NamedQuery(name = "Dogs.findBySire", query = "SELECT d FROM Dogs d WHERE d.sire = :sire"),
    @NamedQuery(name = "Dogs.findByDam", query = "SELECT d FROM Dogs d WHERE d.dam = :dam"),
    @NamedQuery(name = "Dogs.findByFCIgroup", query = "SELECT d FROM Dogs d WHERE d.fCIgroup = :fCIgroup"),
    @NamedQuery(name = "Dogs.findByOFname", query = "SELECT d FROM Dogs d WHERE d.oFname = :oFname"),
    @NamedQuery(name = "Dogs.findByOSname", query = "SELECT d FROM Dogs d WHERE d.oSname = :oSname"),
    @NamedQuery(name = "Dogs.findByOLname", query = "SELECT d FROM Dogs d WHERE d.oLname = :oLname"),
    @NamedQuery(name = "Dogs.findByBFname", query = "SELECT d FROM Dogs d WHERE d.bFname = :bFname"),
    @NamedQuery(name = "Dogs.findByBSname", query = "SELECT d FROM Dogs d WHERE d.bSname = :bSname"),
    @NamedQuery(name = "Dogs.findByBLname", query = "SELECT d FROM Dogs d WHERE d.bLname = :bLname")})
public class Dog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "breed")
    private String breed;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "dob")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @Column(name = "color")
    private String color;
    @Basic(optional = false)
    @Column(name = "chip")
    private String chip;
    @Basic(optional = false)
    @Column(name = "brand")
    private String brand;
    @Basic(optional = false)
    @Column(name = "pedigree")
    private String pedigree;
    @Basic(optional = false)
    @Column(name = "owner's_city")
    private String ownerSCity;
    @Basic(optional = false)
    @Column(name = "sire")
    private String sire;
    @Basic(optional = false)
    @Column(name = "dam")
    private String dam;
    @Basic(optional = false)
    @Column(name = "FCI_group")
    private int fCIgroup;
    @Basic(optional = false)
    @Column(name = "o_fname")
    private String oFname;
    @Basic(optional = false)
    @Column(name = "o_sname")
    private String oSname;
    @Basic(optional = false)
    @Column(name = "o_lname")
    private String oLname;
    @Basic(optional = false)
    @Column(name = "b_fname")
    private String bFname;
    @Basic(optional = false)
    @Column(name = "b_sname")
    private String bSname;
    @Basic(optional = false)
    @Column(name = "b_lname")
    private String bLname;

    public Dog() {
    }

    public Dog(Integer id) {
        this.id = id;
    }

    public Dog(Integer id, String breed, String gender, String name, Date dob, String color, String chip, String brand, String pedigree, String ownerSCity, String sire, String dam, int fCIgroup, String oFname, String oSname, String oLname, String bFname, String bSname, String bLname) {
        this.id = id;
        this.breed = breed;
        this.gender = gender;
        this.name = name;
        this.dob = dob;
        this.color = color;
        this.chip = chip;
        this.brand = brand;
        this.pedigree = pedigree;
        this.ownerSCity = ownerSCity;
        this.sire = sire;
        this.dam = dam;
        this.fCIgroup = fCIgroup;
        this.oFname = oFname;
        this.oSname = oSname;
        this.oLname = oLname;
        this.bFname = bFname;
        this.bSname = bSname;
        this.bLname = bLname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPedigree() {
        return pedigree;
    }

    public void setPedigree(String pedigree) {
        this.pedigree = pedigree;
    }

    public String getOwnerSCity() {
        return ownerSCity;
    }

    public void setOwnerSCity(String ownerSCity) {
        this.ownerSCity = ownerSCity;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public int getFCIgroup() {
        return fCIgroup;
    }

    public void setFCIgroup(int fCIgroup) {
        this.fCIgroup = fCIgroup;
    }

    public String getOFname() {
        return oFname;
    }

    public void setOFname(String oFname) {
        this.oFname = oFname;
    }

    public String getOSname() {
        return oSname;
    }

    public void setOSname(String oSname) {
        this.oSname = oSname;
    }

    public String getOLname() {
        return oLname;
    }

    public void setOLname(String oLname) {
        this.oLname = oLname;
    }

    public String getBFname() {
        return bFname;
    }

    public void setBFname(String bFname) {
        this.bFname = bFname;
    }

    public String getBSname() {
        return bSname;
    }

    public void setBSname(String bSname) {
        this.bSname = bSname;
    }

    public String getBLname() {
        return bLname;
    }

    public void setBLname(String bLname) {
        this.bLname = bLname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dog)) {
            return false;
        }
        Dog other = (Dog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dip.domain.Dogs[ id=" + id + " ]";
    }
    
}
