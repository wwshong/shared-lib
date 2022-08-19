package calculator

class Calculator implements Serializable, ICalculator {
  // Jenkinsfile script context, note that all pipeline steps must use this context
  Object script = null

  @Override
  int add(int a, int b) {
    // Note the script context is required for `echo`, as it is a pipeline step
    script.echo "Adding ${a} to ${b}"
	
	script.sh "echo script Adding ${a} to ${b}"
    return a + b
  }
}
