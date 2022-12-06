package com.nourify.todolistapp.ui.todo_list

import com.nourify.todolistapp.data.Todo

/**
 * Defining all user interactions from
 * TodoList Screen to the ViewModel
 */
sealed class TodoListEvent {
    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    object OnAddTodoClick: TodoListEvent()
}
