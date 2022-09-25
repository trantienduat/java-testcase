pipeline {
    agent { docker { image 'gradle:7.5.1-jdk17' } }
    stages {
        stage('Checkout') {
            steps {
                sh './gradlew --version'
            }
        }
        stage('Build'){
            steps{
                sh './gradlew clean build'
            }
        }
    }
}
