package jp.co.nichiwa_system.example.tasks

class Task {
    enum Status {
        todo(1),
        doing(2),
        done(3);

        final int code;

        public Status(code) {
            this.code = code
        }

        static byCode(code) {
            values().find{it.code == code}
        }
    }

    long id;
    String name;
    String description;
    Status status;

    public Task() {
        this.status = Status.todo
    }

    int getStatus_code() {
        return status?.code;
    }

    void setStatus_code(int code) {
        status = Status.byCode(code);
    }
}
