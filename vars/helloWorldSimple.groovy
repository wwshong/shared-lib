import jenkinslib.JenkinsSharedLibUtil

def call(String name, String dayOfWeek) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
  def jenkinsSharedLibUtil = new JenkinsSharedLibUtil()
  def s1 = jenkinsSharedLibUtil.sayHi()
                    def s2 = jenkinsSharedLibUtil.sayHi2()
                    println "helloWorldSimple s1=${s1}"
                    println "helloWorldSimple s2=${s2}"
}
