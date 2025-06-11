# Task Management Application

A simple E2E Java Spring Boot Angular application for managing tasks, built with Maven and containerized using Docker.

## 📦 Features

- RESTful API for task management
- Spring Boot + Maven project structure
- Dockerized with multi-stage build
- Ready for production deployment
- Angular Frontend to display tasks list with due date till today along with Priority filter

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Angular
- Maven
- Docker

---

## 🚀 Getting Started

### Prerequisites

- Java 17 JDK
- Maven
- Docker
- Node 20+
- Angular 18

---

## 🧪 Running Locally

### 1. Clone the repository

```bash
git clone https://github.com/SushantPatil861/task-mgmt-assignment-e2e.git
```
### 2. Build, Run, Publish dockerized backend service

```bash
cd task-mgmt-backend
./docker-build-run.sh
./docker-publish.sh
```
### 3. Build and Run UI application

```bash
cd task-mgmt-ui
npm ci --force
npm run start
```
### 4. Configure Lambda
 - Runs daily
 - Calls the endpoint: /api/v1/tasks?dueBefore=&lt;today&gt;&amp;completed=false.
 - Logs (or sends) an alert for each overdue task.

```bash
cd task-mgmt-lambda-overdue-alert
mvn clean package shade:shade
Upload the generated .jar to AWS Lambda
Set Handler in AWS Lambda as => com.assignment.lambda.OverdueTaskNotifier::handleRequest
Configure a CloudWatch Event rule with a cron expression to trigger the lambda daily
```
