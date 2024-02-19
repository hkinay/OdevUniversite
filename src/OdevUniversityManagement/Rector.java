package OdevUniversityManagement;

class Rector extends AdministrativeStaff {
    protected String university;

    public Rector(String isim, String id, String section, String university) {
        super(isim, id, section);
        this.university = university;
    }
}
