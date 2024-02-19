package OdevUniversityManagement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Driver {
    public static void main(String[] args) {

        AdministrativeStaff b = new AdministrativeStaff("Ahmet","01","Eğitim");

        Personel c = new Rector("Ali", "23", "Rektörlük", "University");
        Faculty d = new Faculty("Hüseyin Kınay","12","Bilgisayar Programcılığı");

        System.out.println(b.section);
        System.out.println(c.isim);
        System.out.println(d.department);


    }
}