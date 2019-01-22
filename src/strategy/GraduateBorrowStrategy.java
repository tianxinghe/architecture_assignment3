package strategy;

import model.Book;

public class GraduateBorrowStrategy implements BorrowStrategy {
    @Override
    public void borrow(Book book) {
        System.out.println("graduate borrow book");
    }
}
