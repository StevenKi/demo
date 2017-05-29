#!groovy

node {

    stage('Configure') {
        // Configure this in Manage Jenkins -> Global Tool Configuration and add a Maven installation with this name
        def mvnHome = tool 'maven-3.5.0'
    }

    stage('Checkout') {
        git url: 'https://github.com/StevenKi/demo.git'
    }

    stage('Build and unit test') {
        sh "${mvnHome}/bin/mvn clean install"
    }

    stage('Hello World') {
        echo 'Hello World!'
    }
}