class Client {
    private static int countId = 0 ;
    private int id;
    private String fullName;

    Client(String fullName) {
        this.id =++countId;
        this.fullName = fullName;
    }

    int getId() {
        return id;
    }


    String getFullName() {
        return fullName;
    }

}
