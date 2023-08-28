# Cucumber Framework with Java and Selenium

This repository demonstrates the usage of the Cucumber framework with Java and Selenium for automated testing of web applications.
 Cucumber is a popular BDD (Behavior-Driven Development) tool that allows you to define application behavior in a natural language format.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Project Structure](#project-structure)
- [Writing Features](#writing-features)
- [Running Tests](#running-tests)
- [Reports](#reports)

## Introduction

This repository provides a basic setup for automating web application testing using Cucumber, Java, and Selenium. Cucumber allows you to write feature files using Gherkin language, which provides a structured and human-readable  way to describe application behavior. Step definitions written in Java are associated with these features to perform actions and assertions on the application.

## Prerequisites

Before setting up and running the project, ensure you have the following installed:

- Java Development Kit (JDK)
- Maven
- Your preferred IDE ( Eclipse)
- Webdriver executables (ChromeDriver,EdgeDriver etc) compatible with your browser versions

## Setup

1. Clone this repository to your local machine.
2. Import the project into your chosen IDE as a Maven project.
3. Install the required dependencies mentioned in the `pom.xml` file.

## Project Structure

The project is structured as follows:

```
cucumber-java-selenium-framework/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               ├── pages/
│   │               ├── stepdefinitions/
│   │               └── utils/
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── features/
├── pom.xml
└── README.md
```

- `src/main/java/com/example/pages/`: Contains page object classes that model the web pages' elements and actions.
- `src/main/java/com/example/stepdefinitions/`: Contains the step definition classes that map Gherkin steps to Java code.
- `src/main/java/com/example/utils/`: Utility classes for setup, configuration, and common functions.
- `src/test/java/com/example/features/`: Contains the feature files written in Gherkin syntax.

## Writing Features

Define application behavior in the Gherkin syntax within feature files located in `src/test/java/com/example/features/`.

Example:

```gherkin
Feature: Login Feature
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then the user should be redirected to the dashboard
```

## Writing Step Definitions

Implement step definitions in Java in the `src/main/java/com/example/stepdefinitions/` directory. 
Associate these steps with the Gherkin steps in feature files.


## Running Tests

Run the tests using Maven:

```bash
mvn clean test
```

This command will execute the tests defined in the feature files using the associated step definitions.

## Reports

Test reports will be generated in the `target/cucumber-reports` directory after running the tests. You can find HTML reports with detailed information about the test execution.

## Contributing

Contributions are welcome! If you find any issues or want to add enhancements, please create a pull request.