package org.example.builder;

public class House {

    private int numFloor;
    private boolean pool;
    private String roof;
    private String color;

    private House(Builder builder) {
        this.numFloor = builder.numFloor;
        this.pool = builder.pool;
        this.roof = builder.roof;
        this.color = builder.color;
    }

    public static class Builder {
        private int numFloor;
        private boolean pool;
        private String roof;
        private String color;

        public Builder numFloor(int numFloor) {
            this.numFloor = numFloor;
            return this;
        }

        public Builder pool(boolean pool) {
            this.pool = pool;
            return this;
        }

        public Builder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "numFloor=" + numFloor +
                ", pool=" + pool +
                ", roof='" + roof + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
