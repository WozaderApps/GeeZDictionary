package tech.cursor.com.geezdictionary.Entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "history")
class History {
    @PrimaryKey (autoGenerate = true)
    @NonNull
    private int id ;
    private String wordId;

    History()
    {

    }

    public int getId() {
        return id;
    }

    public String getWordId() {
        return wordId;
    }

    public void setWordId(String wordId) {
        this.wordId = wordId;
    }
}
