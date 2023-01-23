package day37_static._04_car;

public class _08Driver {

    String name;
    long licenceNumber;
    char licenseType;

    public _08Driver(String name, long licenceNumber, char licenseType) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.licenseType = licenseType;
    }

    @Override
    public String toString() {
        return "_08Driver{" +
                "name='" + name + '\'' +
                ", licenceNumber=" + licenceNumber +
                ", licenseType=" + licenseType +
                '}';
    }
}
