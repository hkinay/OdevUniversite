package OdevUniversityManagement;

public class UndergradStudent implements Student{

    String isim;
    String stID;

    String grade;

    String birthdate;



    public UndergradStudent(String isim, String stID, String grade, String birthdate) {
        this.isim = isim;
        this.stID = stID;
        this.grade = grade;
        this.birthdate = birthdate;
    }

    @Override
    public void bilgiGoster() {
        System.out.printf("Öğrenci bilgileri %s,%s,%s,%s", isim,stID,grade,birthdate);

    }

    @Override
    public void ucretOde() {

    }

    @Override
    public void devamliMi() {

    }
}
