package day47_collections;

public class _07Person {

        public String name;
        public int age;  // bunlari day50'deki _02OtherFunctionalInterface class'inda kullanabilmek icin public yaptik. Normalde String name, ve int age olarak yapmistik ama ileriki derste yani baska package'da bunu kullanmak istedigimiz icin default access modifier kullanamayiz, o nedenle bunlari public yaptik geri donup. Gerci sonra orada yaptigimiz bu kismi kullandigimizi sildik ama buradan degistirmedim ben.

        public _07Person(String name, int age){
            this.name = name;
            this.age = age;
        }


    @Override
    public String toString() {
        return "_07Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
