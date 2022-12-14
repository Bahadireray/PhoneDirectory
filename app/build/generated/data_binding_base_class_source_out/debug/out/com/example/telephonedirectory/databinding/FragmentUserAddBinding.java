// Generated by view binder compiler. Do not edit!
package com.example.telephonedirectory.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.telephonedirectory.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentUserAddBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText edtUserName;

  @NonNull
  public final EditText edtUserPhone;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final Button userSaveButton;

  private FragmentUserAddBinding(@NonNull ConstraintLayout rootView, @NonNull EditText edtUserName,
      @NonNull EditText edtUserPhone, @NonNull ImageView imageView,
      @NonNull LinearLayout linearLayout, @NonNull Button userSaveButton) {
    this.rootView = rootView;
    this.edtUserName = edtUserName;
    this.edtUserPhone = edtUserPhone;
    this.imageView = imageView;
    this.linearLayout = linearLayout;
    this.userSaveButton = userSaveButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentUserAddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentUserAddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_user_add, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentUserAddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtUserName;
      EditText edtUserName = ViewBindings.findChildViewById(rootView, id);
      if (edtUserName == null) {
        break missingId;
      }

      id = R.id.edtUserPhone;
      EditText edtUserPhone = ViewBindings.findChildViewById(rootView, id);
      if (edtUserPhone == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.userSaveButton;
      Button userSaveButton = ViewBindings.findChildViewById(rootView, id);
      if (userSaveButton == null) {
        break missingId;
      }

      return new FragmentUserAddBinding((ConstraintLayout) rootView, edtUserName, edtUserPhone,
          imageView, linearLayout, userSaveButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
