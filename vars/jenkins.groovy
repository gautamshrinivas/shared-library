def call {
    pipeline {
        agent { label 'node'} 
        stages {
            stage ('vcs') {
                git url:'https://github.com/gautamshrinivas/spring-petclinic.git',
                branch:'oct21'
            }
            stage ('build') {
                sh 'mvn package'
            }
        }
    }
}