class Example {
    void display(Example obj) {
        System.out.println("Method called with current object!");
    }

    void call() {
        display(this); // Passes the current object
    }
}
