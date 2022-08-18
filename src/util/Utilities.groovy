package util
class Utilities {
  static def mvn(script, args) {
    //script.sh "${script.tool 'Maven'}/bin/mvn -s ${script.env.HOME}/jenkins.xml -o ${args}"
	println "script.env.HOME = ${script.env.HOME}"
	println "args= ${args}"
  }
}
