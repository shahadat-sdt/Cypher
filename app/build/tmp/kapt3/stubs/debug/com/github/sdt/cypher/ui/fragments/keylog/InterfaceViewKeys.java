package com.github.sdt.cypher.ui.fragments.keylog;

import java.lang.System;

/**
 * Created by luis rafael on 18/03/18.
 */
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/github/sdt/cypher/ui/fragments/keylog/InterfaceViewKeys;", "Lcom/github/sdt/cypher/ui/activities/base/InterfaceView;", "setRecyclerAdapter", "", "recyclerAdapter", "Lcom/github/sdt/cypher/ui/adapters/keysadapter/KeysRecyclerAdapter;", "setValueState", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "app_debug"})
public abstract interface InterfaceViewKeys extends com.github.sdt.cypher.ui.activities.base.InterfaceView {
    
    public abstract void setValueState(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot);
    
    public abstract void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.github.sdt.cypher.ui.adapters.keysadapter.KeysRecyclerAdapter recyclerAdapter);
}