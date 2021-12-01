package com.github.midros.istheapp.ui.fragments.screenshot;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.midros.istheapp.ui.fragments.photo.InterfaceInteractorPhoto;
import com.github.midros.istheapp.ui.fragments.photo.InterfaceViewPhoto;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FragmentScreenshot_MembersInjector
    implements MembersInjector<FragmentScreenshot> {
  private final Provider<LinearLayoutManager> layoutMProvider;

  private final Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider;

  public FragmentScreenshot_MembersInjector(
      Provider<LinearLayoutManager> layoutMProvider,
      Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    this.layoutMProvider = layoutMProvider;
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<FragmentScreenshot> create(
      Provider<LinearLayoutManager> layoutMProvider,
      Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    return new FragmentScreenshot_MembersInjector(layoutMProvider, interactorProvider);
  }

  @Override
  public void injectMembers(FragmentScreenshot instance) {
    injectLayoutM(instance, layoutMProvider.get());
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectLayoutM(FragmentScreenshot instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }

  public static void injectInteractor(
      FragmentScreenshot instance, InterfaceInteractorPhoto<InterfaceViewPhoto> interactor) {
    instance.interactor = interactor;
  }
}
