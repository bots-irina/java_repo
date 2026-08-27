package ru.stqa.pft.sandbox;

public class Distance {

  public static void main(String[] args) {

    Point p1 = new Point (1, 2);
    Point p2 = new Point (4, 6);

    System.out.println("Расстояние между точками c координатами " + "p1(" + p1.x1 + ";" + p1.y1 + ") " + "и " + "p2(" + p2.x2 + ";" + p2.y2 + ")" + " = " + Point.distance(p1, p2));
  }

}
