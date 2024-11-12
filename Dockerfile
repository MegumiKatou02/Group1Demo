# Sử dụng image Maven để xây dựng dự án
FROM maven:3.8.1-openjdk-11 AS builder
WORKDIR /app

# Sao chép tất cả các tệp vào container
COPY . .

# Build ứng dụng bằng Maven
RUN mvn clean install -DskipTests

# Tạo một image nhẹ hơn chỉ chứa JRE và ứng dụng đã build xong
FROM openjdk:11-jre-slim
WORKDIR /app

# Sao chép file jar từ quá trình build ở bước trước vào container
COPY --from=builder /app/target/*.jar app.jar

# Khai báo lệnh để chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
