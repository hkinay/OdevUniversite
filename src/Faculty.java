class Faculty extends Personel {
    protected String department;

    public Faculty (String isim, String id, String department){
        super(isim,id);
        this.department = department;
    }

    @Override
    int maasAlma(int salary) {
        int toplam = super.maasAlma(salary);
        toplam +=toplam;
        return toplam;

    }
}
