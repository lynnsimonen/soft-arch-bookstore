package edu.wctc.isp;

import edu.wctc.isp.Product;

import java.time.Duration;
import java.time.LocalDate;

public interface AlbumType extends Product {

    String getArtist();

    Duration getPlayingTime();
}