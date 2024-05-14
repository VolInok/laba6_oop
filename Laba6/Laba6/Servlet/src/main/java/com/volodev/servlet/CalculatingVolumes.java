package com.volodev.servlet;

public class CalculatingVolumes {
    static double answer = 0.0;

    public static double Parallelepiped(double length, double width, double height, int precision) {
        answer = length * width * height;
        return Math.round(answer * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    public static double Cube(double length, int precision) {
        answer = Math.pow(length, 3);
        return Math.round(answer * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    public static double Tetrahedron(double length, int precision) {
        answer = Math.pow(length, 3) * (Math.sqrt(2) / 12);
        return Math.round(answer * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    public static double Ball(double radius, int precision) {
        answer = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return Math.round(answer * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    public static double Cylinder(double height, double radius, int precision) {
        answer = Math.PI * Math.pow(radius, 2) * height;
        return Math.round(answer * Math.pow(10, precision)) / Math.pow(10, precision);
    }

    public static double Cone(double height, double radius, int precision) {
        answer = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        return Math.round(answer * Math.pow(10, precision)) / Math.pow(10, precision);
    }
}
