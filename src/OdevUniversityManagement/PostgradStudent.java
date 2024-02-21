package OdevUniversityManagement;

public class PostgradStudent implements Student{

    String ad;
    String stId;

    String grade;

    public PostgradStudent(String ad, String stId, String grade) {
        this.ad = ad;
        this.stId = stId;
        this.grade = grade;
    }

    @Override
    public void bilgiGoster() {
        System.out.printf("Yükseköğretim Öğrenci Bilgileri %s%s%s",ad,stId,grade);
    }

    @Override
    public void ucretOde() {

    }

    @Override
    public void devamliMi() {

    }
}
