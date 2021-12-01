package com.github.sdt.cypher.ui.fragments.calls;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.github.sdt.cypher.ui.fragments.photo.InterfaceInteractorPhoto;
import com.github.sdt.cypher.ui.fragments.photo.InterfaceViewPhoto;
import dagger.MembersInjector;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FragmentCallhistory_MembersInjector
    implements MembersInjector<FragmentCallhistory> {
  private final Provider<LinearLayoutManager> layoutMProvider;

  private final Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider;

  public FragmentCallhistory_MembersInjector(
      Provider<LinearLayoutManager> layoutMProvider,
      Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    this.layoutMProvider = layoutMProvider;
    this.interactorProvider = interactorProvider;
  }

  public static MembersInjector<FragmentCallhistory> create(
      Provider<LinearLayoutManager> layoutMProvider,
      Provider<InterfaceInteractorPhoto<InterfaceViewPhoto>> interactorProvider) {
    return new FragmentCallhistory_MembersInjector(layoutMProvider, interactorProvider);
  }

  @Override
  public void injectMembers(FragmentCallhistory instance) {
    injectLayoutM(instance, layoutMProvider.get());
    injectInteractor(instance, interactorProvider.get());
  }

  public static void injectLayoutM(FragmentCallhistory instance, LinearLayoutManager layoutM) {
    instance.layoutM = layoutM;
  }

  public static void injectInteractor(
      FragmentCallhistory instance, InterfaceInteractorPhoto<InterfaceViewPhoto> interactor) {
    instance.interactor = interactor;
  }
}
