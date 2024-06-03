package com.zaroyan.geometryapp;
import com.zaroyan.geometry.GeometryUtils;
import com.zaroyan.geometrylibrary.*;
import com.zaroyan.threedimensional.Cube;
import com.zaroyan.threedimensional.Sphere;

/**
 * @author Zaroyan
 */


public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 7);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println(circle.toString());
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeter());

        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());


        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(6);

        // Сравнение площадей кругов
        boolean equalCircleAreas = GeometryUtils.areEqual(circle1, circle2);
        System.out.println("Площади круга1 и круга2 равны? " + (equalCircleAreas ? "Да" : "Нет"));

        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(6, 2);

        // Сравнение площадей прямоугольников
        boolean equalRectangleAreas = GeometryUtils.areEqual(rectangle1, rectangle2);
        System.out.println("Площади прямоугольника1 и прямоугольника2 равны? " + (equalRectangleAreas ? "Да" : "Нет"));

        Triangle triangle1 = new Triangle(3, 4, 5);
        Triangle triangle2 = new Triangle(6, 8, 10);

        // Сравнение площадей треугольников
        boolean equalTriangleAreas = GeometryUtils.areEqual(triangle1, triangle2);
        System.out.println("Площади треугольника1 и треугольника2 равны? " + (equalTriangleAreas ? "Да" : "Нет"));


        Sphere sphere1 = new Sphere(3);
        double sphereVolume = sphere1.calculateVolume();
        System.out.println("Объем сферы: " + sphereVolume);

        Cube cube1 = new Cube(3);
        double cubeVolume = cube1.calculateVolume();
        System.out.println("Объем куба: " + cubeVolume);

        Sphere sphere2 = new Sphere(3);
        double sphereSurfaceArea = sphere2.calculateSurfaceArea();
        System.out.println("Площадь поверхности сферы: " + sphereSurfaceArea);

        Cube cube2 = new Cube(3);
        double cubeSurfaceArea = cube2.calculateSurfaceArea();
        System.out.println("Площадь поверхности куба: " + cubeSurfaceArea);

    }
}
