#!groovy

node {
    // Configure this in Manage Jenkins -> Global Tool Configuration and add a Maven installation with this name
    def mvnHome = tool 'maven-3.5.0'

    stage('Checkout') {
        git url: 'https://github.com/StevenKi/demo.git'
    }

    stage('Build and unit test') {
        sh "${mvnHome}/bin/mvn clean install"
        step([$class: 'JUnitResultArchiver', testResults:'**/target/surefire-reports/TEST-*.xml'])
    }
}