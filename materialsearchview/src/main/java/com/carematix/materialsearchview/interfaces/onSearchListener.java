package com.carematix.materialsearchview.interfaces;

/*
 * created by ankit chauhan (06/02/2019)
 * */
public interface onSearchListener {
    void onSearch(String query);
    void searchViewOpened();
    void searchViewClosed();
    void onCancelSearch();
    void onClearSearch();
    void onSearchAction(String query);
}
