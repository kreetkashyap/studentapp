src
├── main
│ ├── java
│ │ └── com.example.studentapp
│ │ ├── controller
│ │ ├── service
│ │ ├── repository
│ │ └── entity
│ │
│ ├── resources
│ │ ├── application.properties
│ │
│ └── webapp
│ └── WEB-INF
│ └── jsp
│ ├── students.jsp
│ ├── add-student.jsp
│ └── error-page.jsp
│
└── test
└── java
└── com.example.studentapp
├── StudentServiceTest.java
└── StudentRepositoryTest.java

## Environment Setup

This project uses environment variables for database configuration.

DB_PASSWORD must be set in the system environment before running the application.

Example:
export DB_PASSWORD=your_mysql_password
