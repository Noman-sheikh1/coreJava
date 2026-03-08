# Introduction to Java

## 1. Who Created Java?

Java was created by **James Gosling** in **1991** while he was working at **Sun Microsystems**.  
He developed Java along with his team members **Mike Sheridan** and **Patrick Naughton**.

Initially, Java was designed for **electronic consumer devices** such as televisions and set-top boxes. It was not originally intended for internet programming.

---

## 2. Original Name of Java

The original name of Java was **Oak**.

The name "Oak" was chosen because there was an **oak tree outside James Gosling’s office**. Later, it was discovered that the name Oak was already registered as a trademark by another company.

Because of this, the team decided to change the name to **Java**.

The name **Java** was inspired by **Java coffee**, which comes from the **Java island in Indonesia**.

---

## 3. Official Release of Java

Java was officially released in **1995** by **Sun Microsystems**.

One of the main reasons for its popularity was the concept:

**“Write Once, Run Anywhere (WORA)”**

This means that a Java program can run on any system that has a **Java Virtual Machine (JVM)**, without needing to modify the code.

---

## 4. Current Ownership of Java

In **2010**, **Oracle Corporation** acquired **Sun Microsystems**.

After this acquisition, **Oracle became responsible for the development and maintenance of Java**.

---

## 5. Why Java Became Popular

Java became one of the most popular programming languages because of the following features:

- **Platform Independent** – Java programs can run on different operating systems.
- **Object-Oriented** – It follows object-oriented programming concepts.
- **Secure** – Java provides strong security features.
- **Portable** – Java programs can easily run on different devices.
- **Widely Used** – Java is used for **web applications, mobile applications, and enterprise software development**.


# How Java Works (Full Workflow)

## 1. Writing Java Code

A programmer writes Java code in a file with the `.java` extension. This file is called **source code**.

Example:

```java
public class Hello {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}
````

Example file name:

```
Hello.java
```

---

## 2. Compilation Using Java Compiler (javac)

Java source code cannot run directly on a computer. It must first be compiled using the **Java compiler**.

Command:

```
javac Hello.java
```

The compiler converts the source code into **Bytecode**.

Output file:

```
Hello.class
```

The `.class` file contains **bytecode**, which is an intermediate code.

---

## 3. Bytecode

Bytecode is not machine code. It is an **intermediate code** that can run on any system using the **Java Virtual Machine (JVM)**.

Advantages of Bytecode:

* Makes Java **platform independent**
* The same program can run on **Windows, Linux, or Mac**

This is why Java follows the concept:

**Write Once, Run Anywhere (WORA)**

---

# Java Runtime Components

To run Java programs, three important components are used:

* JVM (Java Virtual Machine)
* JRE (Java Runtime Environment)
* JDK (Java Development Kit)

Relationship:

```
JDK
 └── JRE
      └── JVM
```

Meaning:

* **JDK contains JRE**
* **JRE contains JVM**

---

## JVM (Java Virtual Machine)

The **Java Virtual Machine (JVM)** is responsible for executing the bytecode. It converts bytecode into **machine code** so that the computer can execute it.

Main responsibilities of JVM:

* Executes bytecode
* Provides memory management
* Performs garbage collection
* Ensures platform independence

Different operating systems have different JVM implementations, but they all run the same bytecode.

Examples:

* Windows JVM
* Linux JVM
* Mac JVM

---

## JRE (Java Runtime Environment)

The **JRE** provides the environment required to run Java programs.

JRE contains:

* JVM
* Java libraries
* Supporting runtime files

Structure:

```
JRE
 ├── JVM
 └── Java Libraries (lib)
```

If you only want to **run Java programs**, installing JRE is enough.

---

## JDK (Java Development Kit)

The **JDK** is used for developing Java programs. It contains everything needed to **write, compile, and run** Java programs.

JDK includes:

* Java Compiler (`javac`)
* Development tools
* JRE

Structure:

```
JDK
 ├── Compiler (javac)
 ├── Development Tools
 └── JRE
      ├── JVM
      └── Libraries
```

Summary:

* **JDK → Used for development**
* **JRE → Used to run Java programs**
* **JVM → Executes bytecode**

---

# Complete Java Execution Flow

```
Programmer
   ↓
Write Java Code (.java)
   ↓
Java Compiler (javac)
   ↓
Bytecode (.class)
   ↓
JVM (Java Virtual Machine)
   ↓
Machine Code
   ↓
Operating System
   ↓
Hardware
   ↓
Program Output
```




## -> JVM, JRE, and JDK – Simple Explanation

To understand how Java runs a program, we must understand **JVM, JRE, and JDK**.

Their relationship is:

JDK  
 └── JRE  
      └── JVM  

This means:

- **JDK contains JRE**
- **JRE contains JVM**

So when you install **JDK**, you automatically get **JRE and JVM**.

---

# 1. JVM (Java Virtual Machine)

## What is JVM?

The **Java Virtual Machine (JVM)** is the engine that runs Java programs.

When you write Java code and compile it, the compiler creates **bytecode (.class file)**.  
The **JVM reads this bytecode and converts it into machine code** that the computer can understand.

Because different operating systems have their own JVM, the **same Java program can run on different systems** like:

- Windows
- Linux
- macOS

This is why Java is called **platform independent**.

---

## Main Responsibilities of JVM

### 1. Class Loading
The JVM loads the compiled `.class` files into memory before execution.

### 2. Bytecode Verification
JVM checks the bytecode to make sure it is **safe and valid** before running it.

### 3. Execution Engine
The execution engine runs the bytecode using:

- **Interpreter** – executes code line by line
- **JIT Compiler (Just-In-Time Compiler)** – converts frequently used code into faster machine code

### 4. Memory Management
JVM manages memory automatically using different memory areas like:

- Heap
- Stack
- Method Area

### 5. Garbage Collection
JVM automatically removes unused objects from memory.  
This process is called **Garbage Collection**.

---

# 2. JRE (Java Runtime Environment)

## What is JRE?

The **Java Runtime Environment (JRE)** provides everything needed to **run Java programs**.

JRE includes:

- JVM
- Java libraries
- Supporting runtime files

Structure:

JRE  
 ├── JVM  
 └── Java Libraries  

If someone only wants to **run a Java program**, installing **JRE is enough**.

However, **JRE cannot compile Java programs**.

---

## Java Libraries

Java libraries contain ready-made classes that developers can use.

Examples:

- **java.lang** → basic language classes  
- **java.util** → utility classes like ArrayList, HashMap  
- **java.io** → input and output operations  
- **java.net** → networking

These libraries help developers avoid writing everything from scratch.

---

# 3. JDK (Java Development Kit)

## What is JDK?

The **Java Development Kit (JDK)** is used by developers to **create Java programs**.

It contains everything needed to:

- Write Java programs
- Compile Java programs
- Run Java programs
- Debug Java programs

Structure:

JDK  
 ├── Java Compiler (javac)  
 ├── Development Tools  
 └── JRE  
      ├── JVM  
      └── Libraries  

---

## Important Tools in JDK

### javac
The **Java compiler** that converts `.java` files into `.class` bytecode files.

Example:

```

javac Hello.java

```

### java
Used to **run the compiled Java program**.

Example:

```

java Hello

```

### javadoc
Generates documentation from Java source code.

### jar
Packages multiple Java files into a single archive file.

### jdb
A debugging tool used to find and fix errors in Java programs.

---

# Difference Between JVM, JRE, and JDK

| Component | Purpose |
|------|------|
| JVM | Executes Java bytecode |
| JRE | Provides the environment to run Java programs |
| JDK | Provides tools to develop Java programs |

Simple rule:

JDK → JRE → JVM

---

# Common Interview Questions

### 1. What is the difference between JVM, JRE, and JDK?

- **JVM** executes the Java bytecode.
- **JRE** provides the environment needed to run Java programs.
- **JDK** provides tools for developing Java programs.

---

### 2. Why is Java platform independent?

Java is platform independent because Java code is compiled into **bytecode**, and this bytecode can run on any system that has a **JVM**.

---

### 3. What is Bytecode?

Bytecode is the **intermediate code generated by the Java compiler**.  
It is stored in `.class` files and executed by the JVM.

---

### 4. What is JIT Compiler?

The **Just-In-Time (JIT) Compiler** improves performance by converting frequently used bytecode into **native machine code**.

---

### 5. What is Garbage Collection?

Garbage Collection is the process where the **JVM automatically removes unused objects from memory** to free space.

---

### 6. Can Java run without JVM?

No. Java programs cannot run without JVM because JVM is responsible for executing the bytecode.

---


# First Java Program – Hello World Explained

The first program most people write when learning Java is the **Hello World program**.  
This program simply prints a message on the screen.

Example:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
````

Now let's understand **every part of this program step by step**.

---

# 1. `public class Hello`

```
public class Hello
```

This line defines a **class**.

### What is a Class?

A **class** is like a blueprint or template used to create objects in Java.
Every Java program must be written inside a **class**.

### Breaking it down

#### `public`

`public` is an **access modifier**.

It means the class can be **accessed from anywhere**.

In simple words:

* `public` makes the class **visible to the JVM and other classes**.

#### `class`

`class` is a **keyword used to create a class in Java**.

It tells the compiler that we are **defining a class**.

#### `Hello`

`Hello` is the **name of the class**.

Important rule in Java:

If the class is declared **public**, the **file name must be the same as the class name**.

So the file must be named:

```
Hello.java
```

If the file name does not match the class name, the program will not compile.

---

# 2. `public static void main(String[] args)`

```
public static void main(String[] args)
```

This is the **main method**.

The **main method is the starting point of every Java program**.
When the program runs, the **JVM starts execution from this method**.

Let's break this line into parts.

---

## `public`

`public` means the method is **accessible from anywhere**.

The JVM must be able to **access this method to start the program**.

That is why the `main` method must always be **public**.

---

## `static`

`static` means the method **belongs to the class, not to an object**.

Because of this, the JVM can call the method **without creating an object of the class**.

If `static` was not used, the JVM would first need to create an object before running the program.

---

## `void`

`void` is the **return type**.

It means the method **does not return any value**.

The `main` method simply **runs the program**, so it does not return anything.

---

## `main`

`main` is the **name of the method**.

This is a **special method** because the JVM looks for this method to start program execution.

If the method name is not `main`, the program will not run.

---

## `String[] args`

```
String[] args
```

This means **an array of strings**.

It allows the program to receive **command line arguments** when the program starts.

Example:

```
java Hello John
```

Here:

```
John
```

will be stored inside `args`.

So:

* `String[]` → an array of strings
* `args` → variable name

---

# 3. Curly Braces `{ }`

```
{
}
```

Curly braces define a **block of code**.

They tell the compiler **where the class or method starts and ends**.

Example:

```
class Hello {
    // code inside class
}
```

---

# 4. `System.out.println("Hello World");`

```
System.out.println("Hello World");
```

This line prints text on the screen.

Let's break it down.

---

## `System`

`System` is a **built-in Java class** from the `java.lang` package.

It provides access to system resources like:

* input
* output
* memory

---

## `out`

`out` is an **object of PrintStream** inside the System class.

It represents the **standard output stream**, which usually means the **console (screen)**.

---

## `println`

`println` is a **method used to print text on the screen**.

`println` means:

**print + new line**

After printing the text, the cursor moves to the **next line**.

Example output:

```
Hello World
```

---

# Difference Between `print()` and `println()`

## `print()`

`print()` prints text but **does not move to the next line**.

Example:

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```
HelloWorld
```

---

## `println()`

`println()` prints text and **moves the cursor to the next line**.

Example:

```java
System.out.println("Hello");
System.out.println("World");
```

Output:

```
Hello
World
```

---

# 5. Semicolon `;`

In Java, every statement must end with a **semicolon**.

Example:

```
System.out.println("Hello World");
```

The semicolon tells the compiler **the statement has ended**.

---

# Program Execution Flow

1. The programmer writes the code in a `.java` file.
2. The Java compiler (`javac`) compiles the code.
3. A `.class` bytecode file is created.
4. The JVM runs the bytecode.
5. The program output is displayed.

---

# Final Output

When we run the program, the output will be:

```
Hello World
```

---




# **Java Data Types** 

Java is a **statically typed language**.  
This means every variable must have a **data type**, and the compiler checks it **before the program runs**.

Example of invalid assignment:

```java
int x = "Hello"; // Compile-time error
````

Here `x` is an **integer**, but `"Hello"` is a **string**, so Java does not allow it.

---

# What is a Data Type?

A **data type** tells Java:

* what type of value a variable can store
* how much memory is needed to store it

Example:

```java
int age = 21;
```

Here:

* `int` → data type
* `age` → variable name
* `21` → value

---

# Types of Data Types in Java

Java has **two categories of data types**:

1. **Primitive Data Types**
2. **Non-Primitive (Reference) Data Types**

---

# 1. Primitive Data Types

Primitive data types store **simple values directly in memory**.

Java has **8 primitive data types**.

| Data Type | Size          | Example |
| --------- | ------------- | ------- |
| boolean   | JVM dependent | true    |
| byte      | 1 byte        | 10      |
| short     | 2 bytes       | 2000    |
| int       | 4 bytes       | 100     |
| long      | 8 bytes       | 100000L |
| float     | 4 bytes       | 3.14f   |
| double    | 8 bytes       | 3.14159 |
| char      | 2 bytes       | 'A'     |

---

# 1. boolean

Used to store **true or false values**.

Important rule:

Java **does not allow 0 and 1** like C/C++.

Example:

```java
public class BooleanExample {
    public static void main(String[] args) {

        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }
}
```

---

# 2. byte

`byte` is used to store **very small numbers**.

Size:

```
1 byte (8 bits)
```

Range:

```
-128 to 127
```

Example:

```java
public class ByteExample {
    public static void main(String[] args) {

        byte age = 25;

        System.out.println(age);
    }
}
```

---

# 3. short

Used for **slightly larger numbers than byte**.

Size:

```
2 bytes
```

Example:

```java
public class ShortExample {
    public static void main(String[] args) {

        short students = 1000;

        System.out.println(students);
    }
}
```

---

# 4. int

`int` is the **most commonly used integer data type in Java**.

Size:

```
4 bytes
```

Example:

```java
public class IntExample {
    public static void main(String[] args) {

        int population = 2000000;

        System.out.println(population);
    }
}
```

Most whole numbers in Java programs use **int**.

---

# 5. long

Used when numbers are **too large for int**.

Size:

```
8 bytes
```

Important rule:

A long value usually ends with **L**.

Example:

```java
public class LongExample {
    public static void main(String[] args) {

        long worldPopulation = 7800000000L;

        System.out.println(worldPopulation);
    }
}
```

---

# 6. float

Used to store **decimal numbers**.

Size:

```
4 bytes
```

Important rule:

In Java, decimal numbers are **double by default**, so we must add **f** for float.

Example:

```java
public class FloatExample {
    public static void main(String[] args) {

        float pi = 3.14f;

        System.out.println(pi);
    }
}
```

---

# 7. double

Used for **large decimal numbers with higher precision**.

Size:

```
8 bytes
```

Important fact:

Decimal numbers in Java are **double by default**.

Example:

```java
public class DoubleExample {
    public static void main(String[] args) {

        double pi = 3.14159;

        System.out.println(pi);
    }
}
```

---

# 8. char

Used to store **a single character**.

Size in Java:

```
2 bytes
```

Important difference:

| Language | char size |
| -------- | --------- |
| C/C++    | 1 byte    |
| Java     | 2 bytes   |

Java uses **Unicode**, so characters take more memory.

Example:

```java
public class CharExample {
    public static void main(String[] args) {

        char grade = 'A';

        System.out.println(grade);
    }
}
```

Characters must use **single quotes `' '`**.

---

# 2. Non-Primitive (Reference) Data Types

Non-primitive data types **store references (memory addresses)** instead of actual values.

Examples:

* String
* Class
* Object
* Interface
* Array

---

# String

A **String** stores a sequence of characters.

Example:

```java
public class StringExample {
    public static void main(String[] args) {

        String name = "John";

        System.out.println(name);
    }
}
```

Important fact:

Strings in Java are **immutable**, meaning they **cannot be changed after creation**.

---

# Array

An **array** stores multiple values of the same type.

Example:

```java
public class ArrayExample {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(numbers[0]);
    }
}
```

Arrays start from **index 0**.

---

# Class and Object

A **class** is a blueprint, and an **object** is an instance of that class.

Example:

```java
class Car {

    String model;
    int year;

    void display() {
        System.out.println(model + " " + year);
    }
}

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.model = "Toyota";
        myCar.year = 2020;

        myCar.display();
    }
}
```

---

# Quick Summary

Primitive Data Types:

* boolean
* byte
* short
* int
* long
* float
* double
* char

Non-Primitive Data Types:

* String
* Class
* Object
* Interface
* Array

Important things to remember:

* `char` in Java = **2 bytes**
* `boolean` = **true or false only**
* decimal numbers are **double by default**
* `float` requires **f**
* `long` often requires **L**





