// Generated by view binder compiler. Do not edit!
package com.example.app.appcenter.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.app.appcenter.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final RecyclerView homeRvApps;

  @NonNull
  public final SliderCardViewBinding sliderCardView;

  private FragmentHomeBinding(@NonNull NestedScrollView rootView, @NonNull RecyclerView homeRvApps,
      @NonNull SliderCardViewBinding sliderCardView) {
    this.rootView = rootView;
    this.homeRvApps = homeRvApps;
    this.sliderCardView = sliderCardView;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.home_rv_apps;
      RecyclerView homeRvApps = ViewBindings.findChildViewById(rootView, id);
      if (homeRvApps == null) {
        break missingId;
      }

      id = R.id.slider_card_view;
      View sliderCardView = ViewBindings.findChildViewById(rootView, id);
      if (sliderCardView == null) {
        break missingId;
      }
      SliderCardViewBinding binding_sliderCardView = SliderCardViewBinding.bind(sliderCardView);

      return new FragmentHomeBinding((NestedScrollView) rootView, homeRvApps,
          binding_sliderCardView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
