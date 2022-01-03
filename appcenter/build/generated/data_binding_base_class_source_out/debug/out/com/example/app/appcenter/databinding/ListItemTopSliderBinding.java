// Generated by view binder compiler. Do not edit!
package com.example.app.appcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.app.appcenter.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class ListItemTopSliderBinding implements ViewBinding {
  @NonNull
  private final ImageView rootView;

  @NonNull
  public final ImageView ivAutoImageSlider;

  private ListItemTopSliderBinding(@NonNull ImageView rootView,
      @NonNull ImageView ivAutoImageSlider) {
    this.rootView = rootView;
    this.ivAutoImageSlider = ivAutoImageSlider;
  }

  @Override
  @NonNull
  public ImageView getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemTopSliderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemTopSliderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_top_slider, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemTopSliderBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ImageView ivAutoImageSlider = (ImageView) rootView;

    return new ListItemTopSliderBinding((ImageView) rootView, ivAutoImageSlider);
  }
}
