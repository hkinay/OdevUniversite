class Professor extends Faculty {
    protected String titre;
    public Professor(String isim, String id, String department, String titre) {
        super(isim, id, department);
        this.titre = titre;
    }
   public void teach() {
        System.out.println("Teaching...");
    }
}
