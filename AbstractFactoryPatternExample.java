// Write a program to Illustrate Abstract Factory method pattern

package com.designpatterns;

//Abstract product A
interface ProductA {
 void display();
}

//Concrete product A1
class ConcreteProductA1 implements ProductA {
 @Override
 public void display() {
     System.out.println("Product A1");
 }
}

//Concrete product A2
class ConcreteProductA2 implements ProductA {
 @Override
 public void display() {
     System.out.println("Product A2");
 }
}

//Abstract product B
interface ProductB {
 void show();
}

//Concrete product B1
class ConcreteProductB1 implements ProductB {
 @Override
 public void show() {
     System.out.println("Product B1");
 }
}

//Concrete product B2
class ConcreteProductB2 implements ProductB {
 @Override
 public void show() {
     System.out.println("Product B2");
 }
}

//Abstract factory interface
interface AbstractFactory {
 ProductA createProductA();
 ProductB createProductB();
}

//Concrete factory 1
class ConcreteFactory1 implements AbstractFactory {
 @Override
 public ProductA createProductA() {
     return new ConcreteProductA1();
 }

 @Override
 public ProductB createProductB() {
     return new ConcreteProductB1();
 }
}

//Concrete factory 2
class ConcreteFactory2 implements AbstractFactory {
 @Override
 public ProductA createProductA() {
     return new ConcreteProductA2();
 }

 @Override
 public ProductB createProductB() {
     return new ConcreteProductB2();
 }
}

//Client code
public class AbstractFactoryPatternExample {
 public static void main(String[] args) {
     AbstractFactory factory1 = new ConcreteFactory1();
     ProductA productA1 = factory1.createProductA();
     ProductB productB1 = factory1.createProductB();

     productA1.display();
     productB1.show();

     AbstractFactory factory2 = new ConcreteFactory2();
     ProductA productA2 = factory2.createProductA();
     ProductB productB2 = factory2.createProductB();

     productA2.display();
     productB2.show();
 }
}
