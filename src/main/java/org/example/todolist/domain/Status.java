package org.example.todolist.domain;

public enum Status {
    PAUSED(0),
    IN_PROGRESS(1),
    DONE(2);

    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Status fromCode(int code) {
        for (Status status : Status.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid Status code: " + code);
    }
}