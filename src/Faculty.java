class Faculty extends Personel {
    protected String department;

    public Faculty (String isim, String id, String department){
        super(isim,id);
        this.department = department;
    }

}
