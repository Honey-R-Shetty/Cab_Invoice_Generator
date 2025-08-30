

# Cab Invoice Generator 🛺💳

This repository contains a Java-based **Cab Invoice Generator system** developed to calculate fares for normal and premium rides, generate invoices for multiple rides, and manage user-based ride summaries. The project demonstrates the use of **Object-Oriented Programming (OOP) principles**, exception handling, and **JUnit testing**.

---

## Features 📂

1. **Single Ride Fare Calculation**

   * Computes fare based on distance and time.
   * Minimum fare applied for very short rides.
   * Exception handling for invalid input.

2. **Multiple Rides Invoice**

   * Generates invoice summaries with total rides, total fare, and average fare.

3. **Enhanced Invoice**

   * Overrides `equals()` in `InvoiceSummary` for easy object comparison in tests.

4. **User-Based Invoice Service**

   * Stores rides per user and retrieves invoice summaries.

5. **Premium Ride Support**

   * Higher fare calculation for premium rides.
   * Implemented without changing the original `Ride` constructor, ensuring backward compatibility.

---

## Project Structure 📁

```
CabInvoiceGenerator/
├─ src/
│  ├─ main/
│  │  └─ java/com/cab/
│  │     ├─ Ride.java
│  │     ├─ InvoiceGenerator.java
│  │     ├─ InvoiceSummary.java
│  │     └─ InvoiceService.java
│  └─ test/
│     └─ java/com/cab/
│        └─ InvoiceGeneratorTest.java
├─ .gitignore
└─ README.md
```

---

## Technologies Used 🛠️

* Java 8+
* JUnit 5
* OOP concepts: Classes, Encapsulation, Methods
* Exception handling with `try-catch`

---

## How to Run the Project 🏃‍♂

1. **Clone the Repository**

```bash
git clone <your-repo-url>
```

2. **Open in IDE**

   * Import the project into IntelliJ IDEA, Eclipse, or VS Code with Java support.

3. **Compile and Run**

   * Navigate to `src/main/java/com/cab/`.
   * Run your main application class or execute the JUnit tests in `src/test/java/com/cab/`.

4. **Run Tests**

   * Using Maven:

```bash
mvn test
```

* Or directly run `InvoiceGeneratorTest` in your IDE to validate all features.

---

## Example Usage 💻

```java
InvoiceGenerator invoice = new InvoiceGenerator();
Ride ride1 = new Ride(2.0, 5); // Normal ride
Ride ride2 = new Ride(1.5, 10); // Normal ride

InvoiceSummary summary = invoice.calculationInvoice(new Ride[]{ride1, ride2});
System.out.println("Total Fare: " + summary.getTotalFare());

Ride premiumRide = new Ride(3, 5);
double premiumFare = invoice.calculationFare(premiumRide, true); // Premium ride
System.out.println("Premium Fare: " + premiumFare);
```

---

## Author ✍️

**Honey Shetty**

GitHub: [Honey-R-Shetty]


