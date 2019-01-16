package tech.cursor.com.geezdictionary.Entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word")
public class Word {
    @PrimaryKey(autoGenerate = true)
    @NonNull()
    private int id ;
    private String word;
    private String wordDefinition;
    private String wordSynonymous;
    private String wordAntonymous;

    Word()
    {

    }

    public int getId() {
        return id;
    }


    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getWordDefinition() {
        return wordDefinition;
    }

    public void setWordDefinition(String wordDefinition) {
        this.wordDefinition = wordDefinition;
    }

    public String getWordSynonymous() {
        return wordSynonymous;
    }

    public void setWordSynonymous(String wordSynonymous) {
        this.wordSynonymous = wordSynonymous;
    }

    public String getWordAntonymous() {
        return wordAntonymous;
    }

    public void setWordAntonymous(String wordAntonymous) {
        this.wordAntonymous = wordAntonymous;
    }
}
