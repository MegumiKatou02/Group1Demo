pipeline {
    agent any
    tools {
        jdk 'OpenJDK 21'  
        maven 'Maven 3.9.9' 
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/MegumiKatou02/Group1Demo.git'
            }
        }
    }
}
