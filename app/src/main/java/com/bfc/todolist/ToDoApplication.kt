package com.bfc.todolist

import android.app.Application

class ToDoApplication: Application() {
    private val database by lazy { TaskItemDatabase.getDatabase(this) }
    val repositoryby by lazy { TaskItemRepository(database.taskItemDao()) }
}