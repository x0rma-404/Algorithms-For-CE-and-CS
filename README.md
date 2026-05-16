# 🧮 Algorithms for CE & CS

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Algorithms](https://img.shields.io/badge/Algorithms-8-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-Open-green?style=for-the-badge)

A clean, well-organized collection of fundamental algorithms implemented in **Java** — built for Computer Engineering and Computer Science students who want to learn by reading real code.

> **Why this repo?** Each file is a standalone, runnable program. No boilerplate, no frameworks — just pure algorithmic logic you can study, run, and modify.

---

## 📂 Repository Structure

```
Algorithms-For-CE-and-CS/
├── 🔀 Sorting
│   ├── Buble_Sort.java
│   └── Quick_Sort.java
│
├── 🔢 Number Theory
│   ├── Happy_Number.java
│   ├── Harshad_Number.java
│   ├── Missing_Number.java
│   ├── Perfect_Number.java
│   └── Ugly_Number.java
│
├── 🔤 String / Array
│   ├── Palindrome.java
│   └── Valid_Palindrome.java
│
└── README.md
```

---

## ⚙️ Algorithms

### 🔀 Sorting

| Algorithm | File | Time Complexity | Approach |
|-----------|------|:-:|-----------|
| **Bubble Sort** | `Buble_Sort.java` | O(n²) | Repeatedly swaps adjacent elements if they are in the wrong order |
| **Quick Sort** | `Quick_Sort.java` | O(n log n) avg | Divide-and-conquer using a pivot to partition the array recursively |

### 🔢 Number Theory

| Algorithm | File | Description |
|-----------|------|-------------|
| **Happy Number** | `Happy_Number.java` | Determines if repeatedly summing the squares of digits eventually reaches `1` |
| **Harshad Number** | `Harshad_Number.java` | Checks if a number is divisible by the sum of its own digits |
| **Missing Number** | `Missing_Number.java` | Finds the missing integer in a sequence `[0, n]` |
| **Perfect Number** | `Perfect_Number.java` | Checks if a number equals the sum of its proper divisors (e.g. `6 = 1+2+3`) |
| **Ugly Number** | `Ugly_Number.java` | Determines if a number's only prime factors are `2`, `3`, and `5` |

### 🔤 String / Array

| Algorithm | File | Description |
|-----------|------|-------------|
| **Palindrome** | `Palindrome.java` | Checks if a string reads the same forwards and backwards |
| **Valid Palindrome** | `Valid_Palindrome.java` | Palindrome check that ignores non-alphanumeric characters and case |

---

## 🚀 Getting Started

### Prerequisites

- **Java 21+** (uses [JEP 463](https://openjdk.org/jeps/463) implicitly declared classes & instance main methods)

### Run any algorithm

```bash
# Compile and run a single file
java Buble_Sort.java

# Or use the classic approach
javac Quick_Sort.java
java Quick_Sort
```

---

## 🎯 Purpose

- 📖 **Learn** — Understand core algorithms through concise Java implementations
- 🧠 **Practice** — Strengthen problem-solving and logical thinking
- 🎓 **Prepare** — Get ready for university exams and technical interviews
- ✍️ **Reference** — Quick lookup for common algorithm patterns

---

## 📋 Roadmap

- [ ] Merge Sort, Insertion Sort, Selection Sort
- [ ] Binary Search & Linear Search
- [ ] Linked List operations
- [ ] Stack & Queue implementations
- [ ] Recursion & Backtracking problems
- [ ] Time & Space complexity analysis for each algorithm

---

## 🤝 Contributing

Contributions are welcome! Feel free to:

1. **Fork** the repository
2. **Add** a new algorithm (one file per algorithm, keep it simple)
3. **Submit** a pull request

---

## 📜 License

This project is open for educational use. Use it, learn from it, share it.
