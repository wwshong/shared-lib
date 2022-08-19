import calculator.Calculator

int add(int a, int b) {
	echo "calculator in vars echo = $a + $b"
	println "calculator in vars println = $a + $b"
  return new Calculator(script: this).add(a, b)
}
