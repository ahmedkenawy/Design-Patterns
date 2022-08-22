package com.a7medkenawy.designpatternslessons.creational.builder;

public class Robot {
    private int id;
    private static int idCounter = 0;
    private int warrantYears;
    private String type;
    private int price;
    private String headType;
    private String bodyType;
    private String legsType;

//    Robot(String type) {
//        this.id = idCounter++;
//        this.type = type;
//        this.price = (type.equals("Spherical")) ? 20000 : 5000;
//        this.warrantYears = (type.equals("Spherical")) ? 10 : 5;
//        this.headType = (type.equals("Spherical")) ? "Spherical" : "Cubical";
//        this.bodyType = (type.equals("Spherical")) ? "Spherical" : "Cubical";
//        this.legsType = (type.equals("Spherical")) ? "Spherical" : "Cubical";
//    }
//
//
//    Robot(String type, int warrantYears) {
//        this(type);
//        this.warrantYears = warrantYears;
//    }
//
//    Robot(String type, int warrantYears, int price) {
//        this(type, warrantYears);
//        this.price = price;
//    }

    private Robot(String type, int warrantYears, int price, String headType, String legType, String bodyType) {
        this.type = type;
        this.warrantYears = warrantYears;
        this.price = price;
        this.headType = headType;
        this.bodyType = bodyType;
        this.legsType = legType;
    }

//    public Robot setWarrantYears(int warrantYears) {
//        this.warrantYears = warrantYears;
//        return this;
//    }
//
//    public Robot setType(String type) {
//        this.type = type;
//        return this;
//    }
//
//    public Robot setPrice(int price) {
//        this.price = price;
//        return this;
//    }
//
//    public Robot setHeadType(String headType) {
//        this.headType = headType;
//        return this;
//    }
//
//    public Robot setBodyType(String bodyType) {
//        this.bodyType = bodyType;
//        return this;
//    }
//
//    public Robot setLegsType(String legsType) {
//        this.legsType = legsType;
//        return this;
//    }

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", warrantYears=" + warrantYears +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", headType='" + headType + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", legsType='" + legsType + '\'' +
                '}';
    }

    public static class RobotBuilder {
        private int id;
        private static int idCounter = 0;
        private int warrantYears;
        private String type;
        private int price;
        private String headType;
        private String bodyType;
        private String legsType;

        RobotBuilder() {
            this.id = idCounter++;
        }


        public RobotBuilder setWarrantYears(int warrantYears) {
            this.warrantYears = warrantYears;
            return this;
        }

        public RobotBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public RobotBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public RobotBuilder setHeadType(String headType) {
            this.headType = headType;
            return this;
        }

        public RobotBuilder setBodyType(String bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        public RobotBuilder setLegsType(String legsType) {
            this.legsType = legsType;
            return this;
        }

        public Robot build() {
            if (type==null)
                throw new IllegalArgumentException("type is Invalid");
            if (price==0)
                throw new IllegalArgumentException("price is Invalid");
            if (warrantYears==0)
                throw new IllegalArgumentException("warrantYears is Invalid");
            if (headType==null)
                throw new IllegalArgumentException("headType is Invalid");
            if (legsType==null)
                throw new IllegalArgumentException("legsType is Invalid");
            if (bodyType==null)
                throw new IllegalArgumentException("bodyType is Invalid");
            return new Robot(type, warrantYears, price, headType, legsType, bodyType);
        }

    }

}

