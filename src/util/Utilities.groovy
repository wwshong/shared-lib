package util
class Utilities {
  static def mvn(script, args) {
    //script.sh "${script.tool 'Maven'}/bin/mvn -s ${script.env.HOME}/jenkins.xml -o ${args}"
	println "script.tool = ${script.tool}"
	println "args= ${args}"
  }
}