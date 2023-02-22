def image_name = "spring-boot-spring-cloud-microservices"
def docker_registry_credentials_id = ""
def docker_registry_url = ""
def repository_url = "momarious/spring-boot-spring-cloud-microservices"

pipeline {
    agent any
    
    stages {
        stage('Clone repository') {
            steps {
                git 'https://github.com/'+ repository_url + '.git'
            }
        }
        // stage('Build application') {
        //     steps {
        //         sh 'mvn clean install'
        //     }
        // }
        stage('Build Docker images') {
            steps {
                sh 'docker-compose build'
            }
        }
        stage('Run Docker containers') {
            steps {
                sh 'docker-compose up -d'
            }
        }
        // stage('Run tests') {
        //     steps {
        //         sh 'mvn test'
        //     }
        // }
        // stage('Deploy to production') {
        //     when {
        //         branch 'master'
        //     }
        //     steps {
        //         sh 'docker-compose -f docker-compose.prod.yml up -d'
        //     }
        // }
        // stage('Cleanup') {
        //     steps {
        //         sh 'docker-compose down'
        //     }
        // }
    }
}
