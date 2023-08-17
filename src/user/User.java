package user;

import book.BookList;
import operation.IOperation;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 徐宇航
 * Date: 2023-08-05
 * Time: 19:28
 */
public abstract class User {
    protected String name;
    protected IOPeration[] ioPerations;

    public User(String name) {
        this.name = name;
    }
    public abstract int menu();
    public void doOperation(int choice, BookList bookList) {

        ioPerations[choice].work(bookList);
    }
}
