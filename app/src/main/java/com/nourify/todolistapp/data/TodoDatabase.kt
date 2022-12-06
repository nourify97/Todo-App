package com.nourify.todolistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Defining database instance with TodoDao
 * access to interact with db
 */
@Database(
    entities = [Todo::class],
    version  = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao
}