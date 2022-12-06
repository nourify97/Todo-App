package com.nourify.todolistapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Defining a database schema
 * using Room entities
 */
@Entity
data class Todo(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val description: String?,
    val isDone: Boolean
)
