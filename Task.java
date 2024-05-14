import java.time.LocalDate;

public class Task {
    private final String title;
    private String description;
    private LocalDate scheduled;
    private LocalDate deadline;
    private State state;

    Task(String title, State state) {
        this.title = title;
        this.state = state;
    }

    Task(String title, State state, String description, LocalDate scheduled, LocalDate deadline) {
        this.title = title;
        this.state = state;
        this.description = description;
        this.scheduled = scheduled;
        this.deadline = deadline;
    }

    public String getTitle() {
        return this.title;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getScheduled() {
        return this.scheduled;
    }

    public void setScheduled(LocalDate scheduled) {
        this.scheduled = scheduled;
    }

    public LocalDate getDeadline() {
        return this.deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String toString() {
        String message = this.title + " (" + this.state + ")";
        if (scheduled != null) {
            message += " scheduled: " + scheduled;
        }
        if (deadline != null) {
            message += " deadline: " + deadline;
        }
        return message;
    }


    public static void main(String[] args) {
        Task t1 = new Task("T1", State.TODO);
        LocalDate.now();
        System.out.println(t1);

        /* OUTPUT
        T1 (TODO)
        */

        Task s1 = new RepeatedTask("S1", State.TODO);
        System.out.println(s1);
        s1.setState(State.DONE);
        System.out.println(s1);

        Task s2 = new Chore("S2", State.TODO,
        LocalDate.now(),
        LocalDate.now().plusDays(7));
        System.out.println(s2);
        s2.setState(State.DONE);
        System.out.println(s2);


        Task t2 = new SharedTask("T2", "Alice");
        System.out.println(t2);



        Task t3 = new Dependency("T3", State.TODO, t1);
        System.out.println(t3);
        t3.setState(State.DONE);
        System.out.println(t3);
        t1.setState(State.DONE);
        t3.setState(State.DONE);
        System.out.println(t3);
    }
}


class Chore extends Task {
    LocalDate repeat;

    Chore(String title, State state, LocalDate scheduled, LocalDate repeat) {
        super(title, state);
        setScheduled(scheduled);
        setRepeat(repeat);
    }

    public LocalDate getRepeat() {
        return this.repeat;
    }

    public void setRepeat(LocalDate repeat) {
        this.repeat = repeat;
    }

    @Override
    public void setState(State state) {
        super.setState(state);
        if (state == State.DONE) {
            setScheduled(repeat);

            setRepeat(repeat.plusDays(7));
            setState(State.TODO);
        }
    }
}

class RepeatedTask extends Task {

    RepeatedTask(String title, State state) {
        super(title, state);
    }

    @Override
    public void setState(State state) {
        if(state == State.DONE) {
            super.setState(State.TODO);
        } else {
            super.setState(state);
        }
    }
}

class SharedTask extends Task {
    String name;

    SharedTask(String title, String name) {
        super(title, State.WAIT);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString() + " shared with: " + getName();
    }
}

class Dependency extends Task {
    Task shared;

    Dependency(String title, State state, Task shared) {
        super(title, state);
        this.shared = shared;
    }

    public Task getShared() {
        return this.shared;
    }

    public void setShared(Task shared) {
        this.shared = shared;
    }

    @Override
    public String toString() {
        return super.toString() + " dependent on: " + shared.toString();
    }

    public void setState(State state) {
        if(shared.getState() == State.DONE) {
            super.setState(state);
        } else {
            if(state != State.DONE) {
                super.setState(state);
            }
        }
    }


}


enum State {
    TODO, BEGN, HALT, WAIT, DONE;
}
