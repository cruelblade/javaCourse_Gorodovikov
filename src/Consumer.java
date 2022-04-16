public class Consumer <T extends User<Integer>> {

    private  String id;
    private String address;
    public T user;

    public Consumer(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
