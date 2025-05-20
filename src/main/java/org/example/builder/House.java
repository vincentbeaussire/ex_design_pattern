package org.example.builder;

public class House {

    private int numFloor;
    private boolean pool;
    private String roof;
    private String color;

    @Override
    public String toString() {
        return "House{" +
                "numFloor=" + numFloor +
                ", pool=" + pool +
                ", roof='" + roof + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public House(Builder builder) {
        numFloor = builder.numFloor;
        pool = builder.pool;
        roof = builder.roof;
        color = builder.color;

        public static class Builder {
            private int numFloor;
            private boolean pool;
            private String roof;
            private String color;
        }

        public Builder numFloor(int numFloor){
            this.numFloor = numFloor;
            return this;
        }

        public Builder pool (boolean pool){
            this.pool = pool;
            return this;
        }

        public Builder roof (String roof){
            this.roof = roof;
            return this;
        }

        public Builder color (String color){
            this.color = color;
            return this;
        }


    }
}
