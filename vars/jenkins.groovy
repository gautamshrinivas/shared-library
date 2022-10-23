def call() {
    pipeline {
        agent { label 'node'} 
        stages {
            stage ('vcs') {
                steps {
                git url:'https://github.com/gautamshrinivas/spring-petclinic.git',
                branch:'oct21'
                }
            }
            stage ('build') {
                steps {
                sh 'mvn package'
                }                
            }
        }
    }
}