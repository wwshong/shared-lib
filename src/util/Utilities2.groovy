package util
class Utilities2 implements Serializable {
	//the steps is passed from the caller
	//w/o the steps, the class can't access script/steps, env vars, etc...
  def steps
  Utilities2(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "echo Utilities2 arg = ${args}"
	steps.sh "echo BUILD_ID=${steps.BUILD_ID}"
	
	
  }
}
