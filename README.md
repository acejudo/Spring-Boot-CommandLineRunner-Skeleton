[![Build Status](https://travis-ci.org/acejudo/Spring-Boot-CommandLineRunner-Skeleton.svg?branch=master)](https://travis-ci.org/acejudo/Spring-Boot-CommandLineRunner-Skeleton)

# Simple Srping Boot CommandLine Application
- Using properties
- A simple service
- Unit test

# Run app:
  mvn spring-boot:run

# Test app
  mvn test
  
# Package with profile
  mvn clean package
  mvn clean package -P dev
  mvn clean package -P pro
  
# Docker build
  docker build --tag myapp .

# Run image as a containter
  docker run --publish 8000:8080 --detach --name containerName myapp

# View logs
  docker logs containerName


