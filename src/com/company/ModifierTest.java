//package com.company;

/*
string1 - skal kun være synlig for objektet selv og indre klasser
string2 - skal kun være synlig for objektet selv og nedarvende klasser
string3 - skal være synlig for alle i pakken
string4 - skal være synlig for alle i projektet
string5 - skal være bundet til klassen og ens for alle objekter af samme type (også selv om den ændres)
string6 - skal ikke kunne ændres når objektet er instantieret
*/

public class ModifierTest {
    private String string1;
    protected String string2;
    String string3;
    public String string4;
    public static String string5;
    public final String string6 = "string6" ;
}
