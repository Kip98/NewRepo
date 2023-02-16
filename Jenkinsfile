pipeline {
  agent any
  stages {
    stage('tools') {
      parallel {
        stage('tools') {
          steps {
            sh '''mvn --version
'''
          }
        }

        stage('check files') {
          steps {
            fileExists 'pom.xml'
          }
        }

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