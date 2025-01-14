def call(Map config = [:]) {
    sh "echo Hello My Friend ${config.name}. Today is ${config.dayOfWeek}."
}
