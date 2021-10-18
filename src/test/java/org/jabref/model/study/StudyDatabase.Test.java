package org.jabref.model.study;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudyQueryTest {
    private StudyDatabase DatabaseEntries;

    public StudyDatabase getDatabaseEntries() {
        return new StudyDatabase();
    }

    @Test
    void testEntryAreTheSame() {
        DatabaseEntries = getDatabaseEntries();
        boolean result = DatabaseEntries.equals(DatabaseEntries);
        assertEquals(true, result);
    }

    @Test
    void testTwoEmptyStudy(){
        DatabaseEntries = new StudyDatabase();
        StudyDatabase queryEntries2 = new StudyDatabase();
        boolean result = DatabaseEntries.equals(queryEntries2);
        assertEquals(true, result);
    }


    @Test
    void testInvalidClass(){
        DatabaseEntries = getDatabaseEntries();
        StudyDatabase studyDatabase = new StudyDatabase("jeff bezos", true);
        boolean result = DatabaseEntries.equals(studyDatabase);
        assertEquals(false, result);
    }

    @Test
    void TestingTwoDifferentObjects(){
        DatabaseEntries = getDatabaseEntries();
        StudyDatabase DataEntries2 =getDatabaseEntries();
        boolean result = DatabaseEntries.equals(DatabaseEntries);
        assertEquals(true, result);
    }


}


