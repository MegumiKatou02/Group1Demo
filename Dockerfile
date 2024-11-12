# Sử dụng image có sẵn của OpenJDK
FROM openjdk:17-jdk-alpine

# Sao chép file .jar vào container
COPY target/AppSwing-0.0.1-SNAPSHOT.jar /app/AppSwing.jar

# Thiết lập entrypoint để chạy ứng dụng
ENTRYPOINT ["java", "-jar", "/app/AppSwing.jar"]

# Mở cổng nếu cần thiết
EXPOSE 8080
