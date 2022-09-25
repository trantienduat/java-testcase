pipeline {
    agent { docker { image 'gradle:7.5.1-jdk17' } }
    stages {
        stage('build') {
            steps {
                sh './gradlew --version'
            }
        }
    }
}
