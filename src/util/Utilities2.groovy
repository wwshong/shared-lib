package util
class Utilities2 implements Serializable {
  def steps
  Utilities(steps) {this.steps = steps}
  def mvn(args) {
    steps.sh echo "Utilities2 arg = ${args}"
  }
}