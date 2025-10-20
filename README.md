# 🛸 Starfleet Command Simulation

> *A Java simulation exploring OOP design through the command of a Starfleet fleet.*

> *“In the vast silence of space, someone has to keep the fleet running.”*  
> Welcome to the **Starfleet Command Simulation**, where object-oriented programming meets intergalactic chaos.

---

## 🚀 Mission Overview

This project simulates the **management of a futuristic space fleet**, built in Java using the power of **inheritance, polymorphism, and abstraction**.  
You’ll command a mix of ships, crew members, and not-so-friendly Cylons — all working (or rebelling) under your digital command.

The simulation models:
- Starship hierarchies 👩‍✈️  
- Crew organization 🧑‍🚀  
- Fleet-wide statistics and mission reports 📊  

---

## 🪐 Key Features

- **👨‍🚀 Crew Management**  
  Organize humans, officers, and even rogue Cylon robots. Each role plays a unique part in fleet operations.

- **🚀 Fleet Dynamics**  
  Deploy and manage diverse ships like *Fighters*, *Bombers*, *Transport Ships*, *Stealth Cruisers*, *Cylon Raiders*, and *Colonial Vipers*.  
  Every ship has different combat power, maintenance costs, and quirks.

- **📊 Report Generation**  
  View comprehensive fleet reports — including firepower analysis, crew listings, and total maintenance costs.

---
## 🧠 Tech Stack
- **Language:** Java 11+
- **Paradigm:** Object-Oriented Programming (OOP)
- **Concepts Used:** Inheritance, Polymorphism, Abstraction, Interfaces
---

## 🧩 Project Structure
- `src/il/ac/tau/cs/sw1/ex9/starfleet/`: Contains all the Java source files for the simulation.
    - `StarfleetManager.java`: Core logic for managing the fleet.
    - `StarfleetManagerTester.java`: Entry point (`main` method) — runs the simulation.
    - Other classes: Represent different ship types, crew members, and utilities.



---

## ⚙️ Getting Started

### Prerequisites
- ☕ **Java 11+**
- 🧭 **Git**

### Installation
```bash
git clone https://github.com/AdanIsMe/Starfleet-Command-Simulation.git
cd hw9-AdanIsMe-main
```

### Run the Simulation
```bash
# 1. Create an output folder (if it doesn't exist)
mkdir -p bin

# 2. Compile all Java source files
javac -d bin src/il/ac/tau/cs/sw1/ex9/starfleet/*.java

# 3. Launch the Starfleet simulation via the tester
java -cp bin il.ac.tau.cs.sw1.ex9.starfleet.StarfleetManagerTester
```
>💡 Tip: The simulation’s main entry point is StarfleetManagerTester.java,
which initializes and runs the fleet management logic defined in StarfleetManager.java.

---
## 🛰 Example Output
Running the simulation produces a detailed **Starfleet Command Report**, showcasing the results of the fleet analysis.  
The output includes:

- **🚀 Sorted Fleet Overview:**  
  A list of all ships in the fleet, ordered by firepower and commission year.

- **🧮 Ship Statistics:**  
  Maintenance costs, crew counts, weapon arrays, and other performance metrics for each ship.

- **🧰 Weapon Inventory:**  
  A compiled list of all unique weapon types used across the fleet.

- **🧑‍✈️ Officer Assignments:**  
  The highest-ranking officer assigned to each ship, along with their rank and ID.

- **📈 Rank Popularity Report:**  
  Officer ranks displayed in ascending order of frequency across the fleet.

- **🌌 Fleet Totals:**  
  Summary statistics such as total crew members, average officer age, and overall maintenance cost.

> 💫 Together, these results paint a complete picture of Starfleet’s operational status —  
> from individual ship readiness to overall command efficiency.
---

## 🖖 Acknowledgements

This project was developed as part of the **Software 1** course at **Tel Aviv University**.  
Special thanks to my professor for her guidance — and to every sci-fi series that made us believe in the beauty of well-structured code.