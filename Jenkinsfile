pipeline {
    agent any
    tools {
        maven 'MAVEN' 
        dockerTool 'Docker'
    }
    environment {
        DOCKER_HUB_CREDENTIALS = 'docker-hub'  
        IMAGE_NAME = 'chinh'  
        TAG = 'latest'  
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

        // stage('Build Docker Image') {
        //     steps {
        //         script {
        //             withDockerRegistry(credentialsId: 'docker-hub', url: 'https://index.docker.io/v1/') {
        //                 sh 'docker --version'
        //                 sh "docker build -t ${DOCKER_HUB_CREDENTIALS}/${IMAGE_NAME}:${TAG} ."
        //             } 
        //         }
        //     }
        // }
        // stage('Push Docker Image') {
        //     steps {
        //         script {
        //             withDockerRegistry(credentialsId: DOCKER_HUB_CREDENTIALS, url: 'https://index.docker.io/v1/') {
        //                 sh "docker push ${DOCKER_HUB_CREDENTIALS}/${IMAGE_NAME}:${TAG}"
        //             }
        //         }
        //     }
        // }
    } 
}
