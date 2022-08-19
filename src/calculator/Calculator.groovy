package calculator

class Calculator implements Serializable {
  // Jenkinsfile script context, note that all pipeline steps must use this context
  Object script = null

  int add(int a, int b) {
    // Note the script context is required for `echo`, as it is a pipeline step
    script.echo "Adding ${a} to ${b}"
    return a + b
  }
}