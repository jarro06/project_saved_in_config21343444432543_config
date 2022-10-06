 
listView('project_saved_in_config21343444432543 Jobs') {
    description('project_saved_in_config21343444432543 Jobs')
    jobs {
        regex('project_saved_in_config21343444432543_.+')
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
