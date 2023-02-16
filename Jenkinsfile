pipeline {
  agent any
  stages {
    stage('tools') {
      steps {
        sh '''mvn build
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