# 📚 Java Library Management System

![Java](https://img.shields.io/badge/Java-8%2B-orange?logo=java)
![Collections](https://img.shields.io/badge/Collections-Framework-blueviolet)


A robust console-based library management system built with Java Collections that efficiently handles book cataloging, member management, and loan tracking.

<div align="center">
  <img src="https://media.giphy.com/media/LHZyixOnHwDDy/giphy.gif" width="300" alt="library animation">
</div>

## ✨ Key Features

| Feature | Description |
|---------|-------------|
| **📖 Book Catalog** | Add, view and manage book inventory |
| **👥 Member System** | Unique ID registration and validation |
| **🔄 Loan Tracking** | Monitor borrowed books and due dates |
| **⏳ FIFO Returns** | Fair return processing system |
| **🛡️ Data Protection** | Encapsulated design prevents data corruption |


🏗️ Project Structure

 - 📁src/
  - main/
    - java/
    - 📄 Member.java
    - 📄 BookReturnRequest.java
    - 📄 Library.java
    - 📄 LibrarySystem.java


## 🛠️ Tech Stack

- **Core Java** (v8+)
- **Collections Framework**
  - `List<Book>` - Available books inventory
  - `Set<String>` - Unique member IDs
  - `Map<Integer, String>` - Book-borrower mapping
  - `Queue<BookReturnRequest>` - Pending returns

## 🚀 Getting Started

### Prerequisites
- Java JDK 8 or higher
- Git (optional)

