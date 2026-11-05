package com.example.practice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice1Application {

	public static void main(String[] args) {
    SpringApplication.run(Practice1Application.class, args);

    Square square = new Square(3);
    Rectangle rectangle = new Rectangle(2, 3);

    System.out.println("Square area: " + square.calculateArea());
    System.out.println("Square perimeter: " + square.calculatePerimeter());
    System.out.println("Rectangle area: " + rectangle.calculateArea());
    System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
}

}
