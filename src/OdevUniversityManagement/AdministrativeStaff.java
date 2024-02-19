package OdevUniversityManagement;

class AdministrativeStaff extends Personel {
    protected String section;
    public AdministrativeStaff(String isim, String id, String section) {
        super(isim, id);
        this.section = section;

    }


}
