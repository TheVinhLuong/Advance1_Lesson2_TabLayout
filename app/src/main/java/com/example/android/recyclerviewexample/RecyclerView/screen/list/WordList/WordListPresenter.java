package com.example.android.recyclerviewexample.RecyclerView.screen.list.WordList;

import android.util.Log;
import com.example.android.recyclerviewexample.RecyclerView.data.model.Word;

/**
 * Listens to user actions from the UI ({@link WordListFragment}), retrieves the data and updates
 * the UI as required.
 */
final class WordListPresenter implements WordListContract.Presenter {
    private static final String TAG = WordListPresenter.class.getSimpleName();
    private final WordListContract.ViewModel mViewModel;
    public WordListPresenter(WordListContract.ViewModel viewModel) {
        mViewModel = viewModel;
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void onItemWordListClicked(Word word) {
        Log.d(TAG, word.getWord() + " " +
        WordListPresenter.class.getName());
    }
}
