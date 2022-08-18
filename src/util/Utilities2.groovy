package util
class Utilities2 implements Serializable {
  def steps
  Utilities2(steps) {this.steps = steps}
  def mvn(args) {
    echo "Utilities2 arg = ${args}"
  }
}
