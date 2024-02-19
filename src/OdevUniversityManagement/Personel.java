package OdevUniversityManagement;

abstract class Personel {
    protected String isim;
    protected String id;

    public Personel(String isim, String id) {
        this.isim = isim;
        this.id = id;
    }

    int maasAlma(int salary){
        int toplam = salary * 2;
        return toplam;
    }
}
