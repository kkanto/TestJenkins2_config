 
listView('TestJenkins2 Jobs') {
    description('TestJenkins2 Jobs')
    jobs {
        regex('TestJenkins2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
