def buildStage() {
    stage('Build') {
        steps {
            script {
                sh 'mvn clean install -DskipTests'
            }
        }
    }
}

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

        buildStage()
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
