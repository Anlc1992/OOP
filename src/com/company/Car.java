//package com.company;

public class Car {
    private String brand;
    private String licenseplate;
    private String color;

    Car(String model, String licenseplate, String color){
        this.brand = model;
        this.licenseplate = licenseplate;
        this.color = color;
    }

    public String toString(){
        return ("[" + licenseplate + "] " + color +" "+ brand);
    }

    public boolean equals(Car otherCar){
        return (this.licenseplate.equals(otherCar.getLicenseplate())) ;
    }

    public boolean alike(Car otherCar){
        return (this.brand.equals(otherCar.getBrand()) && this.color.equals(otherCar.getColor()));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
