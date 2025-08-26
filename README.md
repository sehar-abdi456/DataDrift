# DataDrift

A modern, secure file-sharing solution built with Java that enables seamless data transfer across your network. DataDrift combines the power of JavaFX for an intuitive user interface with robust backend security to ensure your files are transferred safely.

## Overview

DataDrift is designed with a focus on security and user experience, utilizing a client-server architecture to facilitate file transfers between connected devices. The application leverages multi-threading capabilities to handle multiple transfers simultaneously while providing real-time progress updates.

## Key Features

- **Secure File Transfer**
  - AES encryption for all file transfers
  - End-to-end data protection
  - Secure user authentication

- **Modern Interface**
  - Clean, intuitive JavaFX UI
  - Real-time transfer progress tracking
  - Drag-and-drop file selection
  - User-friendly navigation

- **Network Capabilities**
  - Efficient client-server architecture
  - Multiple simultaneous transfers
  - Automatic device discovery
  - Connection status monitoring

- **Cross-Platform**
  - Compatible with Windows, macOS, and Linux
  - Consistent experience across platforms
  - Network-agnostic operation

## Technical Requirements

- Java Development Kit (JDK) 21 or newer
- Maven for dependency management
- H2 Database (included in dependencies)
- Minimum 512MB RAM
- Network connection for file transfers

## Getting Started

1. **Clone the Repository**
   ```bash
   git clone https://github.com/asif-0007/DataDrift.git
   cd DataDrift
   ```

2. **Build the Project**
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   ```bash
   mvn javafx:run
   ```

## Development Setup

1. **Environment Setup**
   - Install JDK 21
   - Configure Maven
   - Set up your preferred IDE (IntelliJ IDEA recommended)

2. **Project Configuration**
   - Import as Maven project
   - Ensure JavaFX dependencies are resolved
   - Configure application.properties for database settings

## Architecture

- **Frontend**: JavaFX with FXML for UI components
- **Backend**: Spring Boot for business logic
- **Database**: H2 for data persistence
- **Security**: AES encryption for file transfers
- **Network**: Custom TCP/IP implementation for file transfer

## Contributing

Contributions are welcome! Please feel free to submit pull requests, create issues, or suggest new features.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.
