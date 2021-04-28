pipeline {
    agent any
    stages {

        stage('Checkout Codebase'){
            steps{
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/master']],userRemoteConfigs:
                [[credentialsId: 'ENSE375Exam', url: 'git@github.com:roxanneharrison/ENSE375Exam.git']]]
            }
        }
        stage('Build'){
            steps{
                sh 'mvn compile -f pom.xml'
            } 
        }

        stage('Test'){
            steps{
                sh 'mvn test -f pom.xml'
            }
            post {
                always {
            junit 'target/surefire-reports/*.xml'
        }
    }
        }
    }
}
