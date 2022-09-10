def call(Map args) {
    node {
         stage("Compile") {
             
                echo "compile"
            
        }
        stage("Unit Test") {
            
                echo "test"
            
        }
        stage("Integration Tests") {
           
                echo "integration test"
            
        }
        stage("Package") {
            
                echo "package"
            
        }
	}
}
