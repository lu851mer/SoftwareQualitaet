package com.mycompany.app.Aufgabe5;

    public class FullBox implements Box {

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int getPrice() {
            return 42;
        }

        @Override
        public void releaseItem() {
        }
    }
