package day49_functional_interface;

public interface _09GeneralInterface <T> {

           // Generics ile ilgili ilk ornek bu.
           // Generics (( generic type )) -> you basically defining a type that can be any object type, and you use this type in your code. Now, _07NumberInterface interface'indeki test method'u only work with int types, so it was more restrictive. Cunku parameter'i oyle belirledik. Bu ornekteki daha flexible olacak. --> Generics icin <> isareti gerekiyor, genelde de <T> kullaniliyor convention olarak. Orada hangi type'i belirtirsem o data type'i kullanabilecegim.

            // For example --> public interface List<E> extends Collection<E> {   -> Yani List'e baktigimizda o da Generic type. O yuzden sen hangisini belirtirsen automatically o data type'i kullanabiliyorsun ArrayList'te falan da. Cunku o da generic type (generics) idi. ---> (( generic type = all Object type. Yani primitive datatypes kullanmak istiyorsak onu Wrapper class olarak kullanabiliyoruz))

    void test(T t);

}
