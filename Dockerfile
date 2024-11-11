# Sử dụng OpenJDK 11 làm image cơ sở
FROM openjdk:11-jdk

# Đặt thư mục làm việc trong container là /app
WORKDIR /app

# Sao chép file JAR đã build từ Maven vào container
COPY target/AppSwing-0.0.1-SNAPSHOT.jar /app/app.jar

# Mở cổng 8080 cho ứng dụng (hoặc cổng mà ứng dụng của bạn sử dụng)
EXPOSE 8080

# Chạy ứng dụng Java Swing trong container
ENTRYPOINT ["java", "-jar", "app.jar"]
