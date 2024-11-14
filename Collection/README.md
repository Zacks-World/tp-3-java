# Java Collections Exercises

This repository contains exercises for practicing Java Collections, including Lists, Maps, and Sets. These exercises are designed to help you understand the fundamentals of handling data structures in Java, improving both your theoretical knowledge and practical skills.

## Table of Contents
- [Introduction](#introduction)
- [Lists](#lists)
- [Maps](#maps)
- [Sets](#sets)
- [Requirements](#requirements)
- [Setup](#setup)
- [Conclusion](#conclusion)

---

## Introduction

Java Collections provide a powerful framework for managing groups of objects. This repository offers a set of exercises to guide you through different types of collections in Java, such as Lists, Maps, and Sets. By completing these exercises, you will gain hands-on experience in managing, organizing, and processing data using these fundamental data structures.

The exercises cover essential operations like adding, removing, searching, and modifying data within collections, while also introducing more advanced topics like data filtering, sorting, and performing union and intersection operations. These skills are critical for efficient data handling in Java applications.

### Lists

This exercise involves managing a list of products. You will:

1. **Create a Product Class**: Define a class `Product` with the attributes:
   - `id` (long): the unique identifier for the product.
   - `name` (String): the product name.
   - `price` (double): the product price.

2. **Product Management App**: Create a main class `GestionProduitsApp` to manage products with an `ArrayList`.
   - **Add Products**: Initialize several `Product` objects and add them to the `ArrayList`.
   - **Delete a Product by Index**: Remove a product from the list using its index.
   - **Display the List of Products**: Use `forEach` with a lambda expression to print the details of each product in the list.
   - **Modify a Product by Index**: Replace a product at a specified index with a new `Product` object.
   - **Search for a Product by Name**: Prompt the user to input a product name, then search through the list to find and display products matching the name.

### Maps

In this exercise, you will manage a map of student grades using a `HashMap`. Here’s a breakdown of each task:

1. **Create and Initialize the HashMap**: Create a `HashMap<String, Integer>` named `Notes`, where:
   - Key (`String`): the student’s name.
   - Value (`Integer`): the student’s grade.

2. **Perform Operations on the Map**:
   - **Insert Grades**: Add several student names and grades to the map.
   - **Update a Grade**: Use the `replace` method to change a specific student's grade.
   - **Remove a Grade**: Remove a student from the map by their name.
   - **Display the Size of the Map**: Print the number of entries in the map using `size()`.

3. **Calculate Statistics**:
   - **Sum of Grades**: Use a loop to calculate the total of all grades in the map, and divide by the map size to find the average grade.
   - **Maximum and Minimum Grades**: Traverse through the map to find the highest and lowest grades.
   - **Check for a Specific Grade**: Verify if a grade of 20 exists in the map and print a message based on the result.

4. **Display the Updated Map**: After each operation, print the map to show the changes.

### Sets

This exercise involves working with sets of student names to find intersections and unions.

1. **Create Two Sets**: Define two `HashSet<String>` objects, `groupeA` and `groupeB`, to represent two groups of students.
   - Add some student names to each group. For instance, add students such as `"Ahmed"`, `"Lhachmi"`, and `"Mehaydi"` to `groupeA`, and students like `"Ahmed"`, `"Mustafa"`, and `"Zouhair"` to `groupeB`.

2. **Set Operations**:
   - **Intersection of Sets**: Use the `retainAll` method on one of the sets (e.g., `groupeB.retainAll(groupeA)`) to display the common elements between the two sets, which represents students who belong to both groups.
   - **Union of Sets**: Use the `addAll` method (e.g., `groupeA.addAll(groupeB)`) to combine both sets into one, containing all unique students from both groups.

3. **Display Results**: Print each set before and after performing the intersection and union operations to observe the changes.

---

## Requirements

- **Java Development Kit (JDK)** 8 or higher
- **Java IDE**
- Basic knowledge of Java, especially object-oriented programming

## Setup

1. Clone this repository.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run each exercise separately to test your solutions.

---

## Conclusion

By completing these exercises, you will build a solid foundation in Java Collections, learning how to effectively manage data using Lists, Maps, and Sets. These data structures are essential for storing and organizing information efficiently in Java applications. Each exercise reinforces key concepts and methods, preparing you for more advanced data manipulation tasks in real-world programming.



---

