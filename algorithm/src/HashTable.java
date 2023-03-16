public class HashTable <K, V> {

    private Basket [] baskets;

    private static final int INIT_BASKET_COUNT = 16;

    public HashTable() {
        baskets = (Basket[]) new Object[INIT_BASKET_COUNT];
    }

    private class Entity {

        private K key;
        private V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

        private class Basket{

            private Node head;
            private class Node{
                private Entity data;
                private Node next;

            }

        }

}
