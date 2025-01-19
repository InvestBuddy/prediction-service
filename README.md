# Prediction Service - InvestBuddy AI

The **Prediction Service** is responsible for making investment predictions for users in the **InvestBuddy AI** platform. It communicates with an external **ML Service** (built with FastAPI) via REST APIs to perform computations and retrieve prediction results.

---

## 📜 Table of Contents

- [Features](#-features)
- [Architecture](#-architecture)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
---

## ✨ Features

- **Investment Predictions**:
    - Sends user financial data to the ML Service and retrieves predictions.
    - Predictions is an affordable investment domain for the user based on his profile.
- **REST API Communication**:
    - Uses **WebClient** for non-blocking HTTP requests to the ML Service.
- **Integration with Discovery Server**:
    - Registers itself for service discovery and allows seamless communication with other services.
- **Error Handling**:
    - Handles timeouts and errors from the ML Service with retry mechanisms and fallbacks.

---

## 🏗️ Architecture

The **Prediction Service** operates as a RESTful microservice and interacts with the **ML Service** over HTTP for real-time predictions. Key technologies include:

- **Spring Boot**: Backend framework for REST API development.
- **WebClient**: For non-blocking HTTP communication with the ML Service.
- **Spring Cloud**: Integration with Eureka for service discovery.

---

## ✅ Prerequisites

Ensure the following are installed before setting up the **Prediction Service**:

- **Java 21** or higher
- **Maven 3.8** or higher
- **Discovery Server** (Eureka)
- **ML Service** running and accessible via REST API

---

## 🛠️ Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/your-repo/prediction-service.git
   cd prediction-service
