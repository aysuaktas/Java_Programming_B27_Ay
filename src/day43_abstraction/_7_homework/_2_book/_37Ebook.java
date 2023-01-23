package day43_abstraction._7_homework._2_book;

public abstract class _37Ebook extends _35Book implements _36Downloadable {

    public int size;

    public abstract void open();


    @Override
    public void read() {
        System.out.println("Reading e-book");
    }

    @Override
    public void download() {
        System.out.println("Downloading e-book");
    }
}


