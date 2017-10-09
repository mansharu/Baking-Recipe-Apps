package com.ansorkazama.udacity_baking_recipe_apps.presenter;

import android.view.View;
import com.ansorkazama.udacity_baking_recipe_apps.model.Step;
import java.util.ArrayList;

public class RecipeDetailPresenter implements RecipeDetailPresenterViewContract.Presenter {

    private final RecipeDetailPresenterViewContract.View mView;

    public interface Callbacks {
        void stepSelected(ArrayList<Step> stepList, int currentStep, String recipeName);
    }

    public RecipeDetailPresenter(RecipeDetailPresenterViewContract.View view) {
        this.mView = view;
    }

    @Override
    public void stepClicked(ArrayList<Step> stepList, int currentStep, String recipeName, View view) {
        ((Callbacks) view.getContext()).stepSelected(stepList, currentStep, recipeName);
    }
}

