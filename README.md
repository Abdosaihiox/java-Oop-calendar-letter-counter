# 📅 Java OOP Project – Calendar & Letter Counter

A Java-based object-oriented programming (OOP) assignment that features two core functionalities:
1. A dynamic calendar generator based on user input (year and month)
2. A random uppercase letter generator with frequency counter

---

## 📌 Project Overview

This project demonstrates the practical application of Java's OOP principles, standard libraries, and control structures to solve real-world problems. It consists of **two main parts**:

---

## 🧩 Part 1: Calendar Generator

### 🔧 Description:
- Prompts the user to input a **year** and **month**
- Displays a well-formatted calendar with correct alignment and weekday tracking
- Accounts for **leap years** and varying days per month using `java.util.Calendar`

### 📦 Key Classes and Methods:
- `printCalendar()`: Displays the formatted calendar
- `getMonthName()`: Returns the month name based on numeric input
- `Calendar` class: Used to handle date/time calculations accurately

---

## 🔡 Part 2: Random Uppercase Letter Counter

### 🔧 Description:
- Generates an array of 100 **random uppercase letters** using a helper class
- Displays the letters in a grid format (20 characters per line)
- Counts and displays the frequency of each letter (A–Z)

### 📦 Key Classes and Methods:
- `RandomCharacter`: Handles character generation
- `CountLettersInArray`: Populates array and counts frequencies
- Displays letter counts in a structured format (10 per line)

---

## 🛠️ Tools & Technologies

| Component     | Technology        |
|---------------|-------------------|
| Language      | Java              |
| Libraries     | `java.util.Calendar`, `java.util.Scanner` |
| IDE           | Any (NetBeans, IntelliJ, Eclipse) |
| Execution     | CLI / Terminal    |

---

## 📂 Folder Structure

```bash
OOP_Project/
├── CalendarApp.java
├── RandomCharacter.java
├── CountLettersInArray.java
├── README.md
