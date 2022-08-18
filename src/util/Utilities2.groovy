package util
class Utilities2 implements Serializable {
  def steps
  Utilities2(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh "echo Utilities2 arg = ${args}"
	steps.sh "echo script.env.HOME=${script.env.HOME}"
  }
}
