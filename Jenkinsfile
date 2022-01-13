pipeline {
    agent {
        docker {
            image 'maven:3.8.1-adoptopenjdk-11' 
             
        }
    }
    try agent { any { image 'node:12.16.2' args '-v /root/.m2:/root/.m2' } }


    
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
    }
}
