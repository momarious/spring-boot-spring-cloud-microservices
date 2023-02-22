def image_name = "spring-boot-spring-cloud-microservices"
def docker_registry_credentials_id = ""
def docker_registry_url = ""
def repository_url = "momarious/spring-boot-spring-cloud-microservices"

pipeline {
    agent any 
    // { 
    //     docker { 
    //         image 'maven:3.8.1-openjdk-17-slim' 
    //     } 
    // }
    // tools {  
    //     maven 'mvn 3.8.1'
    // }
    stages {
        stage('Clone Git Repository') {
            steps {
                git url: 'https://github.com/' + repository_url  + '.git'
            }
        }
        stage('Deploy to Docker Compose') {
            steps {
                sh 'docker-compose up -d'
            }
        }
    }
}
