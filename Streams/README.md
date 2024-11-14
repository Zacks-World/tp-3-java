# Java Streams Exercises

This repository contains exercises for practicing Java Streams. These exercises are designed to improve your understanding of Stream operations in Java, covering key concepts such as filtering, mapping, reducing, and transforming data.

## Table of Contents
- [Introduction](#introduction)
- [Word List Operations](#word-list-operations)
- [Employee List Operations](#employee-list-operations)
- [Requirements](#requirements)
- [Setup](#setup)
- [Conclusion](#conclusion)

---

## Introduction

Java Streams provide a powerful and flexible way to work with collections of data. These exercises cover a range of Stream operations, offering a hands-on approach to learn how to filter, transform, and reduce data in a functional style. Through these tasks, you will gain practical experience in using Streams to process lists and arrays efficiently.

---

### Word List Operations

In this exercise, you will work with a list of words to perform the following operations:

1. **Filter Words Containing "a"**: Extract words that contain the letter "a".
2. **Filter, Reverse, and Transform**: Select words longer than 3 characters, then reverse each word.
3. **Flatten Characters of Words with "e"**: For each word containing "e", transform it into a list of characters and flatten all character lists into a single list.
4. **Convert Words to Uppercase**: Transform each word to uppercase.
5. **Convert Words to Length**: Map each word to its length, producing a list of integers.
6. **Flatten All Characters into One List**: Convert each word into a list of characters, then flatten all lists into a single list of characters.
7. **Append Index to Each Word**: Create a new list where each word is appended with its index in the format "Word - Index".

---

### Employee List Operations

In this exercise, you will work with a list of employees. Each employee has a `name` (String), a `department` (String), and a `salary` (double). Perform the following operations:

1. **Calculate Total Salary**: Use `mapToDouble` and `sum` to calculate the total salary of all employees.
2. **Sort Employees by Name**: Use `sorted` to sort employees alphabetically by name.
3. **Find Employee with Lowest Salary**: Use `min` to find the employee with the lowest salary.
4. **Filter Employees by Salary**: Use `filter` to create a list of employees with salaries greater than a specified amount.
5. **Find Employee with Highest Salary**: Use `reduce` to find the employee with the highest salary.
6. **Concatenate Employee Names**: Use `reduce` to concatenate all employee names into a single string.

---

## Requirements

- **Java Development Kit (JDK)** 8 or higher.
- **Java IDE**.
- Basic knowledge of Java and familiarity with Java Streams.

## Setup

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Compile and run each exercise separately to test your solutions.

---

## Conclusion

Completing these exercises will help you build a solid understanding of Java Streams and their capabilities. By mastering these fundamental Stream operations, you'll be able to write more efficient and readable code when working with collections in Java applications.

---


