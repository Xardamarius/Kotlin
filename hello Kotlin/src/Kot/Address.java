//package Kot;
//
//import java.util.Objects;
//
//public class Address {
//    private String city;
//    private String street;
//    private Integer numberOfHouse;
//
//    public Address(String city, String street, Integer numberOfHouse) {
//        this.city = city;
//        this.street = street;
//        this.numberOfHouse = numberOfHouse;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public Integer getNumberOfHouse() {
//        return numberOfHouse;
//    }
//
//    public void setNumberOfHouse(Integer numberOfHouse) {
//        this.numberOfHouse = numberOfHouse;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Address address = (Address) o;
//        return Objects.equals(city, address.city) &&
//                Objects.equals(street, address.street) &&
//                Objects.equals(numberOfHouse, address.numberOfHouse);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(city, street, numberOfHouse);
//    }
//
//    //    @Override
////    public boolean equals(Object obj) {
////        if (this == obj) {
////            return true;
////        }
////        if (hashCode() != obj.hashCode()) {
////            return false;
////        }
////        if (obj instanceof Address) {
////        Address address = (Address) obj;
////        return this.city.equals(address.city) && this.street.equals(address.street);
//////        return super.equals(obj);
////        } else {
////            return false;
////        }
////    }
////
////    @Override
////    public int hashCode() {
////        return city.hashCode()  + street.hashCode() + numberOfHouse;
////    }
//}
