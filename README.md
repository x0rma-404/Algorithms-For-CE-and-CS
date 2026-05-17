<div align="center">
  <img src="https://img.icons8.com/external-flaticons-flat-flat-icons/128/external-algorithm-computer-programming-flaticons-flat-flat-icons.png" alt="logo" width="100"/>
  <h1>🧮 Algorithms for CE & CS</h1>
  <a href="https://git.io/typing-svg"><img src="https://readme-typing-svg.demolab.com?font=Fira+Code&weight=600&size=22&pause=1000&color=4361EE&center=true&vCenter=true&width=600&lines=A+curated+collection+of+fundamental+algorithms;Built+for+CE+%26+CS+students;Implemented+in+Java+21%2B" alt="Typing SVG" /></a>
</div>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java_21+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Problems_Solved-16-4361EE?style=for-the-badge" alt="Problems"/>
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
│   ├── Insertion_Sort.java      # Build sorted array one at a time O(n²)
│   ├── Merge_Sort.java          # Divide-and-conquer O(n log n) sort
│   ├── Quick_Sort.java          # Divide-and-conquer O(n log n) sort
│   └── Selection_Sort.java      # In-place comparison sort O(n²)
│
├── 🔢 Number Theory
│   ├── Happy_Number.java        # Sum-of-squares cycle detection
│   ├── Harshad_Number.java      # Divisibility by digit sum
│   ├── Missing_Number.java      # Find gap in sequence [0, n]
│   ├── Perfect_Number.java      # Sum of proper divisors check
│   ├── Power_of_Four.java       # Repeated division by 4
│   └── Ugly_Number.java         # Prime factor restriction (2, 3, 5)
│
├── 🔤 Strings & Arrays
│   ├── Isomorphic_Strings.java  # Character-mapping equivalence
│   ├── Palindrome.java          # Forward-backward equality
│   ├── Reverse_String.java      # Two-pointer in-place reversal
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

<p align="center">
  <img src="https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif" alt="Merge Sort Animation" width="280" style="border-radius: 8px;"/>
</p>

Sorting algorithms arrange elements in a specific order. These implementations demonstrate two fundamental approaches — the simplicity of comparison-based swapping and the efficiency of divide-and-conquer.

| # | Algorithm | File | Time | Space | Difficulty | Approach |
|:-:|-----------|------|:----:|:-----:|:----------:|----------|
| 1 | **Bubble Sort** | `Buble_Sort.java` | `O(n²)` | `O(1)` | 🟢 Easy | Repeatedly compares and swaps adjacent elements until the array is sorted. Uses a nested loop — outer loop for passes, inner loop for comparisons. |
| 2 | **Insertion Sort** | `Insertion_Sort.java` | `O(n²)` | `O(1)` | 🟢 Easy | Builds the final sorted array one item at a time. Efficient for small or nearly sorted datasets. |
| 3 | **Merge Sort** | `Merge_Sort.java` | `O(n log n)` | `O(n)` | 🟡 Medium | Divides the list into n sublists, each containing one element, then repeatedly merges sublists. |
| 4 | **Quick Sort** | `Quick_Sort.java` | `O(n log n)` | `O(n)` | 🟡 Medium | Selects the middle element as pivot, partitions into three lists (`left`, `mid`, `right`), and recursively sorts. Uses the Lomuto-style three-way partition. |
| 5 | **Selection Sort** | `Selection_Sort.java` | `O(n²)` | `O(1)` | 🟢 Easy | Divides the input list into a sorted sublist and an unsorted sublist, repeatedly selecting the minimum. |

<details>
<summary>📖 <strong>Example — Bubble Sort</strong></summary>

```
Input:  [34, 12, 78, 5, 61, 23, 9, 45, 87, 3]

Pass 1: [12, 34, 5, 61, 23, 9, 45, 78, 3, 87]  ← 87 bubbles to end
Pass 2: [12, 5, 34, 23, 9, 45, 61, 3, 78, 87]  ← 78 in place
Pass 3: [5, 12, 23, 9, 34, 45, 3, 61, 78, 87]  ← 61 in place
  ...continues until fully sorted...

Output: [3, 5, 9, 12, 23, 34, 45, 61, 78, 87]
```

</details>

<details>
<summary>📖 <strong>Example — Quick Sort</strong></summary>

```
Input:  [72, 15, 93, 41, 8, 56, 27, 64, 39, 82]

Step 1: pivot = 56
        left  = [15, 41, 8, 27, 39]
        mid   = [56]
        right = [72, 93, 64, 82]
Step 2: Recursively sort left and right...

Output: [8, 15, 27, 39, 41, 56, 64, 72, 82, 93]
```

</details>

<details>
<summary>📖 <strong>Example — Insertion Sort</strong></summary>

```
Input:  [34, 12, 78, 5]

Step 1: [12, 34, 78, 5]
Step 2: [12, 34, 78, 5]
Step 3: [5, 12, 34, 78]

Output: [5, 12, 34, 78]
```

</details>

<details>
<summary>📖 <strong>Example — Merge Sort</strong></summary>

```
Input:  [34, 12, 78, 5]

Split: [34, 12] and [78, 5]
Split: [34], [12] and [78], [5]
Merge: [12, 34] and [5, 78]
Merge: [5, 12, 34, 78]

Output: [5, 12, 34, 78]
```

</details>

<details>
<summary>📖 <strong>Example — Selection Sort</strong></summary>

```
Input:  [34, 12, 78, 5]

Step 1: find min 5, swap with 34 -> [5, 12, 78, 34]
Step 2: min is 12, no swap -> [5, 12, 78, 34]
Step 3: find min 34, swap with 78 -> [5, 12, 34, 78]

Output: [5, 12, 34, 78]
```

</details>

---

### 🔢 Number Theory

Number theory problems test mathematical reasoning and digit manipulation. These algorithms explore properties of integers — from divisibility rules to cycle detection in sequences.

| # | Algorithm | File | Time | Space | Difficulty | Description |
|:-:|-----------|------|:----:|:-----:|:----------:|-------------|
| 6 | **Happy Number** | `Happy_Number.java` | `O(log n)` | `O(1)` | 🟢 Easy | Repeatedly replaces a number with the sum of squares of its digits. If it reaches `1`, it's happy; if it reaches `4`, it enters an infinite cycle and is not happy. |
| 7 | **Harshad Number** | `Harshad_Number.java` | `O(d)` | `O(1)` | 🟢 Easy | Also called a **Niven number**. Checks if an integer is divisible by the sum of its own digits. Example: `18 → 1+8 = 9 → 18 ÷ 9 = 2 ✓` |
| 8 | **Missing Number** | `Missing_Number.java` | `O(n log n)` | `O(n)` | 🟢 Easy | Given an array of `n` distinct numbers from `[0, n]`, finds the one missing number. Sorts the array and scans for the gap. |
| 9 | **Perfect Number** | `Perfect_Number.java` | `O(n)` | `O(1)` | 🟢 Easy | A number is **perfect** if it equals the sum of its proper divisors (excluding itself). Example: `6 = 1 + 2 + 3 ✓`, `28 = 1 + 2 + 4 + 7 + 14 ✓` |
| 10 | **Power of Four** | `Power_of_Four.java` | `O(log₄ n)` | `O(1)` | 🟢 Easy | Checks if a number is a power of `4` by repeatedly dividing by `4`. If the result is `1`, it's a power of four. Example: `64 = 4³ ✓`, `12 ✗` |
| 11 | **Ugly Number** | `Ugly_Number.java` | `O(log n)` | `O(1)` | 🟢 Easy | Checks if a number's **only** prime factors are `2`, `3`, or `5`. Repeatedly divides by these primes — if the result is `1`, it's ugly. Example: `30 = 2 × 3 × 5 ✓` |

<details>
<summary>📖 <strong>Example — Happy Number</strong></summary>

```
Input:  19
19 → 1² + 9² = 82
82 → 8² + 2² = 68
68 → 6² + 8² = 100
100 → 1² + 0² + 0² = 1 ✓
Output: Happy

Input:  2
2 → 2² = 4  ← reached 4, enters infinite cycle
Output: Not Happy
```

</details>

<details>
<summary>📖 <strong>Example — Harshad Number</strong></summary>

```
Input:  18
Digit sum: 1 + 8 = 9
18 ÷ 9 = 2 (no remainder) ✓
Output: Harshad

Input:  14
Digit sum: 1 + 4 = 5
14 ÷ 5 = 2.8 (has remainder) ✗
Output: Not Harshad
```

</details>

<details>
<summary>📖 <strong>Example — Missing Number</strong></summary>

```
Input:  [9, 6, 4, 2, 3, 5, 7, 0, 1]
Sorted: [0, 1, 2, 3, 4, 5, 6, 7, 9]
Scan:    0=0 ✓, 1=1 ✓, 2=2 ✓, ... 7=7 ✓, 8≠9 ✗
Output: 8  ← the missing number
```

</details>

<details>
<summary>📖 <strong>Example — Perfect Number</strong></summary>

```
Input:  28
Divisors of 28: 1, 2, 4, 7, 14
Sum: 1 + 2 + 4 + 7 + 14 = 28 ✓
Output: Perfect

Input:  12
Divisors of 12: 1, 2, 3, 4, 6
Sum: 1 + 2 + 3 + 4 + 6 = 16 ≠ 12 ✗
Output: Not Perfect
```

</details>

<details>
<summary>📖 <strong>Example — Power of Four</strong></summary>

```
Input:  64
64 ÷ 4 = 16
16 ÷ 4 = 4
4 ÷ 4 = 1 ✓
Output: 4 un quvvetidir (Power of 4)

Input:  12
12 ÷ 4 = 3 (remainder ≠ 0) ✗
Output: 4 un quvveti deyil (Not a power of 4)
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
| 12 | **Isomorphic Strings** | `Isomorphic_Strings.java` | `O(n)` | `O(k)` | 🟢 Easy | Two strings are **isomorphic** if characters in one can be mapped to characters in the other with a consistent 1-to-1 mapping. Uses a `HashMap` for character mapping. Example: `egg ↔ add ✓`, `foo ↔ bar ✗` |
| 13 | **Palindrome** | `Palindrome.java` | `O(n)` | `O(n)` | 🟢 Easy | Checks if a string reads the same forwards and backwards using `StringBuilder.reverse()`. Example: `racecar ✓`, `hello ✗` |
| 14 | **Reverse String** | `Reverse_String.java` | `O(n)` | `O(1)` | 🟢 Easy | Reverses a `char[]` **in-place** using the two-pointer technique — swapping characters from both ends toward the center. Example: `hello → olleh` |
| 15 | **Valid Palindrome** | `Valid_Palindrome.java` | `O(n)` | `O(n)` | 🟢 Easy | Enhanced palindrome check that **strips non-alphanumeric characters** and **ignores case** before comparing. Example: `"A man, a plan, a canal: Panama" ✓` |

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

<details>
<summary>📖 <strong>Example — Palindrome</strong></summary>

```
Input:  "racecar"
Reversed: "racecar"
"racecar" == "racecar" ✓
Output: PALINDROME

Input:  "hello"
Reversed: "olleh"
"hello" ≠ "olleh" ✗
Output: NOT PALINDROME
```

</details>

<details>
<summary>📖 <strong>Example — Reverse String</strong></summary>

```
Input:  ['h', 'e', 'l', 'l', 'o']

Step 1: swap s[0]↔s[4] → ['o', 'e', 'l', 'l', 'h']
Step 2: swap s[1]↔s[3] → ['o', 'l', 'l', 'e', 'h']
Center reached — done.

Output: ['o', 'l', 'l', 'e', 'h']  →  "olleh"
```

</details>

<details>
<summary>📖 <strong>Example — Valid Palindrome</strong></summary>

```
Input:  "A man, a plan, a canal: Panama"
Cleaned: "amanaplanacanalpanama"
Reversed: "amanaplanacanalpanama"
Match ✓
Output: Valid Palindrome

Input:  "race a car"
Cleaned: "raceacar"
Reversed: "racaecar"
No match ✗
Output: Not Valid Palindrome
```

</details>

---

### 🔗 Linked List

Linked list problems test pointer manipulation and in-place modification skills. These are fundamental for understanding data structures beyond arrays.

| # | Algorithm | File | Time | Space | Difficulty | Description |
|:-:|-----------|------|:----:|:-----:|:----------:|-------------|
| 16 | **Remove Duplicates from Sorted List** | `Remove_Duplicates_from_Sorted_List.java` | `O(n)` | `O(k)` | 🟢 Easy | Iterates through a sorted array and collects only the **duplicate** values (elements appearing more than once), removing redundant copies. |

<details>
<summary>📖 <strong>Example — Remove Duplicates</strong></summary>

```
Input:  [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6]

Scan: 1==1 → add 1 | 2==2 → add 2 | 3==3 → add 3
      4==4 → add 4 | 5==5 → add 5 | 6==6 → add 6

Output: [1, 2, 3, 4, 5, 6]
```

</details>

---

## 📊 Complexity Overview

A quick-reference table of all algorithms with their time and space complexity:

| Algorithm | Best | Average | Worst | Space |
|-----------|:----:|:-------:|:-----:|:-----:|
| Bubble Sort | `Ω(n)` | `Θ(n²)` | `O(n²)` | `O(1)` |
| Insertion Sort | `Ω(n)` | `Θ(n²)` | `O(n²)` | `O(1)` |
| Merge Sort | `Ω(n log n)` | `Θ(n log n)` | `O(n log n)` | `O(n)` |
| Quick Sort | `Ω(n log n)` | `Θ(n log n)` | `O(n²)` | `O(n)` |
| Selection Sort | `Ω(n²)` | `Θ(n²)` | `O(n²)` | `O(1)` |
| Happy Number | — | `O(log n)` | — | `O(1)` |
| Harshad Number | — | `O(d)` | — | `O(1)` |
| Missing Number | — | `O(n log n)` | — | `O(n)` |
| Perfect Number | — | `O(n)` | — | `O(1)` |
| Ugly Number | — | `O(log n)` | — | `O(1)` |
| Power of Four | — | `O(log₄ n)` | — | `O(1)` |
| Isomorphic Strings | — | `O(n)` | — | `O(k)` |
| Palindrome | — | `O(n)` | — | `O(n)` |
| Reverse String | — | `O(n)` | — | `O(1)` |
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

- [x] ~~**Sorting** — Merge Sort, Insertion Sort, Selection Sort~~
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
  <img src="https://visitor-badge.laobi.icu/badge?page_id=x0rma-404.Algorithms-For-CE-and-CS&left_color=4361EE&right_color=ED8B00" alt="Visitor Badge" /><br>
  <sub>Made with ☕ and curiosity</sub>
</p>
