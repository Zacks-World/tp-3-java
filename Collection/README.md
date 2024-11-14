# Java Collections Exercises

This repository contains exercises for practicing Java Collections, including Lists, Maps, and Sets. These exercises are designed to help you understand the fundamentals of handling data structures in Java.

## Table of Contents
- [Lists](#exercise-1-lists)
- [Maps](#exercise-2-maps)
- [Sets](#exercise-3-sets)
- [Requirements](#requirements)
- [Setup](#setup)

---

### Lists

This exercise involves managing a list of products. You will:

1. **Create a Product Class**: Define a class `Product` with the attributes:
   - `id` (long): the unique identifier for the product.
   - `name` (String): the product name.
   - `price` (double): the product price.
2. **Product Management App**: Create a main class `GestionProduitsApp` to manage products with an `ArrayList`.
   - Add products to the list.
   - Delete a product by index.
   - Display the list of products.
   - Modify a product by index.
   - Search for a product by name entered by the user.

### Maps

In this exercise, you will manage a map of student grades.

1. **Create a HashMap**: Use a `HashMap<String, Double>` where:
   - Key (`String`): student name.
   - Value (`Double`): student grade.
2. **Operations on the Map**:
   - Insert student grades.
   - Increase a student's grade.
   - Remove a student's grade.
   - Display the size of the map.
   - Calculate and display the average, maximum, and minimum grade.
   - Check if there’s a grade equal to 20.
   - After each operation, display the updated list using a `forEach` loop with lambda expressions.

### Sets

This exercise involves working with sets of student names.

1. **Create Two Sets**: Define two `HashSet<String>` objects, `groupeA` and `groupeB`, to represent two student groups.
2. **Set Operations**:
   - Add student names to each group.
   - Display the intersection of the two sets (common students).
   - Display the union of the two sets (all unique students from both groups).

---

## Requirements

- **Java Development Kit (JDK)** 8 or higher
- Basic knowledge of Java, especially object-oriented programming

## Setup

1. Clone this repository.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run each exercise separately to test your solutions.

---

These exercises are intended to improve your understanding of Java Collections and strengthen your skills in managing data structures. Happy coding!

---
