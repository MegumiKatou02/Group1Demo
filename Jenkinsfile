pipeline {
    agent any
    tools {
        maven 'MAVEN' 
        dockerTool 'Docker'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/MegumiKatou02/Group1Demo.git'
            }
        }
        stage('Build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh "mvn test"
                }
            }
        }
        stage('Package') {
            steps {
                script {
                    sh 'mvn package'
                }
            }
        }
        stage('Archive') {
            steps {
                // Lưu trữ file JAR để có thể tải về hoặc sử dụng sau này
                echo 'Archiving JAR file...'
                archiveArtifacts allowEmptyArchive: true, artifacts: '**/target/*.jar', onlyIfSuccessful: true
            }
        }
        stage('Run') {
            steps {
                script {
                    echo 'Running the application...'
                    // sh 'java -jar target/AppSwing-0.0.1-SNAPSHOT.jar'
                    sh 'java -Djava.awt.headless=true -jar target/AppSwing-0.0.1-SNAPSHOT.jar'
                }
            }
        }
    } 
    post {
            success {
                echo 'Thuc hien pineline thanh cong'  
            }
            failure {
                echo 'Build that bai.' 
            }
        }
}
