/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Model;

/**
 *
 * @author QuaVi
 */
public class EastAsiaCountries {

    protected String countryCode;
    protected String countryName;
    protected float totaArea;

    public EastAsiaCountries() {

    }

    public EastAsiaCountries(String countryCode, String countryName, float totaArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totaArea = totaArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public float getTotaArea() {
        return totaArea;
    }

    public void setTotaArea(float totaArea) {
        this.totaArea = totaArea;
    }
    
    public void display(){
        
    }
}
