package operation;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 徐宇航
 * Date: 2023-08-05
 * Time: 19:23
 */
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
    }
}
