public class Runner {

    public static void main(String[] args) {
        Store store = Store.initialize(); // 0
        store.increaseCounter(); // 1

        worker workerOne = new worker();
        worker workerTwo = new worker();

        workerOne.increaseStoreCounter(); // 2
        workerTwo.increaseStoreCounter(); // 3

        System.out.println(store.getCounter()); // print 3

        workerOne.decreaseStoreCounter(); // 2
        workerTwo.decreaseStoreCounter(); // 1

        System.out.println(store.getCounter()); // print 1

        store.decreaseCounter(); // 0

        System.out.println(store.getCounter()); // print 0

        store.writeGuestbook("Runner was here!");

        System.out.println(store.getGuestbook());
    }

    static class worker {
        private static Store store;

        worker() {
            store = Store.initialize();
            store.writeGuestbook("A worker was here!");
        }

        void increaseStoreCounter() {
            store.increaseCounter();
        }

        void decreaseStoreCounter() {
            store.decreaseCounter();
        }
    }
}
