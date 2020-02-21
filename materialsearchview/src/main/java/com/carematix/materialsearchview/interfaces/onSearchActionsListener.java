package com.carematix.materialsearchview.interfaces;

/*
* created by ankit chauhan (06/02/2019)
* */

public interface onSearchActionsListener {
    void onItemClicked(String item);
    void showProgress(boolean show);
    void listEmpty();
    void onScroll();
    void error(String localizedMessage);
}
