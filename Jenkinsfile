pipeline {
    agent any
    tools {
        maven 'MAVEN' 
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
        // stage('Test Docker') {
        //     steps {
        //         script {
        //             sh 'docker --version'
        //         }
        //     }
        // }
        // stage('build docker') {
        //     withDockerRegistry(credentialsId: 'docker.hub', toolName: 'Docker') {

        //     }
        // }
        stage('Build Docker Image') {
            steps {
                script {
                    // Đảm bảo Jenkins đã login vào Docker Hub với credentialsId 'docker.hub'
                    withDockerRegistry(credentialsId: 'docker.hub', toolName: 'Docker') {
                        // // Xây dựng Docker image từ Dockerfile trong thư mục hiện tại
                        // sh 'docker build -t chinhapp .'
                        
                        // // Đẩy Docker image lên Docker Hub (hoặc registry khác)
                        // sh 'docker push chinhapp'
                    }
                }
            }
        }
    } 
}
