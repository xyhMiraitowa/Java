package operation;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 徐宇航
 * Date: 2023-08-05
 * Time: 19:26
 */
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书！");
    }
}
