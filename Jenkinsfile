pipeline {
  agent any
  
  stages {
    
    stage("build") {
      steps {
        echo 'Building the application (Gradle)'
        withGradle() {
            sh './gradle -version'
        }
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
