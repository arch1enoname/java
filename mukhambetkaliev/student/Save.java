package com.mukhambetkaliev.student;

public class Save{
    Saveble save;

    public Save(Saveble save) {
        this.save = save;
    }

    public Saveble load() {
        return save;
    }

}
