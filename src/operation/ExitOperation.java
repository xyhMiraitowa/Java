package operation;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 徐宇航
 * Date: 2023-08-05
 * Time: 19:25
 */
public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
    }
}
