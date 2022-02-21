//package com.company;

public class Car2 {
    private String brand;
    private String licenseplate;
    private String color;
    private int regno;

    private static int nextRegno=1;

    Car2(String model, String licenseplate, String color){
        this.brand = model;
        this.licenseplate = licenseplate;
        this.color = color;
        this.regno = nextRegno;
        nextRegno++;
    }

    public String toString(){
        return ("[" + licenseplate + "] " + color +" "+ brand);
    }

    public boolean equals(Car2 otherCar){
        return (this.licenseplate.equals(otherCar.getLicenseplate())) ;
    }

    public boolean alike(Car2 otherCar){
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

    public int getRegno() {
        return regno;
    }

    public static int getNextRegno() {
        return nextRegno;
    }
}
