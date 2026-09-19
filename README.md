
# CSCI 6397 Software Testing Lab Three - Arkansas State Park Reservation Engine

A Maven/JUnit 5 project implementing a test suite for the StayPriceCalculator class and its caculateStayPrice method, a pricing function for the Arkansas State Park reservation system. Test design uses three techniques: Equivalence Partitioning, Boundary Value Analysis, and Decision Tables. Test design is documented in the '...Test Case Development...' document in the root of the repository.
## Authors

- [@jbaarsch-uca](https://github.com/jbaarsch-uca) {StayPriceCalculator}
- [@IsaiahSec](https://github.com/IsaiahSec) {StayPriceCalculatorTest}
## Prerequisites
-JDK 26
-Maven:
    Not required as a separate install if you're using IntelliJ IDEA, which bundles its own Maven distribution. 
## Installation

Clone the repository:

```git
git clone https://github.com/IsaiahSec/CSCISoftwareTestingLabThree.git
cd CSCISoftwareTestingLabThree
```

Open the project in IntelliJ IDEA (or any IDE with Maven support) - it should auto-detect pom.xml and resolve dependencies automatically
    
## Running Tests

From the terminal (if Maven is installed and on your PATH):

```bash
mvn test
```

From IntelliJ:

1. Open 'StayPriceCalculatorTest.java'
2. Click the green run arrow next to the class name, or any individual '@Test' or 'ParameterizedTest' method
3. Alternatively, use IntelliJ's Maven tool window and double-click the 'test' lifecycle phase
## Documentation

- [@Documentation](CSCISoftwareTestingLabThree%20Test%20Case%20Development%20-%20Stewart.pdf)

All test cases correspond directly to the TCIs documented in the test design files - see the inline // TCxx comments above each test method (or each @CsvSource row) to cross-reference
