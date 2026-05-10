pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'Java'
    }

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/amruthar77/SeleniumApp.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Selenium Test') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }

    post {
        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }
    }
}
