pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/your-repo/simple-java-app.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Lint') {
            steps {
                sh 'mvn checkstyle:check'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t simple-java-app .'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker run -d -p 8080:8080 simple-java-app'
            }
        }
    }
}
