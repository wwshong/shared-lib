def call(Map args) {
  pipeline {
       agent any
        
       stages {
           stage("Tools initialization") {
               steps {
                   sh "mvn --version"
                   sh "java -version"
               }
           }
           stage("Compile") {
               steps {
                   echo "compile"
               }
           }
           stage("Cleaning workspace") {
               steps {
                   echo "clean"
               }
           }
            
       }
   }
}