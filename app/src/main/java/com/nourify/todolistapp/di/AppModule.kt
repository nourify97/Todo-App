package com.nourify.todolistapp.di

import android.app.Application
import androidx.room.Room
import com.nourify.todolistapp.data.TodoDatabase
import com.nourify.todolistapp.data.TodoRepository
import com.nourify.todolistapp.data.TodoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        // Build a database instance
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_db"
        ).build()
    }

     @Provides
     @Singleton
     fun provideTodoRepository(db: TodoDatabase): TodoRepository {
         // Create a repository instance
         return TodoRepositoryImpl(db.dao)
     }
}