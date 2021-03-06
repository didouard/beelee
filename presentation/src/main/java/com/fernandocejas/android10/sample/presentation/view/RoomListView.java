/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package com.fernandocejas.android10.sample.presentation.view;

import com.fernandocejas.android10.sample.presentation.db.Room;

import java.util.Collection;

public interface RoomListView extends LoadDataView {
  void renderRoomList(Collection<Room> roomListModelCollection);
  void viewRoom(Room roomListModel);
}
