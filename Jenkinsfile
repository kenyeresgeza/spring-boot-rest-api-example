pipeline {
  agent any

  tools {
    jdk 'Java 11'
    gradle 'Gradle'
  }

  stages {
    
    stage("build") {
      steps {
        echo 'Building the application (Gradle)'
        sh 'gradle -version'
        sh 'gradle clean jar'
      }
    }
     
     stage("test") {
       steps {
          echo 'Testing the application..'
       }
     }
     
     stage("deploy") {
        steps {
          echo 'Deploying the application..'
        }
     }
     
  }
}

node {
  // groovy
}
