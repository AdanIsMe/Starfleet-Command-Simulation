# Starfleet Command Simulation Project

## Project Overview
This project is a simulation software for managing a fleet of spaceships. Developed using Java, it implements various object-oriented programming concepts such as inheritance, polymorphism, and abstraction. The project involves creating classes and interfaces to represent different types of spaceships and crew members, and generating reports to display fleet information.

## Features
- **Crew Management:** Handle different types of crew members including regular crew, officers, and Cylon robots.
- **Fleet Management:** Represent various types of spaceships such as Transport Ships, Fighters, Bombers, Stealth Cruisers, Cylon Raiders, and Colonial Vipers.
- **Report Generation:** Calculate and display data on fleet maintenance costs, firepower, and crew details.

## Project Structure
- `src/`: Contains the source code of the project.
  - `interfaces/`: Includes all interfaces used in the project.
  - `classes/`: Includes all classes implementing the interfaces and representing various entities.
  - `main/`: The main entry point for the simulation.

## Getting Started
### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Git

### Installation
```sh
git clone https://github.com/AdanIsMe/Starfleet-Command-Simulation.git
cd Starfleet-Command-Simulation

### Running the Application

1. Compile the source code:
   ```sh
   javac -d bin src/main/*.java src/interfaces/*.java src/classes/*.java
2. Run the application:
   java -cp bin main.Main

## Acknowledgements
This project was developed as part of the Software 1 course at Tel-Aviv University. Special thanks to my professor for her support and guidance.

