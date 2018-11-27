package com.sandroalmeida.service;

import com.sandroalmeida.model.TodoData;
import com.sandroalmeida.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();

}
