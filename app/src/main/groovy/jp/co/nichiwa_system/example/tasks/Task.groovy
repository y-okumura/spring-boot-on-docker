package jp.co.nichiwa_system.example.tasks

class Task {
    enum Status {
        todo,
        doing,
        done
    }
    long id;
    String name;
    String description;
    Status status = Status.todo;
}
