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

