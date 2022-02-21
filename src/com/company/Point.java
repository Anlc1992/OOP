//package com.company;

public class Point {
    private int x;
    private int y;

    Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return ("("+x+","+y+")");
    }

    public boolean equals(Point other){
        return (this.toString().equals(other.toString()));
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
}

