# Demo N-Layered Project

A demo project 

## Requirements

- Docker >= 20.x
- Java 17 (only needed for local build, Docker image already includes JDK)
- Gradle 8.14.3

## Build & Run (Docker)

1. Build Docker image:

```bash
docker build -t demo-backend ./backend
```

2. Run Container

```
docker run --rm -p 8080:8080 demo-backend
```
