class Store {
    private static Store store;

    private Store() {
        counter = 0;
        guestbook = "";
    }

    static Store initialize() {
        if (store == null) {
            store = new Store();
            return store;
        }
        else {
            return store;
        }
    }

    private int counter;
    private String guestbook;

    int getCounter() {
        return counter;
    }

    void increaseCounter() {
        this.counter++;
    }

    void decreaseCounter() {
        this.counter--;
    }

    String getGuestbook() {
        return guestbook;
    }

    void writeGuestbook(String message) {
        this.guestbook = this.guestbook + "\n" + message;
    }
}
