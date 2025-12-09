public class Owner {
    private String ownerId,name,nationalId,phones,address,dateOfBirth;
    //Constructors

    public Owner(String ownerId, String name, String nationalId, String phones, 
        String address, String dateOfBirth) {
        this.ownerId = ownerId;
        this.name = name;
        this.nationalId = nationalId;
        this.phones = phones;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }
    //Getters

    public String getOwnerId() {
        return ownerId;
    }

    public String getName() {
        return name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getPhones() {
        return phones;
    }

    public String getAddress() {
        return address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    //Setters
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
}
