pipeline {
  agent any
  stages {
    stage('tools') {
      steps {
        sh '''mvn clean package
'''
      }
    }

    stage('build') {
      steps {
        sh 'mvn compile test package'
      }
    }

    stage('deploy') {
      steps {
        echo 'deployment phase'
      }
    }

  }
}