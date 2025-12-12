class Badge {
    public String print(Integer id, String name, String department) {

        String badgePrint;

        if (id == null && department == null) {
            badgePrint = name + " - OWNER";
        } else if (id == null) {
            badgePrint = name + " - " + department.toUpperCase();
        } else if (department == null) {
            badgePrint = "[" + id + "] - " + name + " - OWNER";
        } else {
            badgePrint = "[" + id + "] - " + name + " - " + department.toUpperCase();
        }
        return badgePrint;
    }
}
