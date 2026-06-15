# Inventory Management System

## Overview

This project demonstrates the use of the Java Collections Framework by implementing a simple Inventory Management System. It showcases how List, Set, and Map can be used to manage products, categories, and stock information efficiently.

## Learning Objectives

- Understand the purpose of the Java Collections Framework.
- Learn how to use List for ordered collections.
- Learn how to use Set for storing unique elements.
- Learn how to use Map for key-value pair storage.
- Apply collections in a real-world inventory management scenario.

## Technologies Used

- Java
- Java Collections Framework
  - ArrayList
  - HashSet
  - HashMap

## Features

### Product Management (List)

- Stores products in the order they are added.
- Allows duplicate entries if needed.

### Category Management (Set)

- Stores unique product categories.
- Automatically prevents duplicate categories.

### Stock Management (Map)

- Associates each product with its available quantity.
- Enables quick stock lookup using the product name.

## Project Structure

```text
InventoryManagement/
│
├── src/
│   └── InventoryManagement.java
│
└── README.md
```

## Code Example

```java
List<String> productList = new ArrayList<>();
productList.add("Laptop");
productList.add("Mouse");

Set<String> categories = new HashSet<>();
categories.add("Electronics");

Map<String, Integer> stock = new HashMap<>();
stock.put("Laptop", 10);
stock.put("Mouse", 50);
```

## Sample Output

```text
Products: [Laptop, Mouse, Keyboard]

Categories: [Electronics, Accessories]

Stock Details:
Laptop -> 10
Mouse -> 50
Keyboard -> 20
```

## Collections Used

| Collection | Implementation | Purpose |
|------------|---------------|----------|
| List | ArrayList | Store products in order |
| Set | HashSet | Store unique categories |
| Map | HashMap | Store product stock quantities |

## Key Concepts Demonstrated

- Collection Interfaces
- ArrayList Operations
- HashSet Operations
- HashMap Operations
- Iterating through Collections
- Key-Value Data Management

## Future Improvements

- Add product price management.
- Implement product search functionality.
- Store inventory data in files or a database.
- Create a menu-driven console application.
- Add update and delete product features.

## Author

Created as part of Java Collections Framework learning (Day 5).
