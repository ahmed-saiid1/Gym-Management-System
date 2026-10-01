# Gym Management System

A console-based Gym Management System implemented in core Java. The application models day-to-day gym management activities and organizes them across three primary roles: **Admin**, **Coach**, and **Customer**. It tracks customer details, coach assignments, subscriptions, membership plans, gym equipment, and historical InBody biometric records.

---

## Table of Contents

- [Project Overview](#project-overview)
- [User Roles & Features](#user-roles--features)
  - [Customer](#customer)
  - [Coach](#coach)
  - [Admin](#admin)
- [System Architecture & Class Design](#system-architecture--class-design)
- [Application Workflow](#application-workflow)
- [Data Management](#data-management)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
  - [Prerequisites](#prerequisites)
  - [Compilation & Execution](#compilation--execution)
- [Testing](#testing)
- [Screenshots](#screenshots)
- [Future Improvements](#future-improvements)
- [Authors](#authors)

---

## Project Overview

The Gym Management System is designed to demonstrate Object-Oriented Programming (OOP) concepts in Java—such as inheritance, encapsulation, composition, and collection handling—within a command-line interface. 

The system centralizes operational data, allowing administrators to configure assets, personnel, and memberships, while offering dedicated functional views for coaches and gym members.

---

## User Roles & Features

### Customer
Members access features relevant to their fitness profile and membership status:
- **View Coaches:** Browse active coaches, their contact information, and assigned specialties.
- **View Equipment:** Inspect gym machines/gear and their current available quantities.
- **View Subscription:** Check the active membership plan, assigned coach, and validity period.
- **InBody Tracking:**
  - View the most recent InBody biometric metrics.
  - Compute and view the weight difference between the latest record and the preceding measurement.

### Coach
Coaches have visibility over their trainees:
- **Assigned Customers:** List all customers currently assigned under the coach's care.
- **Customer Profiles:** Review customer demographic and personal details.
- **Biometric History:** Inspect InBody logs for assigned customers to evaluate physical progress.

### Admin
Administrative operators manage the core entities of the gym:
- **Customer Management:**
  - Display all registered customers.
  - Register new customers.
  - Update customer details.
  - Remove/delete customer records.
- **Coach Management:**
  - Display all gym coaches.
  - Register new coaches.
- **Subscription Management:**
  - Create new customer subscriptions.
  - Update subscription details and assign/reassign coaches.
  - Browse subscription history.
  - Generate an operational revenue summary based on subscription fees.
- **Equipment Management:**
  - View full equipment inventory.
  - Add new gym equipment items.
  - Update equipment metadata and available inventory counts.

---

## System Architecture & Class Design

The project is structured around 10 core classes modeling gym domain entities:

| Class | Responsibility | Key Attributes / Relationships |
|---|---|---|
| `Main` | Application entry point. Houses the console execution loop, role-selection menus, and coordinates user input with gym operations. | `public static void main(String[] args)`, menu controller methods |
| `GYM` | Top-level operational controller. Holds in-memory collections of customers, coaches, subscriptions, and equipment. | Contains lists of `Customer`, `Coach`, `Equipment`, `Subscription` |
| `Personalinfo` | Base/reusable class containing shared demographic attributes. | `name`, `id`, `gender`, `phone`, `email` |
| `Customer` | Models a gym member. Extends or composes `Personalinfo`. Stores a collection of InBody assessments. | `inBodyHistory`, `subscriptionRef`, customer-specific attributes |
| `Coach` | Models a trainer. Extends or composes `Personalinfo`. Tracks assigned clients. | `specialty`, `assignedCustomers` |
| `Subscription` | Associates a `Customer`, an optional assigned `Coach`, and a specific `MembershipPlan`. | `customer`, `coach`, `membershipPlan`, `status` |
| `MembershipPlan` | Defines duration, monthly pricing, and billing tiers. | `startDate`, `monthlyPlan`, `numberOfMonths`, `monthlyPrice` |
| `Equipment` | Represents fitness apparatus and gym gear. | `name`, `code`, `quantity` |
| `InBody` | Stores biometric evaluation metrics for physical progress tracking. | `weight`, `height`, `bodyFatMass`, `minerals`, `totalBodyWater`, `protein`, `date` |
| `Date` | Utility entity for date handling (day, month, year) across memberships and measurements. | `day`, `month`, `year` |

---

## Application Workflow

1. **Launch:** The application starts execution from `Main.main()`.
2. **Role Selection:** The main console menu prompts the user to select an operating mode (`Admin`, `Coach`, or `Customer`).
3. **Execution:**
   - **Admin Mode:** Grants full CRUD access to customers, coaches, equipment, and subscriptions.
   - **Coach Mode:** Filters and shows only customers assigned to the selecting coach, along with their biometric data.
   - **Customer Mode:** Requires entering customer identification to pull related subscription and InBody data.
4. **Navigation:** Sub-menus handle individual operations, returning to the parent menu upon completion until the user explicitly exits the application.

> *Note:* The application uses direct role/ID selection menus for access; it does not implement cryptographic credential verification or session-based authentication.

---

## Data Management

- **Storage:** All records (customers, coaches, subscriptions, equipment, and InBody logs) are managed in-memory using standard **Java Collections** (`ArrayList`, etc.) within the runtime lifecycle.
- **Persistence:** There is **no persistent database or external file storage** attached in this version.
- **Data Lifecycle:** When the program exits or the JVM terminates, **all runtime changes, additions, and updates reset**. Initializing test data may be populated programmatically at startup.

---

## Technologies Used

- **Programming Language:** Java (JDK 8 or higher)
- **Data Structures:** Java Collections Framework (`java.util.List`, `java.util.ArrayList`)
- **I/O:** Standard Console Input/Output (`java.util.Scanner`, `System.out`)

*No external libraries, build systems (Maven/Gradle), or database drivers are required.*

---

## Project Structure

```text
GymManagementSystem/
├── src/
│   ├── Coach.java
│   ├── Customer.java
│   ├── Date.java
│   ├── Equipment.java
│   ├── GYM.java
│   ├── InBody.java
│   ├── Main.java
│   ├── MembershipPlan.java
│   ├── Personalinfo.java
│   └── Subscription.java
└── README.md
```

### File Summaries
- `Main.java`: Contains console UI flows, switch-case menus, and application bootstrap logic.
- `GYM.java`: Aggregates the lists of entities and coordinates CRUD interactions across classes.
- `Personalinfo.java`: Encapsulates common contact and identity fields shared by users.
- `Customer.java`: Manages customer data and sequential InBody measurement logs.
- `Coach.java`: Manages coach information and client tracking.
- `Subscription.java`: Links customers, membership options, and coaches.
- `MembershipPlan.java`: Computes and encapsulates subscription durations and pricing models.
- `Equipment.java`: Maintains gym equipment names, identifiers, and stock counts.
- `InBody.java`: Holds biometric values for body composition tracking.
- `Date.java`: Custom data object modeling calendar dates for subscriptions and assessments.

---

## How to Run

### Prerequisites
- **Java Development Kit (JDK):** Version 8 or higher installed.
- Verify installation:
  ```bash
  javac -version
  java -version
  ```

### Compilation & Execution

#### Option 1: Compiling from the Root Folder (Direct Source Files)
If the `.java` files are located directly inside `src/`:

1. Navigate to the project root directory:
   ```bash
   cd GymManagementSystem
   ```
2. Compile all Java source files into an `out` directory:
   ```bash
   javac -d out src/*.java
   ```
3. Run the application:
   - If classes do not use a package declaration:
     ```bash
     java -cp out Main
     ```
   - If classes use a package declaration (e.g., `package gym;`), run using the fully qualified class name:
     ```bash
     java -cp out gym.Main
     ```

#### Option 2: Compiling Inside the `src` Directory
```bash
cd src
javac *.java
java Main
```

---

## Testing

- Testing for this project is performed manually via console input verification.
- To verify system behavior:
  1. Launch the system and select **Admin** to create test equipment, coaches, and customers.
  2. Create a **Subscription** binding a customer to a coach and a membership plan.
  3. Switch to **Coach** role to verify that the newly assigned customer appears in the list.
  4. Switch to **Customer** role to inspect subscription validity, equipment counts, and InBody delta calculations.
- *Automated unit testing frameworks (e.g., JUnit) are not bundled in this release.*

---

## Screenshots

<!-- Add actual screenshots to an assets/ folder and update paths below -->

| Menu / Operation | Preview Placeholder |
|---|---|
| **Main Role Selection** | `![Main Menu Placeholder](assets/main_menu.png)` |
| **Admin Operations** | `![Admin Menu Placeholder](assets/admin_menu.png)` |
| **Coach Trainee View** | `![Coach Menu Placeholder](assets/coach_menu.png)` |
| **Customer Progress View** | `![Customer Menu Placeholder](assets/customer_menu.png)` |
| **Sample Revenue / Equipment Report** | `![Report Placeholder](assets/report_sample.png)` |

---

## Future Improvements

- [ ] **Persistent Storage:** Integrate relational database persistence (e.g., SQLite, PostgreSQL via JDBC) or file persistence (JSON/CSV serialization).
- [ ] **Authentication & Security:** Implement secure role-based login with hashed passwords.
- [ ] **Graphical User Interface (GUI):** Transition from console UI to a desktop interface (JavaFX or Swing) or web front-end.
- [ ] **Input Validation & Exception Handling:** Add strict regex-based phone/email validation and input bounds checking.
- [ ] **Expanded Financial Reporting:** Export analytical revenue breakdowns and membership expiration reports to PDF or Excel.

---

## Authors

- **Project Contributor(s):** [Your Name / Team Members]
- **Institution:** [Your University / Department Name]
- **Course:** [Course Name / Object-Oriented Programming]