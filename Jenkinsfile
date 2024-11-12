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
                    sh 'mvn clean install -Djava.awt.headless=true'
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
