pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    // Build and run Maven with OWASP Dependency-Check
                    sh 'mvn clean install'
                    // Assuming you have the Dependency-Check plugin installed in Jenkins
                    // This step will analyze dependencies for security vulnerabilities
                    withMaven(jdk: 'Maven', maven: 'Maven') {
                        sh 'mvn org.owasp:dependency-check-maven:check'
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Build successful!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
