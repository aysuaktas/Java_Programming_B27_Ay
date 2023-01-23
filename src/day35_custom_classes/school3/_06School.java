package day35_custom_classes.school3;

public class _06School {

    String name;
    int totalNumOfStudents;
    double avgGpa;

   /* public _06School(String inputName, int inputStudents, double inputGpa) {
        name = inputName;
        totalNumOfStudents = inputStudents;
        avgGpa = inputGpa;
    }  // boyle de yapabiliyoruz ama farkli isim vermek kafa karistirabilir. this. olani tercih edersin
    */

    /* public _06School(String name, int totalNumOfStudents, double avgGpa){
        name = name;
        totalNumOfStudents = totalNumOfStudents;
        avgGpa = avgGpa;
    }  // boyle olursa instance variables ile local variables ismi ayni oldu. But java prioritizes local variables, by default onlari alir. _07Cydeo class'inda direkt boyleyken run edersek console'da _06School{name='null', totalNumOfStudents=0, avgGpa=0.0} cikar. Baslarina "this. " keyword koymak bunu cozer:
     */


    // // this keyword allows us to access the instance variables, not the local variable:
    public _06School(String name, int totalNumOfStudents, double avgGpa) {
        this.name = name;
        this.totalNumOfStudents = totalNumOfStudents;
        this.avgGpa = avgGpa;
    }


        @Override
        public String toString () {
            return "_06School{" +
                    "name='" + name + '\'' +
                    ", totalNumOfStudents=" + totalNumOfStudents +
                    ", avgGpa=" + avgGpa +
                    '}';
        }

        // _07 Cydeo class'inda bunu run edelim

    /* Tipki toString()de yaptigimize gibi, generating constructor shortcut’i da var. --> Class uzerinde sag click yap —> Generate —> constructor —>  sec ve OK’a tikla.

     // right click -> generate -> Constructor shortcut'i sayesinde sunu otomatik olarak yaziyor;

    public _06School(String name) {
        this.name = name;
    }

     */



}