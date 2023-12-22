# Sort Student List based on Grade - Spring Boot
=============================================

This Spring Boot project provides implementations of three sorting algorithms (Bubble Sort, Heap Sort, and Merge Sort) to sort a list of students based on their grades.

## Table of Contents
-----------------
1. Technologies Used
2. Project Structure
3. Sorting Algorithms
    - Bubble Sort
    - Heap Sort
    - Merge Sort
4. How to Run
5. Sample API Endpoints
6. Contributing
7. License

# Technologies Used
-----------------
- Java
- Spring Boot
- Maven (for dependency management)

# Project Structure
-----------------
The project structure follows a standard Maven Spring Boot application structure.
 ```bash
springboot-sort-students/
|-- src/
|   |-- main/
|       |-- java/
|       |   `-- com/tech/org/studentsorting/
|       |       |-- controller/
|       |       |-- model/
|       |       |-- service/imp;
|       |       `-- SpringBootSortStudentsApplication.java
|       `-- resources/
|           |-- application.properties
|           `-- templates/
|               |-- index.html
|               `-- ...
`-- pom.xml

Sorting Algorithms
------------------
### Bubble Sort
Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

### Heap Sort
Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure to build a max-heap and then swaps the root element with the last element, finally reducing the heap size and repeating the process.

### Merge Sort
Merge Sort is an efficient, stable, and comparison-based sorting algorithm that divides the unsorted list into n sub-lists, each containing one element, and then repeatedly merges sub-lists to produce new sorted sub-lists until there is only one sub-list remaining.

How to Run
----------
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-sorting-app.git   
   
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-sorting-app.git   


### Merge Sort
Merge Sort is an efficient,
Navigate to the project directory:

### Copy code
 ```bash
cd springboot-sort-students

###  Build the project:
 ```bash
mvn clean install -Dmaven.test.skip=true

###  Run the Spring Boot application:

mvn spring-boot:run
Sample API Endpoints
The application exposes the following API endpoints for sorting students:

Sort: POST /api/sort/

Sample Request:
curl http://localhost:8080/api/sort/

### Sample Response:

json
Copy code
[
  {
  "file": "Sort-text.txt",
  "algorithm": "bubble",
  "students": [
    {
      "name": "Student1",
      "grade": 8.5
    },
    {
      "name": "Student2",
      "grade": 6.5
    },
    {
      "name": "Student3",
      "grade": 5
    }
  ]
}
]
### Contributing
Feel free to contribute to this project. Fork the repository, make your changes, and submit a pull request.



Make sure to replace placeholders like `your-username` and customize the
