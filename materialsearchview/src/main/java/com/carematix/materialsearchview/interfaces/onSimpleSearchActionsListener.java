package com.carematix.materialsearchview.interfaces;

/*
 * created by ankit chauhan (06/02/2019)
 * */
public interface onSimpleSearchActionsListener {
    void onItemClicked(String item);
    void onScroll();
    void error(String localizedMessage);
}
