# Bắt đầu từ image chính thức của Maven để xây dựng ứng dụng
FROM maven:3.9.9-openjdk-21-slim AS build

# Thiết lập thư mục làm việc
WORKDIR /app

# Sao chép pom.xml và các file cần thiết khác vào container
COPY pom.xml .

# Tải xuống và cài đặt các phụ thuộc Maven (không cần build ứng dụng ở bước này)
RUN mvn dependency:go-offline

# Sao chép mã nguồn của bạn vào container
COPY src /app/src

# Build ứng dụng
RUN mvn clean package

# Sử dụng image JRE (Java Runtime Environment) để chạy ứng dụng
FROM openjdk:21-jre-slim

# Sao chép file .jar đã build từ image trước đó vào container
COPY --from=build /app/target/AppSwing-0.0.1-SNAPSHOT.jar /app/AppSwing.jar

# Đặt thư mục làm việc nơi ứng dụng sẽ được chạy
WORKDIR /app

# Lệnh để chạy ứng dụng Java
ENTRYPOINT ["java", "-jar", "AppSwing.jar"]
