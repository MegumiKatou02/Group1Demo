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
        stage('Login to Docker Hub') {
            steps {
                withDockerRegistry(credentialsId: 'docker.hub', url: 'https://index.docker.io/v1/') {
                    sh 'docker build -t chinh:latest .'
                    sh 'docker push chinh:latest'
                }
            }
        }
    } 
}
