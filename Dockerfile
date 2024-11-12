# Sử dụng một image cơ bản (base image)
FROM openjdk:11-jre-slim

# Copy mã nguồn vào container
COPY ./target/myapp.jar /usr/app/

# Set working directory
WORKDIR /usr/app

# Chạy ứng dụng Java
CMD ["java", "-jar", "myapp.jar"]
