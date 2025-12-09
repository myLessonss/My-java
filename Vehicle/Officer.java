public class Officer {
    private String officerId,name,department,badgeNumber,rank,joinDate;
    //Constructrs

    public Officer(String officerId, String name, String department, String badgeNumber,
         String rank, String joinDate) {
        this.officerId = officerId;
        this.name = name;
        this.department = department;
        this.badgeNumber = badgeNumber;
        this.rank = rank;
        this.joinDate = joinDate;
    }
    //Getters

    public String getOfficerId() {
        return officerId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public String getRank() {
        return rank;
    }

    public String getJoinDate() {
        return joinDate;
    }
    //Setters

    public void setOfficerId(String officerId) {
        this.officerId = officerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
    
    
}
