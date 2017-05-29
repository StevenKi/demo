#!groovy

node {

    stage('Configure') {
        env.PATH = "${tool 'maven-3.3.9'}/bin:${env.PATH}"
    }

    stage('Hello World') {
        echo 'Hello World!'
    }
}