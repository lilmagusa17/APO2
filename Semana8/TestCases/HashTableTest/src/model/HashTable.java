package model;

import util.IHash;
    public class HashTable<K, V extends Comparable<V>> implements IHash<K, V> {

        public static final int UNIVERSE = 11;

        private HashNode<K, V>[] list;

        private int size;


        public HashTable() {
            this.size = 0;
            list = new HashNode[UNIVERSE];

        }

        @Override
        public void put(K key, V value) {
            int index = hashFuntion(key);
            HashNode<K, V> nodeAdd = new HashNode<K, V>(key, value);

            if(list[index]!= null) {
                list[index].add(nodeAdd);

            }else {
                list[index] = nodeAdd;
                size++;
            }

        }

        @Override
        public void remove(K key){
            int index = hashFuntion(key);

            if(isEmpty() == true) {
               //should have and exception
            }else {
                if(list[index] == null) {
                  //should have an exception
                }else {
                    if(list[index].getNext() == null) {
                        list[index] = null;
                        size--;
                    }else {
                        list[index].romoveLast();
                    }
                }
            }
        }

        @Override
        public V get(K key) {
            int index = hashFuntion(key);
            return list[index].getValue();
        }

        @Override
        public int getSize() {
            return size;
        }

        @Override
        public boolean isEmpty() {
            return size==0;
        }

        public int hashFuntion(K key) {
            int index = key.hashCode();

            if(index > UNIVERSE) {
                index = key.hashCode()% UNIVERSE;
            }else if (index < 1 ) {
                index = key.hashCode()* UNIVERSE;
            }

            return index + 1;
        }


    }


