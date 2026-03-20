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

## 🔹 Why Java Is NOT Just Compiler or Just Interpreter

Java follows a **hybrid execution model**.

### 📌 Step-by-step Java execution flow

### 1️⃣ Compilation (Compile Time)

When you write Java code:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```

You compile it using:

```bash
javac Hello.java
```

➡️ The **Java Compiler (`javac`)** converts:

* `.java` (human-readable source code)
* into `.class` (**bytecode**)

📄 **Bytecode** is:

* NOT machine code
* NOT directly readable by CPU
* Platform-independent

✅ This is why Java is called **compiled**

---

### 2️⃣ Interpretation + JIT (Run Time)

When you run:

```bash
java Hello
```

➡️ The **JVM (Java Virtual Machine)** does the following:

#### 🔹 a) Interpreter

* Reads bytecode **line by line**
* Converts it into machine code
* Executes it

#### 🔹 b) JIT Compiler (Just-In-Time)

* Frequently used code is **compiled into native machine code**
* Stored in memory
* Runs **much faster** next time

✅ This is why Java is also **interpreted**

---

## 🔁 Visual Flow (Easy to Remember)

```
.java  ──(javac)──▶  .class (Bytecode)
                      │
                      ▼
                 JVM (Interpreter + JIT)
                      │
                      ▼
                Machine Code → Output
```

---

## 🧠 Final Classification

| Language | Type                                |
| -------- | ----------------------------------- |
| C / C++  | Compiled                            |
| Python   | Interpreted                         |
| Java     | **Compiled + Interpreted (Hybrid)** |

---

## ⭐ Why Java Uses This Model?

-  Platform independent (**Write Once, Run Anywhere**)
-  Better performance than pure interpreters
-  Safer than direct native compilation
-  JVM optimizations (JIT, Garbage Collection)

---

## 📝 Interview-Ready Answer

> **Java is a hybrid language.**
> It is **compiled** into bytecode by the Java compiler and **interpreted/executed** by the JVM using an interpreter and JIT compiler.



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

-----


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




---

# Literals in Java

In Java, a **Literal** is a **fixed value written directly in the program**.

It is the **actual value assigned to a variable**.

Example:

```java
int age = 25;
```

Here:

| Part | Meaning |
|-----|--------|
| `int` | Data type |
| `age` | Variable name |
| `25` | **Literal (actual value)** |

👉 So **25 is a literal** because it is the value written directly in the code.

---

# What Does Literal Mean?

The word **literal** means:

> **A value written exactly as it is in the program.**

Example:

```java
int x = 10;
```

Here:

- `x` → variable  
- `10` → literal  

Because **10 is written directly in the code**.

---

# Examples of Literals

```
10
20
3.14
'A'
"Hello"
true
false
```

All of these are **literals** because they represent **fixed values**.

---

# Types of Literals in Java

Java mainly has **5 types of literals**.

| Literal Type | Example |
|--------------|--------|
| Integer Literal | `10` |
| Floating Literal | `10.5` |
| Char Literal | `'A'` |
| String Literal | `"Hello"` |
| Boolean Literal | `true` |

---

# 1. Integer Literals

Integer literals are **whole numbers without decimal points**.

Example:

```java
int x = 10;
```

Here **10** is an integer literal.

### Integer literals can be written in different number systems:

| Type | Example | Explanation |
|-----|--------|-------------|
| Decimal | `10` | Normal numbers (0-9) |
| Octal | `010` | Starts with `0` |
| Hexadecimal | `0x10` | Starts with `0x` |
| Binary | `0b10` | Starts with `0b` |

Example:

```java
public class IntegerLiteralExample {

    public static void main(String[] args) {

        int a = 10;     // decimal
        int b = 010;    // octal
        int c = 0x10;   // hexadecimal
        int d = 0b10;   // binary

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
```

---

# 2. Floating Point Literals

Floating literals are **numbers with decimal points**.

Example:

```java
double price = 99.5;
```

Here **99.5** is a floating literal.

### Important Rule

By default, decimal numbers in Java are **double**.

If you want to store them in **float**, you must add `f`.

Example:

```java
float number = 10.5f;
```

---

# 3. Char Literals

Char literals represent **a single character**.

They must be written inside **single quotes `' '`**.

Example:

```java
char grade = 'A';
```

Here `'A'` is a **char literal**.

### Char can also use Unicode

Example:

```java
char letter = '\u0041';
```

Output:

```
A
```

---

# 4. String Literals

A **string literal** is a sequence of characters inside **double quotes `" "`**.

Example:

```java
String name = "Rahul";
```

Here `"Rahul"` is a **string literal**.

### Important Rule

Strings must always use **double quotes**.

Incorrect:

```java
String name = Rahul; // Error
```

Correct:

```java
String name = "Rahul";
```

---

# 5. Boolean Literals

Boolean literals represent **true or false values**.

Only two values exist:

```
true
false
```

Example:

```java
boolean isJavaFun = true;
boolean isStudent = false;
```

Important:

Java **does not allow 0 or 1 for boolean values**.

Incorrect:

```java
boolean x = 1; // Compilation Error
```

---

# Complete Example Program

```java
public class LiteralExample {

    public static void main(String[] args) {

        int age = 21;              // integer literal
        double price = 99.5;       // floating literal
        char grade = 'A';          // char literal
        String name = "Rahul";     // string literal
        boolean isJavaFun = true;  // boolean literal

        System.out.println(age);
        System.out.println(price);
        System.out.println(grade);
        System.out.println(name);
        System.out.println(isJavaFun);
    }
}
```

---

# Quick Summary

| Literal | Example |
|-------|--------|
| Integer | `10` |
| Floating | `3.14` |
| Char | `'A'` |
| String | `"Hello"` |
| Boolean | `true` |

---

# Key Points to Remember

- A **literal is the value written directly in the program**.
- Integer literals represent **whole numbers**.
- Floating literals represent **decimal numbers**.
- Char literals use **single quotes `' '`**.
- String literals use **double quotes `" "`**.
- Boolean literals can only be **true or false**.

---

# One Line Definition (Interview Friendly)

**A literal in Java is a fixed value written directly in the program and assigned to a variable.**

Example:

```java
int x = 10;
```

Here **10 is a literal**.


---




# Type Conversion & Type Casting in Java

When working with Java, you often need to **convert one data type into another**.  
This process is called **Type Conversion** or **Type Casting**.

---

## First, Understand This Line 👇

```java
int x = 10;
double y = x;
```

Here, Java converts `int` to `double`.

👉 This is called **Type Conversion**.

---

## Why Do We Need Type Conversion?

Because different data types store **different sizes and types of values**.

Example:
- `int` → whole numbers
- `double` → decimal numbers

Sometimes we need to:
- store small data into bigger data
- or forcefully convert bigger data into smaller data

---

## Types of Type Conversion in Java

Java supports **two types**:

| Type | Name |
|----|----|
| Automatic | Type Conversion (Widening) |
| Manual | Type Casting (Narrowing) |

---

# 1️⃣ Type Conversion (Widening / Implicit)

### What is Type Conversion?

👉 **Automatically converting a smaller data type into a larger data type**  
👉 Done by **Java itself**  
👉 **No data loss**

---

### Widening Order (Important)

```
byte → short → int → long → float → double
```

---

### Example 1

```java
int a = 10;
double b = a;
```

Explanation:
- `int` → smaller
- `double` → larger
- Java converts automatically

✅ Safe  
✅ No data loss

---

### Example 2

```java
public class TypeConversionExample {
    public static void main(String[] args) {
        int x = 20;
        double y = x;

        System.out.println(x);
        System.out.println(y);
    }
}
```

Output:
```
20
20.0
```

---

### Example 3

```java
byte b = 10;
int i = b;
```

✔ Allowed  
✔ Automatic  
✔ No casting needed

---

### Key Points of Type Conversion

- Happens **automatically**
- Converts **small → large**
- **Safe**
- No data loss
- Also called **Implicit Conversion**

---

# 2️⃣ Type Casting (Narrowing / Explicit)

### What is Type Casting?

👉 **Manually converting a larger data type into a smaller data type**  
👉 Done by **programmer**  
👉 **Data loss may occur**

---

### Narrowing Order

```
double → float → long → int → short → byte
```

---

### Example 1

```java
double x = 10.5;
int y = (int) x;
```

Explanation:
- `double` → larger
- `int` → smaller
- `(int)` is required

Output:
```
10
```

❗ Decimal part is lost

---

### Example 2

```java
public class TypeCastingExample {
    public static void main(String[] args) {
        double price = 99.99;
        int value = (int) price;

        System.out.println(price);
        System.out.println(value);
    }
}
```

Output:
```
99.99
99
```

---

### Example 3 (Data Loss)

```java
int a = 130;
byte b = (byte) a;
```

Output:
```
-126
```

⚠ Because byte range is **-128 to 127**

---

### Key Points of Type Casting

- Done **manually**
- Converts **large → small**
- **Risky**
- Data loss possible
- Also called **Explicit Casting**

---

# Difference Between Type Conversion & Type Casting

| Feature | Type Conversion | Type Casting |
|------|----------------|-------------|
| Done by | Java | Programmer |
| Direction | Small → Large | Large → Small |
| Safety | Safe | Risky |
| Data Loss | No | Yes |
| Syntax | Automatic | `(type)` required |

---

# Very Important Interview Trick ⭐

### This works ✅

```java
int a = 10;
double b = a;
```

### This does NOT ❌

```java
double a = 10.5;
int b = a;   // Error
```

### Correct Way ✔

```java
double a = 10.5;
int b = (int) a;
```

---

# Type Casting with char

```java
char ch = 'A';
int ascii = ch;
```

Output:
```
65
```

Reverse:

```java
int num = 66;
char ch = (char) num;
```

Output:
```
B
```

---

# Complete Example Program

```java
public class TypeConversionCasting {

    public static void main(String[] args) {

        // Type Conversion
        int a = 10;
        double b = a;

        // Type Casting
        double x = 20.75;
        int y = (int) x;

        System.out.println(b);
        System.out.println(y);
    }
}
```

---

# Common Beginner Mistakes ❌

❌ Forgetting casting:
```java
double d = 5.5;
int i = d; // Error
```

✔ Correct:
```java
int i = (int) d;
```

---

# Simple Way to Remember 🧠

| Rule |
|----|
| Small → Big = Automatic |
| Big → Small = Manual |

---

# One Line Definitions (Exam / Interview)

**Type Conversion:**  
Automatic conversion of smaller data type into larger data type.

**Type Casting:**  
Manual conversion of larger data type into smaller data type.

---

# Final Summary

- Type Conversion = automatic, safe, widening
- Type Casting = manual, risky, narrowing
- Casting uses `(datatype)`
- Data loss happens only in type casting.



##  Types of Operator in java

![Types of operator in java](img/java_operators.webp)

# Java Operators (Complete Beginner Guide)

Java operators are **special symbols** that perform operations on variables or values.  
They help us **calculate, compare, assign, and manipulate data** in Java programs.

---

## Types of Operators in Java

Java provides **8 main types of operators**:

1. Arithmetic Operators
2. Unary Operators
3. Assignment Operators
4. Relational Operators
5. Logical Operators
6. Ternary Operator
7. Bitwise Operators
8. `instanceof` Operator

---

## 1️⃣ Arithmetic Operators

Arithmetic operators are used to perform **basic mathematical operations**.

| Operator | Meaning |
|--------|--------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (remainder) |

### Example

```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
```

### Output
```
Sum: 13
Difference: 7
Multiplication: 30
Division: 3
Modulus: 1
```

📌 **Note:** Division between integers gives an integer result.

---

## 2️⃣ Unary Operators

Unary operators work on **only one operand**.

| Operator | Meaning |
|--------|--------|
| `++` | Increment |
| `--` | Decrement |
| `!` | Logical NOT |

### Example

```java
class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("Post-increment: " + (a++));
        System.out.println("Pre-increment: " + (++a));

        System.out.println("Post-decrement: " + (b--));
        System.out.println("Pre-decrement: " + (--b));
    }
}
```

### Output
```
Post-increment: 10
Pre-increment: 12
Post-decrement: 10
Pre-decrement: 8
```

📌 **Tip:**
- `a++` → use first, then increase
- `++a` → increase first, then use

---

## 3️⃣ Assignment Operators

Assignment operators assign values to variables.

| Operator | Meaning |
|--------|--------|
| `=` | Assign |
| `+=` | Add and assign |
| `-=` | Subtract and assign |
| `*=` | Multiply and assign |
| `/=` | Divide and assign |
| `%=` | Modulus and assign |

### Example

```java
public class AssignmentOperators {
    public static void main(String[] args) {
        int n = 10;

        n += 5;
        System.out.println(n);

        n *= 2;
        System.out.println(n);

        n -= 5;
        System.out.println(n);

        n /= 2;
        System.out.println(n);

        n %= 3;
        System.out.println(n);
    }
}
```

---

## 4️⃣ Relational Operators

Relational operators **compare two values** and return a **boolean result**.

| Operator | Meaning |
|--------|--------|
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal |
| `<=` | Less than or equal |
| `==` | Equal |
| `!=` | Not equal |

### Example

```java
class RelationalOperators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}
```

---

## 5️⃣ Logical Operators

Logical operators are used with **boolean values**.

| Operator | Meaning |
|--------|--------|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

### Example

```java
class LogicalOperators {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
    }
}
```

📌 **Short-circuiting:**  
Java skips the second condition if the result is already known.

---

## 6️⃣ Ternary Operator

The ternary operator is a **short form of if-else**.

### Syntax
```
condition ? value1 : value2
```

### Example

```java
class TernaryOperator {
    public static void main(String[] args) {
        int a = 20, b = 10;
        int max = (a > b) ? a : b;

        System.out.println(max);
    }
}
```

---

## 7️⃣ Bitwise Operators

Bitwise operators work at the **bit level**.

| Operator | Meaning |
|--------|--------|
| `&` | AND |
| `|` | OR |
| `^` | XOR |
| `~` | NOT |
| `<<` | Left shift |
| `>>` | Signed right shift |
| `>>>` | Unsigned right shift |

### Example

```java
class BitwiseOperators {
    public static void main(String[] args) {
        int d = 0b1010;
        int e = 0b1100;

        System.out.println(d & e);
        System.out.println(d | e);
        System.out.println(d ^ e);
        System.out.println(~d);
        System.out.println(d << 2);
        System.out.println(e >> 1);
        System.out.println(e >>> 1);
    }
}
```

## **Important:**

1️⃣ **What `>>` and `>>>` do**
---

## Difference Between `>>` and `>>>` 

### `>>` (Signed Right Shift)

* Shifts bits to the right
* **Keeps the sign**
* Fills left bits with:

    * `0` for positive numbers
    * `1` for negative numbers

### `>>>` (Unsigned Right Shift)

* Shifts bits to the right
* **Ignores the sign**
* Always fills left bits with `0`

---

## Example That Produces `-4`

```java
int x = -8;
System.out.println(x >> 1);
```

---

## How `-4` Comes (Step by Step)

### Step 1: Binary of `-8` (8-bit simplified)

```
-8 = 11111000
```

(First bit is `1` → number is negative)

---

### Step 2: Apply `>> 1`

Right shift by 1 bit
Copy the sign bit (`1`) on the left

```
Before: 11111000
After : 11111100
```

---

### Step 3: Convert `11111100` to decimal

Since first bit is `1`, Java treats it as **negative**
So we use **Two’s Complement** to find its value

#### Two’s Complement Steps:

1. Invert bits

```
00000011
```

2. Add 1

```
00000100
```

3. Decimal value

```
4
```

4. Add minus sign

```
-4
```

---

## Final Result

```
11111100  =  -4
```

---

## Why `>>>` Does NOT Give `-4`

```java
System.out.println(x >>> 1);
```

### What happens:

```
Before: 11111000
After : 01111100
```

* Left filled with `0`
* Sign ignored
* Number becomes **positive**

So result is a **large positive number**, not `-4`.

---


## 8️⃣ `instanceof` Operator in Java

The **`instanceof` operator** is used to **check the type of an object at runtime**.



👉 `instanceof` checks **whether an object belongs to a specific class, subclass, or interface**.

It answers this simple question:

> ❓ **“Is this object created from this class (or related to it)?”**

### Output of `instanceof`

The result is always:

* `true`
* `false`

---

## 🔹 Syntax

```java
object instanceof ClassName
```

Read it as:

👉 **“Is object a ClassName?”**

---

## 🔹 Example Program (Line-by-Line Explanation)

```java
class InstanceOfExample {
    public static void main(String[] args) {

        String str = "Hello";
        System.out.println(str instanceof String);

        Object obj = new Integer(10);
        System.out.println(obj instanceof Integer);
        System.out.println(obj instanceof String);
    }
}
```

---

## 🔸 Line 1: `String str = "Hello";`

* `"Hello"` is a **String literal**
* `str` is a reference pointing to a **String object**

### Check:

```java
str instanceof String
```

👉 Java internally asks:
**“Is `str` an object of class `String`?”**

✔ Yes → `true`

### Output:

```text
true
```

---

## 🔸 Line 2: `Object obj = new Integer(10);`

📌 **Very important concept**

* `new Integer(10)` creates an **Integer object**
* Reference type is `Object`
* **Actual object is still Integer**

💡 Think like this:

> A child can be referred to as a parent, but the child is still a child.

---

### ✅ Check 1

```java
obj instanceof Integer
```

👉 Java asks:
**“Is `obj` pointing to an Integer object?”**

✔ Yes → `true`

Output:

```text
true
```

---

### ❌ Check 2

```java
obj instanceof String
```

👉 Java asks:
**“Is this object a String?”**

❌ No → object is `Integer`, not `String`

Output:

```text
false
```

---

## 🔹 Final Output of the Program

```text
true
true
false
```

---

## 🔹 VERY IMPORTANT RULES of `instanceof`

### 1️⃣ Checks the **actual object**, not the reference type

```java
Object obj = new Integer(10);
```

Even though reference type is `Object`,
the real object is `Integer`.

```java
obj instanceof Integer   // true
```

---

### 2️⃣ Works with **Inheritance**

```java
class Animal {}
class Dog extends Animal {}

Animal a = new Dog();

a instanceof Dog     // true
a instanceof Animal  // true
```

👉 Because **Dog is an Animal**

---

### 3️⃣ Works with **Interfaces**

```java
interface Animal {}
class Dog implements Animal {}

Dog d = new Dog();
d instanceof Animal   // true
```

---

### 4️⃣ `instanceof` with `null`

```java
String s = null;
System.out.println(s instanceof String);
```

✔ Output:

```text
false
```

📌 `null` is not an object, so result is always `false`.

---

### 5️⃣ Compile-Time Safety Rule

❌ This is **NOT allowed**:

```java
Integer i = 10;
System.out.println(i instanceof String); // Compile-time error
```

❓ Why?

👉 `Integer` and `String` are **unrelated classes**

---

## 🔹 Why Do We Use `instanceof` in Real Life?

### ✅ Safe Type Casting (Most Common Use)

```java
Object obj = "Hello";

if (obj instanceof String) {
    String s = (String) obj; // safe casting
    System.out.println(s.length());
}
```

✔ Prevents `ClassCastException`

---

## 🔹 One-Line Definition (Perfect for Interview / README)

**`instanceof` checks whether an object belongs to a specific class, subclass, or interface at runtime.**

---

## 🔹 Easy Memory Trick 🧠

```java
object instanceof Type
```

Read it as:

👉 **“Is object a Type?”**

---


---

## ⭐ Important Interview Questions (Java Operators)

### 1. Difference between `==` and `=` ?
- `=` → assignment
- `==` → comparison

---

### 2. Difference between `&` and `&&` ?
- `&` → bitwise AND
- `&&` → logical AND (short-circuit)

---

### 3. Difference between `>>` and `>>>` ?
- `>>` → signed right shift
- `>>>` → unsigned right shift

---

### 4. Can we use arithmetic operators on `String`?
- Only `+` (for concatenation)

---

### 5. What does `%` operator do?
- Returns **remainder**

---

## Conditional statement in java
![conditional statement img](img/conditonal_img.webp);

---
🧠 Decision Making in Java (Conditional Statements)


Decision making in programming is similar to real-life decision making.
We often want certain code to run only when a condition is true.

👉 In Java, this is done using conditional (decision-making) statements, which control the flow of execution of a program.

🔹 Types of Decision-Making Statements in Java

Java provides the following decision-making constructs:

- if statement

- if-else statement

- nested if statement

- if-else-if ladder

- switch statement

- Ternary operator (?:)

1️⃣ if Statement

The if statement is the simplest decision-making statement.

👉 It executes a block of code only if the condition is true.

Syntax
````
if (condition) {
// code executes if condition is true
}
Example
class A {
public static void main(String args[]) {
int i = 10;

        if (i < 15) {
            System.out.println("Condition is True");
        }
    }
}

````
Output
Condition is True
📌 Important Notes

The condition must return true or false

If {} are omitted, only the next line belongs to if

if (i < 15)
System.out.println("True");
System.out.println("Always runs"); // not part of if
2️⃣ if-else Statement

The if-else statement allows you to execute:

one block if the condition is true

another block if the condition is false

Syntax
````
if (condition) {
// true block
} else {
// false block
}
````
Example

````
class A {
public static void main(String args[]) {
int i = 10;

        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");
    }
}

````
Output
i is smaller than 15
3️⃣ Nested if Statement

A nested if is an if statement inside another if.

👉 Used when one condition depends on another.

Example
````
class A{
public static void main(String args[]) {
int i = 10;

        if (i < 15) {
            System.out.println("i is smaller than 15");

            if (i == 10) {
                System.out.println("i is exactly 10");
            }
        }
    }
}
````
Output
i is smaller than 15
i is exactly 10

📌 Inner if executes only if outer if is true

4️⃣ if-else-if Ladder

Used when multiple conditions need to be checked one by one.

👉 As soon as one condition becomes true, the rest are skipped.

Syntax
if (condition1) {
// code
} else if (condition2) {
// code
} else {
// default code
}
Example
````
class B{
public static void main(String args[]) {
int i = 20;

        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
    }
}
````
Output
i is 20

📌 Conditions are checked top to bottom

5️⃣ switch Statement

The switch statement is a multi-way decision statement.

👉 It selects execution paths based on the value of a variable or expression.

Syntax
switch (expression) {
case value1:
// code
break;
case value2:
// code
break;
default:
// code
}
Example
````
class  A{
public static void main(String[] args) {
int num = 20;

        switch (num) {
            case 5:
                System.out.println("It is 5");
                break;
            case 10:
                System.out.println("It is 10");
                break;
            case 15:
                System.out.println("It is 15");
                break;
            case 20:
                System.out.println("It is 20");
                break;
            default:
                System.out.println("Not present");
        }
    }
}
````
Output
It is 20
📌 Important Points about switch

Expression types allowed:

byte, short, int, char

enum

String (from Java 7)

break prevents fall-through

default is optional

Duplicate case values are not allowed

6️⃣ Ternary Operator (?:)

The ternary operator is a short-hand replacement for simple if-else.

Syntax
condition ? expression_if_true : expression_if_false;
Example
`````
class A {
public static void main(String args[]) {
int a = 10, b = 20;

        int max = (a > b) ? a : b;
        System.out.println("Maximum is " + max);
    }
}
`````
Output
Maximum is 20

📌 Best used for simple conditions, not complex logic.

🧠 When to Use What?

Situation	Use
Single condition	if
Two choices	if-else
Dependent conditions	Nested if
Multiple comparisons	if-else-if
Fixed values	switch
Simple assignment decision	Ternary ?:
🎯 Interview & Exam Tips

**Conditions must return boolean**

Use switch for cleaner code when checking constant values

Avoid deep nested if → reduces readability

Ternary is an expression, not a statement

Always use {} for clarity (best practice)

✅ One-Line Summary

Decision-making statements in Java control the flow of execution based on conditions using if, else, switch, and the ternary operator.


----

# Java Loops


Loops in programming allow a block of code to execute repeatedly based on a condition.  
In Java, loops are mainly used to reduce code duplication and perform repetitive tasks efficiently.

Java provides **four types of loops**:
1. `for` loop
2. Enhanced `for` loop (for-each)
3. `while` loop
4. `do-while` loop

---

## 1. `for` Loop

The `for` loop is used when the **number of iterations is known in advance**.  
It combines initialization, condition checking, and increment/decrement in a single line.

### Syntax
```java
for (initialization; condition; increment/decrement) {
    // code to be executed
}
Example
// Java program to demonstrate for loop
class A {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}
````
- Output: 
0 1 2 3 4 5 6 7 8 9 10;

Working of for Loop

**Initialization**: Initializes the loop variable.

**Condition Checking**: Checked before each iteration.

**Execution:** Loop body runs if condition is true.

**Increment/Decrement:** Updates loop variable.

**Termination:** Loop ends when condition becomes false.

for loop is an Entry-Controlled Loop.

**1.1 Enhanced for Loop (for-each)**

Used to iterate over arrays or collections without using indexes.

Syntax
for (dataType variable : arrayOrCollection) {
    // code to be executed
}
Example
````
class A {
    public static void main(String[] args) {
        String[] names = {"Sweta", "Gudly", "Amiya"};

        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}
````
Output:
Name: Sweta
Name: Gudly
Name: Amiya

**2. while Loop**

The while loop checks the condition before executing the loop body.
Used when the number of iterations is not fixed.
````
Syntax
while (condition) {
    // code to be executed
}
````
Example
````
class A {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }
}
````
- Output
0 1 2 3 4 5 6 7 8 9 10

while loop is an Entry-Controlled Loop.

**3. do-while Loop**

The do-while loop executes at least once, even if the condition is false.

Syntax
do {
    // code to be executed
} while (condition);
Example
````
class A {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }
}
````
Output
0 1 2 3 4 5 6 7 8 9 10

do-while loop is an Exit-Controlled Loop.
----
**Common Loop Mistakes and How to Avoid Them**
**1. Infinite Loops**

Occurs when the loop condition never becomes false.

Example
````
class A {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i--) {
            System.out.println("This loop will run forever");
        }
    }
}
````
**2. Off-by-One Errors**

Occurs when a loop runs one extra or one fewer time.

Example
````
class A {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }
}
````
**3. Modifying Loop Variable Inside Loop**

Changing loop variables inside the loop can cause unexpected behavior.

Example
````
class A {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                i++;
            }
            System.out.println(i);
        }
    }
}
````
----
**4. Empty Loop Body**

A loop that performs no operation.

Example
````
class A {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Empty loop body
        }
    }
}
````
----

## Additional Important Concepts
**break Statement**

Used to terminate the loop immediately.
````
class A {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) break;
            System.out.println(i);
        }
    }
}
````
----
**continue Statement**

Skips the current iteration and continues with the next one.
````
class A {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println(i);
        }
    }
}
````
----
**Nested Loops**

A loop inside another loop.
````
class A {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
````
----

# 📘 Methods in Java

This document explains **everything about methods in Java**, starting from **absolute basics** to **advanced concepts**.  

---

## 🔹 What is a Method?

A **method** is a block of code that:
- Performs a specific task
- Executes only when it is called
- Helps in code reuse and modular programming

📌 **Simple definition:**  
> A method is a function written inside a class.

---

## 🔹 Why Do We Need Methods?

Without methods:
- Code becomes lengthy
- Same code is repeated
- Debugging becomes difficult

With methods:
- ✔ Code reuse
- ✔ Clean structure
- ✔ Easy maintenance
- ✔ Better readability

---

## 1️⃣ Method Declaration

### General Syntax
```java
accessModifier returnType methodName(parameters) {
    // method body
}
````

### Example

```java
public static void sayHello() {
    System.out.println("Hello Java");
}
```

### Explanation

| Part       | Description      |
| ---------- | ---------------- |
| `public`   | Access level     |
| `static`   | Belongs to class |
| `void`     | No return value  |
| `sayHello` | Method name      |
| `()`       | Parameters       |
| `{}`       | Method body      |

---

## 2️⃣ Method Calling

A method **does nothing unless it is called**.

```java
public class Main {
    static void greet() {
        System.out.println("Welcome!");
    }

    public static void main(String[] args) {
        greet(); // method call
    }
}
```

📌 Program execution always starts from `main()`.

---

## 3️⃣ Parameters in Methods

Parameters allow passing data to a method.

```java
static void add(int a, int b) {
    System.out.println(a + b);
}
```

Calling:

```java
add(5, 3); // Output: 8
```

### Types of Parameters

* Primitive types: `int`, `double`, `char`
* Reference types: `String`, arrays, objects

---

## 4️⃣ Return Types

A method can return a value using `return`.

```java
static int square(int x) {
    return x * x;
}
```

Usage:

```java
int result = square(5);
System.out.println(result); // 25
```

📌 Rules:

* `void` methods do not return values
* Returned value must match return type
* Code after `return` will not execute

---

## 5️⃣ Method Overloading

### Definition

Method overloading means:

* Same method name
* Different parameter list
* Same class

### Example

```java
static int add(int a, int b) {
    return a + b;
}

static double add(double a, double b) {
    return a + b;
}
```

### Invalid Overloading

```java
int add(int a, int b)
double add(int a, int b) // ❌ Not allowed
```

(Return type alone cannot differentiate methods)

---

## 6️⃣ Recursion

### Definition

Recursion is when a method calls itself.

### Example (Factorial)

```java
static int fact(int n) {
    if (n == 0)
        return 1;
    return n * fact(n - 1);
}
```

📌 Important:

* Must have a base condition
* Otherwise leads to `StackOverflowError`

---

## 7️⃣ Types of Methods

### 1. Static Method

* Belongs to class
* No object required

```java
static void show() {}
```

---

### 2. Instance Method

* Belongs to object
* Requires object creation

```java
void display() {}

Main obj = new Main();
obj.display();
```

---

## 8️⃣ Access Modifiers in Methods

| Modifier    | Access Level            |
| ----------- | ----------------------- |
| `public`    | Anywhere                |
| `protected` | Same package / subclass |
| default     | Same package            |
| `private`   | Same class only         |

---

## 9️⃣ Call by Value in Java

Java always uses **call by value**.

```java
static void change(int x) {
    x = 50;
}

public static void main(String[] args) {
    int a = 10;
    change(a);
    System.out.println(a); // 10
}
```

📌 The original variable is not modified.

---

## 🔟 Method vs Constructor

| Method                   | Constructor          |
| ------------------------ | -------------------- |
| Has return type          | No return type       |
| Can be called explicitly | Called automatically |
| Performs action          | Initializes object   |

---

## 1️⃣1️⃣ Varargs (Variable Arguments)

Allows passing multiple arguments.

```java
static int sum(int... nums) {
    int total = 0;
    for(int n : nums)
        total += n;
    return total;
}
```

Call:

```java
sum(1, 2, 3, 4);
```

---

## 1️⃣2️⃣ Method Hiding (Static Methods)

```java
class A {
    static void show() {}
}

class B extends A {
    static void show() {}
}
```

📌 Static methods are hidden, not overridden.

---

## 1️⃣3️⃣ Overloading vs Overriding

| Overloading          | Overriding           |
| -------------------- | -------------------- |
| Same class           | Parent-child classes |
| Compile-time         | Runtime              |
| Different parameters | Same signature       |

---

## 1️⃣4️⃣ Real-Life Example

```java
class ATM {
    static void withdraw(int amount) {
        System.out.println("Withdrawn: " + amount);
    }
}
```

* Class → Machine
* Method → Action

---

## 1️⃣5️⃣ Best Practices

* Use meaningful method names
* One method should do one task
* Avoid very long methods
* Follow camelCase naming
* Add comments where needed

---

Perfect 👍
Below is a **clean, beginner-friendly + professional GitHub-ready explanation** of **Java Identifiers**.
I’ve **corrected language**, **added missing points**, and structured it so **freshers + experienced developers** both benefit.

You can directly put this into your **GitHub README.md**.

---

# 📘 Java Identifiers 


An **identifier in Java** is the **name given to a programming element** such as:
- Variables
- Classes
- Methods
- Packages
- Interfaces
- Arrays
- Objects

Identifiers are used to **uniquely identify** these elements in a Java program.

📌 **Important Rule:**  
Every variable, method, or class in Java **must have a unique identifier** within its scope.

---

## 🔹 Example Program

```java
class CoreJava {
    public static void main(String[] args) {
        int x = 9;
    }
}
````

### Identifiers in the Above Program

| Code Element | Identifier |
| ------------ |------------|
| Class name   | `CoreJava` |
| Method name  | `main`     |
| Variable     | `x`        |
| Parameter    | `args`     |

---

## 🔹 Rules for Naming Java Identifiers

Java has **strict rules** for identifiers.
If these rules are violated, a **compile-time error** occurs.

These rules are mostly **similar to C and C++**, but Java enforces them more strictly.

---

### ✅ 1. Allowed Characters

Only the following characters are allowed:

* Uppercase letters: `A-Z`
* Lowercase letters: `a-z`
* Digits: `0-9`
* Dollar sign: `$`
* Underscore: `_`

❌ Invalid:

```java
int CoreJava@ = 10;   // '@' is not allowed
```

---

### ✅ 2. Identifier Cannot Start with a Digit

Identifiers **must start with a letter, `_`, or `$`**.

❌ Invalid:

```java
int 123value = 10;
```

✅ Valid:

```java
int value123 = 10;
```

---

### ✅ 3. Java Identifiers Are Case-Sensitive

Java treats **uppercase and lowercase letters differently**.

```java
int number = 10;
int Number = 20;
```

✔ Both are **different identifiers**

---

### ✅ 4. No Length Limit (But Use Meaningful Names)

Java does **not impose a length limit** on identifiers.

However:

* Recommended length: **4–15 characters**
* Names should be **meaningful and readable**

❌ Bad:

```java
int a;
```

✅ Good:

```java
int totalMarks;
```

---

### ✅ 5. Reserved Words Cannot Be Used

Java has **53 reserved words**:

* **50 keywords** (`int`, `class`, `if`, `while`, etc.)
* **3 literals** (`true`, `false`, `null`)

❌ Invalid:

```java
int while = 20;   // 'while' is a keyword
```

📌 Keywords are **predefined** and **cannot be used as identifiers**.

---

## 🔹 Valid Java Identifiers

```text
MyVariable
MYVARIABLE
myvariable
x
i
x1
i1
_myvariable
$myvariable
sum_of_array
geeks123
```

✔ Follow all rules
✔ Start correctly
✔ Use allowed characters

---

## 🔹 Invalid Java Identifiers (With Reasons)

```text
My Variable          // ❌ contains space
123CoreJava          // ❌ starts with digit
a+c                  // ❌ '+' not allowed
variable-2           // ❌ '-' not allowed
sum_&_difference     // ❌ '&' not allowed
int                  // ❌ reserved keyword
```

---

## 🔹 Naming Conventions (VERY IMPORTANT)

> Naming conventions are **not rules**, but **best practices** followed by professionals.

### 🔸 Variable & Method Names

* Use **camelCase**

```java
int totalMarks;
void calculateSum() {}
```

---

### 🔸 Class & Interface Names

* Use **PascalCase**

```java
class StudentDetails {}
interface Drawable {}
```

---

### 🔸 Constants

* Use **UPPER_CASE**

```java
final int MAX_SIZE = 100;
```

---

## 🔹 Identifier vs Variable Name (Common Confusion)

| Identifier                         | Variable                |
| ---------------------------------- | ----------------------- |
| Name of any element                | Stores data             |
| Applies to class, method, variable | Only for variables      |
| Example: `main`, `Student`         | Example: `age`, `marks` |

📌 **Every variable name is an identifier, but not every identifier is a variable.**

---

## 🔹 Interview & Exam Points

* Java identifiers are **case-sensitive**
* Can contain `$` and `_`
* Cannot start with digits
* Cannot use Java keywords
* No length restriction
* Java has **53 reserved words**


---

# 📘 Java Keywords – 

---

## 🔹 What are Java Keywords?

In Java, **keywords** are **reserved words** that have **predefined meanings** in the language.
They are used by the **Java compiler** to perform specific internal operations or represent predefined actions.

🚫 **Keywords cannot be used as identifiers**, meaning they **cannot be used as**:

* Variable names
* Method names
* Class names
* Object names

---

## 🔹 Simple Example Using Java Keywords

```java
public class Demo {
    public static void main(String[] args) {

        // Using 'final' and 'int' keywords
        final int x = 10;

        // Using 'if' and 'else' keywords
        if (x > 10) {
            System.out.println("Failed");
        } else {
            System.out.println("Successful demonstration of keywords.");
        }
    }
}
```

### ✅ Output

```
Successful demonstration of keywords.
```

---

## ❌ What Happens If We Use a Keyword as a Variable Name?

Using a Java keyword as an identifier causes a **compile-time error**.

### ❌ Invalid Code Example

```java
class Demo {
    public static void main(String[] args) {
        String this = "Hello World!";
        System.out.println(this);
    }
}
```

### ❌ Compiler Error

```
error: not a statement
error: ';' expected
```

📌 **Reason:**
`this` is a **Java keyword**, so it cannot be used as a variable name.

---

## 🔹 Important Points About Java Keywords

✔ `const` and `goto` are **reserved keywords**, even though they are **not used** in Java.

✔ `true`, `false`, and `null` **look like keywords**, but they are actually **literals**.
However, **they still cannot be used as identifiers**.

✔ Java keywords are **case-sensitive**:

```java
if   // valid
IF   // ❌ invalid
```

✔ Java currently has **53 reserved words**, including:

* 50 keywords
* 3 literals (`true`, `false`, `null`)

---

## 📚 Java Keywords List (As of Java 21)

Java keywords are grouped by their **purpose and usage**.

---

## 1️⃣ Data Type Keywords

Used to define the type of data a variable can hold.

| Keyword | Description              |
| ------- | ------------------------ |
| boolean | Stores true or false     |
| byte    | 8-bit signed integer     |
| char    | 16-bit Unicode character |
| short   | 16-bit signed integer    |
| int     | 32-bit signed integer    |
| long    | 64-bit signed integer    |
| float   | 32-bit decimal number    |
| double  | 64-bit decimal number    |
| void    | Method returns no value  |

---

## 2️⃣ Control Flow Keywords

Used to control the execution flow of the program.

| Keyword  | Description                          |
| -------- | ------------------------------------ |
| if       | Executes code when condition is true |
| else     | Executes when if condition is false  |
| switch   | Selects code based on value          |
| case     | Defines a switch branch              |
| default  | Executes if no case matches          |
| for      | Loop with counter                    |
| while    | Loop with condition                  |
| do       | Executes loop at least once          |
| break    | Exits loop or switch                 |
| continue | Skips current loop iteration         |
| return   | Returns value from method            |

---

## 3️⃣ Exception Handling Keywords

Used to handle runtime errors safely.

| Keyword | Description                 |
| ------- | --------------------------- |
| try     | Wraps risky code            |
| catch   | Handles exceptions          |
| finally | Always executes             |
| throw   | Explicitly throws exception |
| throws  | Declares exceptions         |
| assert  | Debugging checks            |

---

## 4️⃣ Object-Oriented Programming (OOP) Keywords

Used to build classes, inheritance, and abstraction.

| Keyword    | Description              |
| ---------- | ------------------------ |
| class      | Declares a class         |
| interface  | Declares an interface    |
| extends    | Inherits a class         |
| implements | Implements interface     |
| new        | Creates object           |
| this       | Refers to current object |
| super      | Refers to parent class   |
| abstract   | Incomplete class/method  |
| final      | Prevents modification    |
| static     | Class-level member       |
| sealed     | Restricts inheritance    |
| permits    | Allowed subclasses       |

---

## 5️⃣ Access Control Keywords

Control visibility of classes and members.

| Keyword   | Description           |
| --------- | --------------------- |
| public    | Accessible everywhere |
| protected | Package + subclass    |
| private   | Same class only       |

---

## 6️⃣ Package & Import Keywords

Used for code organization.

| Keyword | Description           |
| ------- | --------------------- |
| package | Defines namespace     |
| import  | Access other packages |

---

## 7️⃣ Multithreading & Synchronization Keywords

Used for concurrent programming.

| Keyword      | Description                  |
| ------------ | ---------------------------- |
| synchronized | Thread-safe block            |
| volatile     | Prevents cache inconsistency |

---

## 8️⃣ Memory Management & Native Code Keywords

| Keyword   | Description         |
| --------- | ------------------- |
| transient | Skips serialization |
| native    | Uses non-Java code  |

---

## 9️⃣ Modifier & Utility Keywords

| Keyword  | Description                         |
| -------- | ----------------------------------- |
| strictfp | Platform-independent floating point |

---

## 🔟 Reserved but Unused Keywords

| Keyword | Description      |
| ------- | ---------------- |
| const   | Reserved, unused |
| goto    | Reserved, unused |

---

## 1️⃣1️⃣ Special Literals (Not Keywords)

| Literal | Description   |
| ------- | ------------- |
| true    | Boolean true  |
| false   | Boolean false |
| null    | No reference  |

---

# 📦 Wrapper Classes in Java 

---

## 1️⃣ What Is Data in Java?

Java programs work with **data**.
Java supports **two categories of data**:

### 🔹 1. Primitive Data Types

These store **simple raw values**.

Examples:

```java
int a = 10;
double b = 3.14;
char c = 'A';
boolean flag = true;
```

📌 Characteristics:

* Store **actual values**
* Not objects
* No methods
* Fast
* Memory efficient

---

### 🔹 2. Reference Data Types (Objects)

These store **addresses of objects**.

Examples:

```java
String name = "Core Java";
Integer x = 100;
```

📌 Characteristics:

* Are objects
* Created from classes
* Have methods
* Can be null

---

## 2️⃣ Why Java Created Primitive Data Types?

Java was designed to be:
- ✔ Fast
- ✔ Memory-efficient

Primitive types:

* Directly store values
* Do not need extra memory
* Do not have object overhead

📌 That’s why **primitive data types exist**.

---

## 3️⃣ The Problem With Primitives (Very Important)

Primitives **cannot**:
* ❌ Be stored in Collections
* ❌ Be used with Generics
* ❌ Be null
* ❌ Behave like objects
* ❌ Use OOP features

Example (INVALID):

```java
ArrayList<int> list = new ArrayList<>(); // ❌ Error
```

📌 Java collections work only with **objects**.

---

## 4️⃣ The Solution: Wrapper Classes

### 📌 Definition

> **Wrapper classes are predefined classes that convert primitive values into objects.**

Each primitive has a wrapper class.

---

## 5️⃣ Primitive ↔ Wrapper Mapping

| Primitive | Wrapper   |
| --------- | --------- |
| byte      | Byte      |
| short     | Short     |
| int       | Integer   |
| long      | Long      |
| float     | Float     |
| double    | Double    |
| char      | Character |
| boolean   | Boolean   |

---

## 6️⃣ What Does a Wrapper Class ACTUALLY Do?

Example:

```java
int x = 10;
```

This is just a number.

Now:

```java
Integer y = Integer.valueOf(10);
```

This creates:

* An object
* That stores value `10`
* With extra features (methods, null support, etc.)

---

## 7️⃣ Why Wrapper Classes Are Needed (Core Reasons)

### 🔹 1. Collections

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
```

Without wrapper classes → Collections are impossible.

---

### 🔹 2. Generics

```java
List<Integer> numbers;
```

Generics work only with **objects**.

---

### 🔹 3. Null Handling

```java
Integer x = null; // allowed
int y = null;     // ❌ not allowed
```

---

### 🔹 4. Utility Methods

```java
Integer.parseInt("123");
Integer.max(10, 20);
```

---

### 🔹 5. Frameworks & APIs

Spring, Hibernate, JDBC, etc. expect **objects**, not primitives.

---

## 8️⃣ Autoboxing (Primitive → Wrapper)

### 📌 Definition

> Automatic conversion of primitive into wrapper object.

### Example:

```java
int a = 50;
Integer b = a; // autoboxing
```

Java internally does:

```java
Integer b = Integer.valueOf(a);
```

---

## 9️⃣ Unboxing (Wrapper → Primitive)

### 📌 Definition

> Automatic conversion of wrapper object into primitive.

### Example:

```java
Integer x = 30;
int y = x; // unboxing
```

Java internally does:

```java
int y = x.intValue();
```

---

## 🔄 Autoboxing & Unboxing Diagram

```
Primitive → Wrapper  = Autoboxing
Wrapper   → Primitive = Unboxing
```

---

## 🔟 Full Example (Autoboxing + Unboxing)

```java
import java.util.ArrayList;

class CoreJava {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);   // autoboxing
        list.add(50);

        int x = list.get(0); // unboxing
        System.out.println(x);
    }
}
```

---

## 1️⃣1️⃣ Important Concept: Wrapper Caching

Java caches wrapper objects for:

```
-128 to 127
```

```java
Integer a = 100;
Integer b = 100;
System.out.println(a == b); // true
```

But:

```java
Integer x = 1000;
Integer y = 1000;
System.out.println(x == y); // false
```

📌 Always use `.equals()` for value comparison.

---

## 1️⃣2️⃣ Common Mistake (Very Important)

```java
Integer x = null;
int y = x; // ❌ NullPointerException
```

Why?
👉 Unboxing tries to extract value from `null`.

---

## 1️⃣3️⃣ Now the BIG QUESTION ❓

### ❓ If wrapper classes exist, why not use them everywhere?

### ❌ Why NOT always use wrapper classes?

1️⃣ **Performance**

* Wrapper = object creation
* Slower than primitive

2️⃣ **Memory**

* Wrapper uses more memory
* Primitives are lightweight

3️⃣ **Null Risk**

* Wrapper can cause NullPointerException

4️⃣ **Unnecessary Overhead**

* Simple math does not need objects

---

### ✅ Why primitives still exist?

- ✔ Speed
- ✔ Less memory
- ✔ Simplicity
- ✔ Safe calculations

---

## 1️⃣4️⃣ When to Use WHAT (Final Rule)

### Use Primitive:

- ✔ Calculations
- ✔ Loops
- ✔ Performance-critical code

### Use Wrapper:

- ✔ Collections
- ✔ APIs
- ✔ Frameworks
- ✔ Null needed

---

## 🧠 Final One-Line Answer (Interview Ready)

> Wrapper classes allow primitive data types to be treated as objects, but primitives still exist for better performance and memory efficiency.

---

## 📝 One Important Interview Question (With Answer)

### ❓ Why can’t Java collections store primitive types?

### ✅ Answer:

Java collections are designed to store **objects only**. Primitive types are not objects, so Java uses wrapper classes to convert primitives into objects before storing them in collections.

---

Perfect 👍
Below is a **clean, beginner-to-advanced README.md–style explanation** of **Java Variables**, written so you can **directly copy-paste into your GitHub repo**.
I have **removed all “Geeks / GFG” naming**, used a **neutral Core Java style**, and **added important missing concepts** (types of variables, scope, default values, memory notes).

---

# 📌 Java Variables 
## 🔹 What Is a Variable?

A **variable** represents a memory location that holds a value.

Every Java variable has **three parts**:

1. **Data Type** – Defines what type of data the variable can store
   (e.g., `int`, `double`, `String`)
2. **Variable Name** – A unique identifier following Java naming rules
3. **Value** – The actual data stored in the variable

---

## 🔹 Basic Example

```java
class CoreJava {
    public static void main(String[] args) {

        // Declaring and initializing variables

        int age = 25;                 // Integer variable
        String name = "Core Java";    // String variable
        double salary = 50000.50;     // Double variable

        // Displaying values
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
```

### Output

```text
Age: 25
Name: Core Java
Salary: 50000.5
```

---

## 🔹 How to Declare a Variable in Java?

### Syntax

```java
dataType variableName;
```

### Example

```java
int count;
double price;
String city;
```

📌 At this stage, **memory is allocated**, but **no value is assigned yet**.

---

## 🔹 How to Initialize a Variable?

Initialization means **assigning a value** to a variable.

### Syntax

```java
dataType variableName = value;
```

### Example

```java
class CoreJava {
    public static void main(String[] args) {

        float interest = 5.5f;
        int time = 10;
        int speed = 20;
        char grade = 'A';

        System.out.println("Interest: " + interest);
        System.out.println("Time: " + time);
        System.out.println("Speed: " + speed);
        System.out.println("Grade: " + grade);
    }
}
```

### Output

```text
Interest: 5.5
Time: 10
Speed: 20
Grade: A
```

---

## 🔹 Declaration vs Initialization

| Term           | Meaning             |
| -------------- | ------------------- |
| Declaration    | Creating a variable |
| Initialization | Assigning a value   |

```java
int x;      // declaration
x = 10;     // initialization
```

or both together:

```java
int x = 10;
```

---

## 🔹 Rules for Naming Java Variables

✔ Must start with a **letter**, `$`, or `_`
✔ Cannot start with a digit
✔ Cannot use Java **keywords**
✔ Case-sensitive (`age` ≠ `Age`)
✔ No spaces allowed
✔ Can contain letters, digits, `$`, `_`
✔ Use **camelCase** naming convention
✔ Use **meaningful names**

### ✅ Valid Variable Names

```java
int totalMarks;
double averageScore;
String studentName;
int _count;
int $price;
```

### ❌ Invalid Variable Names

```java
int 1value;     // starts with digit
int total marks; // space not allowed
int class;      // keyword
int total-marks; // hyphen not allowed
```

---

## 🔹 Types of Variables in Java (IMPORTANT)

Java variables are classified based on **scope and lifetime**.

---

### 1️⃣ Local Variables

* Declared **inside a method or block**
* Must be **initialized before use**
* No default value

```java
class CoreJava {
    public static void main(String[] args) {
        int x = 10;   // local variable
        System.out.println(x);
    }
}
```

---

### 2️⃣ Instance Variables

* Declared **inside a class**, outside methods
* Belong to an **object**
* Get **default values**

```java
class Student {
    int age;         // instance variable
    String name;     // instance variable
}
```

Default values:

* `int` → 0
* `double` → 0.0
* `boolean` → false
* `String` → null

---

### 3️⃣ Static Variables (Class Variables)

* Declared using `static`
* Shared among **all objects**
* Memory allocated **once**

```java
class College {
    static String collegeName = "ABC College";
}
```

---

## 🔹 Variable Scope

| Variable Type | Scope               |
| ------------- | ------------------- |
| Local         | Inside method/block |
| Instance      | Inside object       |
| Static        | Entire class        |

---

## 🔹 Default Values (Very Important)

| Data Type | Default Value |
| --------- | ------------- |
| int       | 0             |
| double    | 0.0           |
| boolean   | false         |
| char      | '\u0000'      |
| String    | null          |

⚠ Local variables **do not get default values**.

---

## 🔹 Final Key Points

* Variables store data in memory
* Java is **strongly typed**
* Variable type decides memory size
* Scope controls accessibility
* Naming conventions improve readability

---

## 🧠 Interview-Ready Definition

> A variable in Java is a named memory location that stores data of a specific type and whose value can change during program execution.

---



# 🔹 Static Method vs Instance Method in Java
In Java, **methods define what a class or object can do**.
Understanding the difference between **static methods** and **instance methods** is **very important** because it affects:

* Memory usage
* Performance
* Object-oriented design
* Interview questions

---

## 🧱 First: What Is a Method?

> A **method** is a block of code that performs a specific task.

Example:

```java
void greet() {
    System.out.println("Hello");
}
```

Java has **two main types of methods**:

1. **Static Method**
2. **Instance Method**

---

## 1️⃣ Static Method in Java

### 🔹 Definition

> A **static method belongs to the class**, not to any object.

---

### 🔹 Key Characteristics of Static Methods

✔ Belong to the **class**
✔ Can be called **without creating an object**
✔ Can access **only static members** directly
✔ Cannot use `this` keyword
✔ Loaded **once** in memory

---

### 🔹 Example: Static Method

```java
class Demo {

    // static method
    public static void greet() {
        System.out.println("Hello Java!");
    }

    public static void main(String[] args) {

        // calling directly
        greet();

        // calling using class name
        Demo.greet();
    }
}
```

### Output

```
Hello Java!
Hello Java!
```

---

### 🔹 Why Object Is Not Needed?

Because:

* Static methods are **class-level**
* They exist **even if no object exists**

📌 That’s why `main()` is static — JVM should run the program **without creating an object**.

---

## 2️⃣ Instance Method in Java

### 🔹 Definition

> An **instance method belongs to an object** of the class.

---

### 🔹 Key Characteristics of Instance Methods

✔ Belong to **objects**
✔ Need an **object to call**
✔ Can access **instance + static members**
✔ Can use `this` keyword
✔ Support **runtime polymorphism**

---

### 🔹 Example: Instance Method

```java
class Student {
    String name;

    // instance method
    public void setName(String name) {
        this.name = name;
    }
}

class Demo {
    public static void main(String[] args) {

        // creating object
        Student s = new Student();

        // calling instance method
        s.setName("Core Java");

        System.out.println(s.name);
    }
}
```

### Output

```
Core Java
```

---

### 🔹 Why Object Is Required?

Because:

* Instance methods work on **object data**
* Different objects can have **different values**

---

## 3️⃣ `this` Keyword Difference

### ❌ Static Method

```java
static void show() {
    // this.x ❌ not allowed
}
```

Why?
👉 `this` refers to **current object**
👉 Static methods do **not belong to any object**

---

### ✅ Instance Method

```java
void show() {
    this.x = 10; // ✔ allowed
}
```

---

## 4️⃣ Memory Understanding (VERY IMPORTANT)

### 🔹 Static Method Memory

* Loaded **once**
* Shared by **all objects**

### 🔹 Instance Method Memory

* Each object has its **own copy**
* Works with object-specific data

---

## 5️⃣ Method Overriding (Key Difference)

### Static Method

❌ Cannot be overridden
✔ Method hiding happens (compile-time)

### Instance Method

✔ Can be overridden
✔ Supports **runtime polymorphism**

---

## 6️⃣ Access Rules Summary

| Can Access         | Static Method | Instance Method |
| ------------------ | ------------- | --------------- |
| Static variables   | ✔ Yes         | ✔ Yes           |
| Static methods     | ✔ Yes         | ✔ Yes           |
| Instance variables | ❌ No          | ✔ Yes           |
| Instance methods   | ❌ No          | ✔ Yes           |
| this keyword       | ❌ No          | ✔ Yes           |

---

## 7️⃣ When Should You Use Static Methods?

Use **static methods** when:

✔ Logic is **common for all objects**
✔ Method does **not depend on object data**
✔ Utility/helper methods
✔ Mathematical calculations

### Example:

```java
Math.max(10, 20);
Integer.parseInt("100");
```

---

## 8️⃣ When Should You Use Instance Methods?

Use **instance methods** when:

✔ Logic depends on **object state**
✔ Each object behaves differently
✔ You need **OOP features**

Example:

```java
student.calculateResult();
employee.getSalary();
```

---

## 9️⃣ Static vs Instance Method (Complete Table)

| Feature              | Static Method  | Instance Method |
| -------------------- | -------------- | --------------- |
| Belongs to           | Class          | Object          |
| Object required      | ❌ No           | ✔ Yes           |
| Access instance data | ❌ No           | ✔ Yes           |
| Access static data   | ✔ Yes          | ✔ Yes           |
| this keyword         | ❌ Not allowed  | ✔ Allowed       |
| Overriding           | ❌ No           | ✔ Yes           |
| Polymorphism         | ❌ Compile-time | ✔ Runtime       |
| Memory               | Single copy    | Per object      |

---

## 🔟 Common Beginner Confusion (IMPORTANT)

### ❓ Why `main()` is static?

✔ JVM must start program **without object creation**
✔ Static allows direct execution

```java
public static void main(String[] args)
```

---

## 🧠 Interview-Ready One-Liner

> A static method belongs to the class and can be called without an object, while an instance method belongs to an object and requires an instance to be invoked.

---

## 🏁 Final Summary

* **Static methods** → class-level, shared, faster
* **Instance methods** → object-level, flexible, OOP-based
* Use static for **utility**
* Use instance for **object behavior**

---


# 🔐 Access Modifiers in Java 


In Java, **access modifiers control the visibility and accessibility** of:

* variables
* methods
* constructors
* classes

They help in:

* **Encapsulation**
* **Security**
* **Clean code design**
* **API design**

---

## 📌 What Are Access Modifiers?

> Access modifiers define **from where** a class member can be accessed.

Java provides **4 access modifiers**:

1. `private`
2. `default` (package-private)
3. `protected`
4. `public`

---

## 🧠 Why Access Modifiers Are Important?

1. ✔ Prevent unauthorized access
2. ✔ Hide internal implementation
3. ✔ Control inheritance behavior
4. ✔ Reduce coupling
5. ✔ Make code easier to maintain

---

## 1️⃣ Private Access Modifier

### 🔹 Definition

> Members declared as `private` are accessible **only inside the same class**.

---

### 🔹 Key Points

1. ✔ Most restrictive
2. ✔ Supports **data hiding**
3. ✔ Used heavily in **encapsulation**
4. ✔ Cannot be accessed outside the class
5. ✔ Classes cannot be `private` (top-level)

---

### 🔹 Example: Private Variable

```java
class Person {

    // private variable
    private String name;

    // public setter
    public void setName(String name) {
        this.name = name;
    }

    // public getter
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.setName("Alice");

        // System.out.println(p.name); ❌ Not allowed
        System.out.println(p.getName()); // ✔ Allowed
    }
}
```

### Output

```
Alice
```

---

### 🔹 Why Private?

* Prevents **direct modification**
* Forces access via **methods**
* Improves **security and control**

📌 This is the **core of encapsulation**.

---

## 2️⃣ Default (Package-Private) Access Modifier

### 🔹 Definition

> If **no access modifier is specified**, Java uses **default access**.

Accessible:
✔ Within the **same package only**

Not accessible:
❌ Outside the package

---

### 🔹 Example: Default Access Variable

```java
class Car {
    String model; // default access
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();
        c.model = "Tesla"; // ✔ Same package
        System.out.println(c.model);
    }
}
```

### Output

```
Tesla
```

---

### 🔹 Default Access Across Packages (Important)

#### File: `p1/Helper.java`

```java
package p1;

class Helper {
    void show() {
        System.out.println("Hello");
    }
}
```

#### File: `p2/Test.java`

```java
package p2;
import p1.*;

class Test {
    public static void main(String[] args) {

        Helper h = new Helper(); // ❌ Compile-time error
        h.show();
    }
}
```

❌ **Error:** Default members are **not visible outside the package**

---

## 3️⃣ Protected Access Modifier

### 🔹 Definition

> `protected` members are accessible:

* Within the **same package**
* In **subclasses**, even in different packages

---

### 🔹 Key Points

* ✔ Used with **inheritance**
* ✔ Not accessible via object reference in different package
* ✔ Accessible via **subclass method**

---
    
### 🔹 Example: Protected with Inheritance

#### File: `p1/Vehicle.java`

```java
package p1;

public class Vehicle {
    protected int speed;
}
```

#### File: `p2/Bike.java`

```java
package p2;
import p1.Vehicle;

public class Bike extends Vehicle {

    void showSpeed() {
        speed = 100; // ✔ allowed
        System.out.println(speed);
    }
}
```

#### File: `p2/Test.java`

```java
package p2;
import p1.Vehicle;

public class Test {
    public static void main(String[] args) {

        Bike b = new Bike();
        b.showSpeed(); // ✔ works

        Vehicle v = new Vehicle();
        // System.out.println(v.speed); ❌ not allowed
    }
}
```

### Output

```
100
```

---

### 🔹 Important Rule (Very Common Confusion)

❌ Protected members **cannot be accessed using parent object reference**
✔ They can be accessed **inside subclass methods**

---

## 4️⃣ Public Access Modifier

### 🔹 Definition

> `public` members are accessible **from anywhere**.

---

### 🔹 Key Points

✔ Least restrictive
✔ Used for **APIs**
✔ Classes, methods, variables can be public
✔ No access limitation

---

### 🔹 Example: Public Method

```java
class MathUtils {

    public static int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(MathUtils.add(5, 10));
    }
}
```

### Output

```
15
```

---

## 🚫 Important Restriction (Exam + Interview)

❌ **Top-level classes cannot be `private` or `protected`**

Why?

> Because they are not inside another class.

Allowed:
✔ `public`
✔ `default`

---

## 📊 Comparison Table: Access Modifiers

| Access Level | Same Class | Same Package | Subclass (diff pkg) | Everywhere |
| ------------ | ---------- | ------------ | ------------------- | ---------- |
| private      | ✔          | ❌            | ❌                   | ❌          |
| default      | ✔          | ✔            | ❌                   | ❌          |
| protected    | ✔          | ✔            | ✔                   | ❌          |
| public       | ✔          | ✔            | ✔                   | ✔          |

---

## 🏗️ When to Use Each Access Modifier (Real-World)

### 🔒 Private

✔ Fields (variables)
✔ Internal helper methods
✔ Maximum security

Example:

```java
private int balance;
```

---

### 📦 Default

✔ Package-level utilities
✔ Internal framework logic

---

### 🧬 Protected

✔ Base classes
✔ Framework extension points
✔ Inheritance-based designs

---

### 🌍 Public

✔ APIs
✔ Services
✔ Libraries
✔ Entry points

---

## 🧠 Best Practice (VERY IMPORTANT)

> **Use the most restrictive access modifier possible.**

Order of preference:

```
private → default → protected → public
```

---

## 🎯 Interview One-Liner

> Access modifiers in Java control the visibility of classes and their members to enforce encapsulation, security, and proper design.

---


# 🖥️ Command Line Arguments in Java (Complete Guide)

**Last Updated:** 10 Aug, 2025

Command Line Arguments in Java allow us to **pass data to a program at runtime** when the program is executed from the command line (terminal/console).

These arguments are received by the program through the `main` method.

---

## 📌 What Are Command Line Arguments?

> Command line arguments are **values passed to a Java program when it starts running**, instead of taking input during execution.

They are passed **after the class name** while running the program.

---

## 📍 Syntax

```bash
java ClassName arg1 arg2 arg3 ...
```

Example:

```bash
java HelloWorld Hello Java
```

Here:

* `Hello`
* `Java`

are **command line arguments**

---

## 🧠 How Java Receives Command Line Arguments

The `main` method in Java is defined as:

```java
public static void main(String[] args)
```

* `args` is an **array of String**
* JVM stores all command line arguments inside this array
* Arguments are stored as:

    * `args[0]`
    * `args[1]`
    * `args[2]` …

---

## 🧪 Simple Example: Print First Argument

```java
class Demo {
    public static void main(String[] args) {

        System.out.println(args[0]);
    }
}
```

### ▶ Run

```bash
java Demo Hello
```

### 🖨 Output

```
Hello
```

---

## ⚠️ Important Note (Very Common Mistake)

If you run the program **without arguments**:

```bash
java Demo
```

Then this line:

```java
System.out.println(args[0]);
```

❌ will throw:

```
ArrayIndexOutOfBoundsException
```

Why?

* Because `args` is empty
* There is no element at index `0`

---

## ✅ Safe Way: Check Arguments Length

```java
class Demo {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("No command line arguments found.");
        }
    }
}
```

---

## 🔁 Example: Print All Command Line Arguments

```java
class Demo {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("Command line arguments are:");

            for (String value : args) {
                System.out.println(value);
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }
}
```

### ▶ Run

```bash
java Demo Java is powerful
```

### 🖨 Output

```
Command line arguments are:
Java
is
powerful
```

---

## 📌 Important Observations

✔ Arguments are **space-separated**
✔ All arguments are received as **String**
✔ Numbers must be **converted manually**
✔ Use `args.length` to avoid errors

---

## 🔢 Example: Passing Numbers as Arguments

```java
class Sum {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum = " + (a + b));
    }
}
```

### ▶ Run

```bash
java Sum 10 20
```

### 🖨 Output

```
Sum = 30
```

---

## ❓ Why Are Command Line Arguments Always Strings?

Because:

* JVM reads input from **command line as text**
* JVM does not know the data type in advance
* Programmer decides how to convert the data

---

## 🧠 Why Use Command Line Arguments?

✔ No need to modify code for new inputs
✔ Useful for **automation & scripting**
✔ Common in **real-world applications**
✔ Used in **servers, tools, batch jobs**

---

## 🏗️ Real-World Use Cases

* Passing **file paths**
* Passing **configuration values**
* Passing **usernames / flags**
* Running programs in **CI/CD pipelines**
* Starting servers with custom ports

Example:

```bash
java ServerApp 8080 production
```

---

## 🧾 Compilation & Execution Steps

1️⃣ Save file as `Hello.java`
2️⃣ Compile:

```bash
javac Hello.java
```

3️⃣ Run with arguments:

```bash
java Hello Java World
```

---

## 🚨 Common Mistakes

❌ Not checking `args.length`
❌ Assuming args are integers
❌ Accessing invalid index
❌ Forgetting space separation

---

## 🧪 Interview Question (Very Common)

### Q: Why is `main` method argument a `String[]`?

**Answer:**
Because command line inputs are passed as text by the operating system, and Java receives them as an array of strings so the programmer can decide how to use or convert them.

---
## 📌 One-Line Definition

> Command line arguments in Java allow passing input to a program at runtime through the main method as a String array.

---

# 🔁 Variable Arguments (Varargs) in Java
---

# 1️⃣ What Are Variable Arguments (Varargs)?

In Java, **Variable Arguments (Varargs)** allow a method to accept **zero, one, or many arguments** of the **same data type**.

Instead of creating multiple methods or passing arrays manually, **one single method** can handle all cases.

> 💡 Varargs were introduced in **Java 5** to make code **cleaner, flexible, and readable**.

---

## 2️⃣ Why Do We Need Varargs? (The Problem)

### 🔴 Normal Method (Fixed Arguments)

```java
int add(int a, int b) {
    return a + b;
}
```

This method works **only for 2 values**.

But what if we want to:

* add 1 number?
* add 3 numbers?
* add 5 numbers?

---

## 3️⃣ Old Solutions (Before Java 5)

### ❌ Option 1: Method Overloading (Bad Practice)

```java
add(int a)
add(int a, int b)
add(int a, int b, int c)
add(int a, int b, int c, int d)
```

❌ Too many methods
❌ Code becomes long
❌ Hard to maintain

---

### ❌ Option 2: Using Arrays (Confusing)

```java
int add(int[] arr) {
    int sum = 0;
    for (int x : arr) sum += x;
    return sum;
}
```

Call like this:

```java
add(new int[]{1, 2, 3});
```

❌ Hard to read
❌ Not beginner-friendly

---

## ✅ Solution: Varargs (Java 5+)

Java introduced **Varargs** and said:

> “Let a method accept ANY number of arguments easily.”

---

## 4️⃣ Definition of Varargs (Very Important)

> **Varargs allows a method to take 0, 1, or many arguments of the same type.**

🔑 Internally, **Java converts varargs into an array**.

---

## 5️⃣ Syntax of Varargs

```java
returnType methodName(dataType... variableName) {
    // method body
}
```

### Example:

```java
static void printNumbers(int... nums) {
    // nums behaves like int[]
}
```

👉 The `...` (three dots) tells Java:

> “This method can accept multiple values.”

---

## 6️⃣ How Varargs Work Internally (IMPORTANT)

This method call:

```java
printNumbers(1, 2, 3);
```

Internally becomes:

```java
printNumbers(new int[]{1, 2, 3});
```

📌 **Conclusion:**

> Varargs are **just arrays behind the scenes**.

---

## 7️⃣ First Basic Example (Very Simple)

```java
class Demo {

    static void show(int... nums) {
        System.out.println(nums.length);
    }

    public static void main(String[] args) {
        show(10);
        show(10, 20);
        show(10, 20, 30);
        show(); // zero arguments
    }
}
```

### Output

```
1
2
3
0
```

### 🧠 Explanation

* Java converts arguments into an array
* `nums.length` gives number of arguments

---

## 8️⃣ Varargs with Loop (Real Understanding)

```java
class Demo {

    static void print(int... nums) {

        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(5);
        print(1, 2, 3);
        print(); // no arguments
    }
}
```

### Output

```
5
1 2 3
```

---

## 9️⃣ Varargs with Strings

```java
class Demo {

    static void names(String... list) {

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        names("Alice", "Bob");
        names("Alice", "Bob", "Charlie");
    }
}
```

---

## 🔟 Can Varargs Accept ZERO Arguments?

✅ **Yes**

```java
print(); // valid
```

* `nums.length = 0`
* No error occurs

---

## 1️⃣1️⃣ Varargs with Other Parameters

A method **can have normal parameters + varargs**, but:

### ⚠️ Rule: Varargs MUST be the LAST parameter

### ✅ Correct

```java
static void show(String title, int... nums) {
    System.out.println(title);
}
```

### ❌ Incorrect

```java
static void show(int... nums, String title) {
    // Compile-time error
}
```

---

## 1️⃣2️⃣ Example: Normal + Varargs

```java
class Demo {

    static void showData(String title, int... nums) {

        System.out.println("Title: " + title);
        System.out.println("Count: " + nums.length);

        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        showData("Marks", 80, 90);
        showData("Scores", 1, 2, 3, 4, 5);
        showData("Empty");
    }
}
```

---

## 1️⃣3️⃣ Important Rules & Limitations

### ❌ Only ONE varargs allowed

```java
void test(int... a, int... b) // ❌ ERROR
```

### ❌ Varargs cannot be in the middle

```java
void test(int... a, String s) // ❌ ERROR
```

### ✅ Varargs is ALWAYS an array

```java
nums.length
nums[0]
```

---

## 1️⃣4️⃣ Varargs vs Array

| Feature     | Array     | Varargs |
| ----------- | --------- | ------- |
| Syntax      | Hard      | Simple  |
| Readability | Low       | High    |
| Method Call | Confusing | Clean   |
| Flexibility | Medium    | High    |

---

## 1️⃣5️⃣ When Should You Use Varargs?

1. ✅ Logging methods
2. ✅ Utility/helper methods
3. ✅ Mathematical operations
4. ✅ Optional parameters

❌ Avoid when argument count is fixed

---

## 1️⃣6️⃣ Common Mistakes

1. ❌ Thinking varargs is a special data type
2. ❌ Using multiple varargs
3. ❌ Putting varargs before normal arguments
4. ❌ Overusing varargs everywhere

---

## 1️⃣7️⃣ Interview Question (Very Important)

### ❓ Why not always use Varargs?

**Answer:**

* Varargs create an array internally
* Slight memory overhead
* Fixed arguments are faster and clearer when count is known

---

## 1️⃣8️⃣ One-Line Definition (Exam-Ready)

> Varargs in Java allow a method to accept a variable number of arguments, which are internally treated as an array.

---

























