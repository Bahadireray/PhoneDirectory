package com.example.telephonedirectory.data.roomdb;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.rxjava3.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.telephonedirectory.data.model.User;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter<User> __deletionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `User` (`userName`,`userNumber`,`userImage`,`id`) VALUES (?,?,?,nullif(?, 0))";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getUserName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getUserName());
        }
        if (value.getUserNumber() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUserNumber());
        }
        if (value.getUserImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindBlob(3, value.getUserImage());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `User` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
      }
    };
  }

  @Override
  public Completable insert(final User user) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUser.insert(user);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable delete(final User user) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfUser.handle(user);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Flowable<List<User>> getUserWithNameAndId() {
    final String _sql = "SELECT userName,id,userNumber,userImage FROM User";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createFlowable(__db, false, new String[]{"User"}, new Callable<List<User>>() {
      @Override
      public List<User> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "userName");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfUserNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "userNumber");
          final int _cursorIndexOfUserImage = CursorUtil.getColumnIndexOrThrow(_cursor, "userImage");
          final List<User> _result = new ArrayList<User>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final User _item;
            final String _tmpUserName;
            if (_cursor.isNull(_cursorIndexOfUserName)) {
              _tmpUserName = null;
            } else {
              _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
            }
            final String _tmpUserNumber;
            if (_cursor.isNull(_cursorIndexOfUserNumber)) {
              _tmpUserNumber = null;
            } else {
              _tmpUserNumber = _cursor.getString(_cursorIndexOfUserNumber);
            }
            final byte[] _tmpUserImage;
            if (_cursor.isNull(_cursorIndexOfUserImage)) {
              _tmpUserImage = null;
            } else {
              _tmpUserImage = _cursor.getBlob(_cursorIndexOfUserImage);
            }
            _item = new User(_tmpUserName,_tmpUserNumber,_tmpUserImage);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flowable<User> getUserById(final int id) {
    final String _sql = "SELECT * FROM User WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return RxRoom.createFlowable(__db, false, new String[]{"User"}, new Callable<User>() {
      @Override
      public User call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfUserName = CursorUtil.getColumnIndexOrThrow(_cursor, "userName");
          final int _cursorIndexOfUserNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "userNumber");
          final int _cursorIndexOfUserImage = CursorUtil.getColumnIndexOrThrow(_cursor, "userImage");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final User _result;
          if(_cursor.moveToFirst()) {
            final String _tmpUserName;
            if (_cursor.isNull(_cursorIndexOfUserName)) {
              _tmpUserName = null;
            } else {
              _tmpUserName = _cursor.getString(_cursorIndexOfUserName);
            }
            final String _tmpUserNumber;
            if (_cursor.isNull(_cursorIndexOfUserNumber)) {
              _tmpUserNumber = null;
            } else {
              _tmpUserNumber = _cursor.getString(_cursorIndexOfUserNumber);
            }
            final byte[] _tmpUserImage;
            if (_cursor.isNull(_cursorIndexOfUserImage)) {
              _tmpUserImage = null;
            } else {
              _tmpUserImage = _cursor.getBlob(_cursorIndexOfUserImage);
            }
            _result = new User(_tmpUserName,_tmpUserNumber,_tmpUserImage);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
