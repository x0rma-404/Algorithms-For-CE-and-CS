<p align="center">
  <img src="https://img.icons8.com/external-flaticons-flat-flat-icons/128/external-algorithm-computer-programming-flaticons-flat-flat-icons.png" alt="logo" width="100"/>
</p>

<h1 align="center">🧮 Algorithms for CE & CS</h1>

<p align="center">
  <strong>A curated collection of fundamental algorithms implemented in Java</strong><br/>
  <em>Built for Computer Engineering & Computer Science students</em>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java_21+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Problems_Solved-11-4361EE?style=for-the-badge" alt="Problems"/>
  <img src="https://img.shields.io/badge/Categories-4-7209B7?style=for-the-badge" alt="Categories"/>
  <img src="https://img.shields.io/badge/License-Open_Source-06D6A0?style=for-the-badge" alt="License"/>
</p>

<p align="center">
  <a href="#-sorting">Sorting</a> •
  <a href="#-number-theory">Number Theory</a> •
  <a href="#-strings--arrays">Strings & Arrays</a> •
  <a href="#-linked-list">Linked List</a> •
  <a href="#-getting-started">Get Started</a>
</p>

---

## 💡 About

> Each file is a **standalone, runnable program** — no boilerplate, no frameworks, just pure algorithmic logic you can study, run, and modify.

This repository is designed to be a clean reference for students preparing for **university exams**, **technical interviews**, or simply looking to **strengthen their problem-solving skills**. Every algorithm is implemented with clarity in mind, using modern Java features like [JEP 463](https://openjdk.org/jeps/463) (implicitly declared classes & instance main methods).

---

## 📂 Repository Structure

```
Algorithms-For-CE-and-CS/
│
├── 🔀 Sorting
│   ├── Buble_Sort.java          # Classic O(n²) comparison sort
│   └── Quick_Sort.java          # Divide-and-conquer O(n log n) sort
│
├── 🔢 Number Theory
│   ├── Happy_Number.java        # Sum-of-squares cycle detection
│   ├── Harshad_Number.java      # Divisibility by digit sum
│   ├── Missing_Number.java      # Find gap in sequence [0, n]
│   ├── Perfect_Number.java      # Sum of proper divisors check
│   └── Ugly_Number.java         # Prime factor restriction (2, 3, 5)
│
├── 🔤 Strings & Arrays
│   ├── Isomorphic_Strings.java  # Character-mapping equivalence
│   ├── Palindrome.java          # Forward-backward equality
│   └── Valid_Palindrome.java    # Alphanumeric-only palindrome
│
├── 🔗 Linked List
│   └── Remove_Duplicates_from_Sorted_List.java
│
└── README.md
```

---

## ⚙️ Algorithms

### 🔀 Sorting

Sorting algorithms arrange elements in a specific order. These implementations demonstrate two fundamental approaches — the simplicity of comparison-based swapping and the efficiency of divide-and-conquer.

| # | Algorithm | File | Time | Space | Difficulty | Approach |
|:-:|-----------|------|:----:|:-----:|:----------:|----------|
| 1 | **Bubble Sort** | `Buble_Sort.java` | `O(n²)` | `O(1)` | 🟢 Easy | Repeatedly compares and swaps adjacent elements until the array is sorted. Uses a nested loop — outer loop for passes, inner loop for comparisons. |
| 2 | **Quick Sort** | `Quick_Sort.java` | `O(n log n)` | `O(n)` | 🟡 Medium | Selects the middle element as pivot, partitions into three lists (`left`, `mid`, `right`), and recursively sorts. Uses the Lomuto-style three-way partition. |

<details>
<summary>📖 <strong>Example — Quick Sort</strong></summary>

```
Input:  [72, 15, 93, 41, 8, 56, 27, 64, 39, 82]
Output: [8, 15, 27, 39, 41, 56, 64, 72, 82, 93]
```

</details>

---

### 🔢 Number Theory

Number theory problems test mathematical reasoning and digit manipulation. These algorithms explore properties of integers — from divisibility rules to cycle detection in sequences.

| # | Algorithm | File | Time | Space | Difficulty | Description |
|:-:|-----------|------|:----:|:-----:|:----------:|-------------|
| 3 | **Happy Number** | `Happy_Number.java` | `O(log n)` | `O(1)` | 🟢 Easy | Repeatedly replaces a number with the sum of squares of its digits. If it reaches `1`, it's happy; if it reaches `4`, it enters an infinite cycle and is not happy. |
| 4 | **Harshad Number** | `Harshad_Number.java` | `O(d)` | `O(1)` | 🟢 Easy | Also called a **Niven number**. Checks if an integer is divisible by the sum of its own digits. Example: `18 → 1+8 = 9 → 18 ÷ 9 = 2 ✓` |
| 5 | **Missing Number** | `Missing_Number.java` | `O(n log n)` | `O(n)` | 🟢 Easy | Given an array of `n` distinct numbers from `[0, n]`, finds the one missing number. Sorts the array and scans for the gap. |
| 6 | **Perfect Number** | `Perfect_Number.java` | `O(n)` | `O(1)` | 🟢 Easy | A number is **perfect** if it equals the sum of its proper divisors (excluding itself). Example: `6 = 1 + 2 + 3 ✓`, `28 = 1 + 2 + 4 + 7 + 14 ✓` |
| 7 | **Ugly Number** | `Ugly_Number.java` | `O(log n)` | `O(1)` | 🟢 Easy | Checks if a number's **only** prime factors are `2`, `3`, or `5`. Repeatedly divides by these primes — if the result is `1`, it's ugly. Example: `30 = 2 × 3 × 5 ✓` |

<details>
<summary>📖 <strong>Example — Happy Number</strong></summary>

```
Input:  19
19 → 1² + 9² = 82
82 → 8² + 2² = 68
68 → 6² + 8² = 100
100 → 1² + 0² + 0² = 1 ✓
Output: Happy
```

</details>

<details>
<summary>📖 <strong>Example — Ugly Number</strong></summary>

```
Input:  30
30 ÷ 2 = 15
15 ÷ 3 = 5
5 ÷ 5 = 1 ✓
Output: Ugly

Input:  14
14 ÷ 2 = 7
7 is not divisible by 2, 3, or 5 ✗
Output: Not Ugly
```

</details>

---

### 🔤 Strings & Arrays

String and array problems are among the most common in coding interviews. These implementations cover pattern matching, character mapping, and two-pointer techniques.

| # | Algorithm | File | Time | Space | Difficulty | Description |
|:-:|-----------|------|:----:|:-----:|:----------:|-------------|
| 8 | **Isomorphic Strings** | `Isomorphic_Strings.java` | `O(n)` | `O(k)` | 🟢 Easy | Two strings are **isomorphic** if characters in one can be mapped to characters in the other with a consistent 1-to-1 mapping. Uses a `HashMap` for character mapping. Example: `egg ↔ add ✓`, `foo ↔ bar ✗` |
| 9 | **Palindrome** | `Palindrome.java` | `O(n)` | `O(n)` | 🟢 Easy | Checks if a string reads the same forwards and backwards using `StringBuilder.reverse()`. Example: `racecar ✓`, `hello ✗` |
| 10 | **Valid Palindrome** | `Valid_Palindrome.java` | `O(n)` | `O(n)` | 🟢 Easy | Enhanced palindrome check that **strips non-alphanumeric characters** and **ignores case** before comparing. Example: `"A man, a plan, a canal: Panama" ✓` |

<details>
<summary>📖 <strong>Example — Isomorphic Strings</strong></summary>

```
Input:  "egg"
        "add"
Mapping: {e→a, g→d}
Reconstructed: "add" == "add" ✓
Output: ISOMORPHIC

Input:  "foo"
        "bar"
Mapping: {f→b, o→a} — but 'o' maps to both 'a' and 'r'!
Output: NOT ISOMORPHIC
```

</details>

---

### 🔗 Linked List

Linked list problems test pointer manipulation and in-place modification skills. These are fundamental for understanding data structures beyond arrays.

| # | Algorithm | File | Time | Space | Difficulty | Description |
|:-:|-----------|------|:----:|:-----:|:----------:|-------------|
| 11 | **Remove Duplicates from Sorted List** | `Remove_Duplicates_from_Sorted_List.java` | `O(n)` | `O(k)` | 🟢 Easy | Iterates through a sorted array and collects only the **duplicate** values (elements appearing more than once), removing redundant copies. |

<details>
<summary>📖 <strong>Example — Remove Duplicates</strong></summary>

```
Input:  [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6]
Output: [1, 2, 3, 4, 5, 6]
```

</details>

---

## 📊 Complexity Overview

A quick-reference table of all algorithms with their time and space complexity:

| Algorithm | Best | Average | Worst | Space |
|-----------|:----:|:-------:|:-----:|:-----:|
| Bubble Sort | `Ω(n)` | `Θ(n²)` | `O(n²)` | `O(1)` |
| Quick Sort | `Ω(n log n)` | `Θ(n log n)` | `O(n²)` | `O(n)` |
| Happy Number | — | `O(log n)` | — | `O(1)` |
| Harshad Number | — | `O(d)` | — | `O(1)` |
| Missing Number | — | `O(n log n)` | — | `O(n)` |
| Perfect Number | — | `O(n)` | — | `O(1)` |
| Ugly Number | — | `O(log n)` | — | `O(1)` |
| Isomorphic Strings | — | `O(n)` | — | `O(k)` |
| Palindrome | — | `O(n)` | — | `O(n)` |
| Valid Palindrome | — | `O(n)` | — | `O(n)` |
| Remove Duplicates | — | `O(n)` | — | `O(k)` |

> `n` = input size &nbsp;·&nbsp; `d` = number of digits &nbsp;·&nbsp; `k` = number of unique characters/elements

---

## 🚀 Getting Started

### Prerequisites

- **Java 21+** — required for [JEP 463](https://openjdk.org/jeps/463) (implicitly declared classes & instance main methods)
- Verify your version:
  ```bash
  java --version
  ```

### Run Any Algorithm

```bash
# 🏃 Direct execution (Java 21+)
java Happy_Number.java

# 🔨 Or compile first, then run
javac Quick_Sort.java
java Quick_Sort
```

> **Tip:** Each file is completely self-contained — no external dependencies, no project setup required.

---

## 🎯 Why This Repository?

| | Benefit | Description |
|:-:|---------|-------------|
| 📖 | **Learn** | Understand core algorithms through concise, readable Java code |
| 🧠 | **Practice** | Strengthen problem-solving and logical thinking skills |
| 🎓 | **Prepare** | Get ready for university exams and technical interviews |
| ✍️ | **Reference** | Quick lookup for common algorithm patterns and complexities |
| ⚡ | **Run Instantly** | No setup needed — just `java FileName.java` and go |

---

## 📋 Roadmap

> Upcoming additions planned for this repository:

- [ ] **Sorting** — Merge Sort, Insertion Sort, Selection Sort
- [ ] **Searching** — Binary Search & Linear Search
- [x] ~~**Linked List** — Linked List operations~~
- [ ] **Data Structures** — Stack & Queue implementations
- [ ] **Recursion** — Recursion & Backtracking problems
- [ ] **Analysis** — Time & Space complexity analysis docs for each algorithm
- [ ] **Trees** — Binary Tree traversals (Inorder, Preorder, Postorder)
- [ ] **Graphs** — BFS, DFS, Dijkstra's Algorithm

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. 🍴 **Fork** the repository
2. 📝 **Create** a new algorithm file (one algorithm per file, keep it clean)
3. ✅ **Ensure** your code compiles with `java FileName.java`
4. 📬 **Submit** a pull request with a brief description

### Guidelines

- Use **Java 21+** features (implicitly declared classes)
- Keep each file **self-contained** and **runnable**
- Include sample input/output in comments when possible
- Follow the existing **naming convention**: `Algorithm_Name.java`

---

## 📜 License

This project is open for educational use. Use it, learn from it, share it. ❤️

---

<p align="center">
  <sub>Made with ☕ and curiosity</sub>
</p>
