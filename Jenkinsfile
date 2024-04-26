pipeline{
    agent any
    tools{
        maven 'MAVEN_HOME'
    }
    stages{
        stage('Stage1: Clean Stage'){
            steps{
                sh 'mvn clean'
            }
        }
        stage('Stage2: Test Stage'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Stage3: My Package'){
            steps{
                sh 'mvn package'
            }
        }
        stage('Stage4: My Final Build Stage'){
            steps{
                sh 'mvn install'
            }
        }
        stage('Stage Final: Build Success'){
            steps{
                echo 'Build Successful'
            }
        }
    }
}