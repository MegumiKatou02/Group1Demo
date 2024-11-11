pipeline {
    agent any
    environment {
        DOCKER_IMAGE = 'appswing:latest'
        REGISTRY = 'docker.io'  // Docker registry, ví dụ Docker Hub
        DOCKERHUB_USER = 'your-docker-username'
        DOCKERHUB_PASS = 'your-docker-password'
    }
    stages {
        stage('Checkout') {
            steps {
                // Checkout mã nguồn từ GitHub
                git 'https://github.com/MegumiKatou02/Group1Demo.git'
            }
        }
        
        stage('Build with Maven') {
            steps {
                // Build ứng dụng với Maven
                sh 'mvn clean install'
            }
        }

        // stage('SonarQube Analysis') {
        //     steps {
        //         // Chạy phân tích mã nguồn với SonarQube
        //         script {
        //             def scannerHome = tool 'SonarQube Scanner'
        //             withSonarQubeEnv('SonarQube') {
        //                 sh "${scannerHome}/bin/sonar-scanner"
        //             }
        //         }
        //     }
        // }
        
        stage('Build Docker Image') {
            steps {
                script {
                    // Build Docker image từ Dockerfile
                    sh 'docker build -t $DOCKER_IMAGE .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    // Đăng nhập vào Docker Hub
                    sh 'echo $DOCKERHUB_PASS | docker login -u $DOCKERHUB_USER --password-stdin'

                    // Push Docker image lên Docker Hub (hoặc registry khác)
                    sh 'docker push $DOCKER_IMAGE'
                }
            }
        }

        stage('Deploy with Ansible') {
            steps {
                script {
                    // Chạy Ansible playbook để triển khai Docker container
                    sh 'ansible-playbook -i inventory deploy.yml'
                }
            }
        }
    }

    post {
        success {
            echo 'Build and Deploy Success!'
        }
        failure {
            echo 'Build or Deploy Failed!'
        }
    }
}
