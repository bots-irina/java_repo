package ru.stqa.pft.sandbox;

public class Distance {

  public static void main(String[] args) {

    double x1 = 1;
    double y1 = 2;

    double x2 = 4;
    double y2 = 6;

    System.out.println("Расстояние между точками c координатами " + "p1(" + x1 + ";" + y1 + ") " + "и " + "p2(" + x2 + ";" + y2 + ")" + " = " + distance(x1, x2, y1, y2));
  }

  public static double distance(double x1, double x2, double y1, double y2) {
    return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
  }
}
