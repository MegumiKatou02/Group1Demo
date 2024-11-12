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
        stage('Package') {
            steps {
                script {
                    sh 'mvn package'
                }
            }
        }
        

    } 
    post {
            // Bước này sẽ thực hiện sau khi các stage hoàn thành
            always {
                echo 'This will always run after the pipeline completes.'  // Thực hiện dù pipeline thành công hay thất bại
            }
            success {
                echo 'Build completed successfully!'  // Thực hiện khi pipeline thành công
            }
            failure {
                echo 'Build failed. Check the logs for errors.'  // Thực hiện khi pipeline thất bại
            }
        }
}
