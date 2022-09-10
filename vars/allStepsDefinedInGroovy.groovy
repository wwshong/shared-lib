def call(Map args) {
    pipeline {
         stage("Compile") {
            steps {
                echo "compile"
            }
        }
        stage("Unit Tests") {
            steps {
                echo "test"
            }
        }
        stage("Integration Tests") {
            steps {
                echo "integration test"
            }
        }
        stage("Package") {
            steps {
                echo "package"
            }
        }
	}
}
