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
        //ownerId validation tno be unique  ------Missing Validation
        this.ownerId = ownerId;
    }

    public void setName(String name) {
        if (name==null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be Empty");
        }
        this.name = name;
    }

    public void setNationalId(String nationalId) {
        //nationalId must be 16 digits  ------------Missing Validation
        this.nationalId = nationalId;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public void setAddress(String address) {
        if (address==null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address must not be Empty.");
        }
        this.address = address;
    }

    public void setDateOfBirth(String dateOfBirth) {
        //Age>=18  -------Missing Validation
        this.dateOfBirth = dateOfBirth;
    }
    
}
