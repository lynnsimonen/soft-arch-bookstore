package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface BookType extends Product {

    String getAuthor();

    String getISBN();

    int getPages();
}
