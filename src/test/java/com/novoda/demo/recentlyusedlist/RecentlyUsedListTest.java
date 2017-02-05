package com.novoda.demo.recentlyusedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecentlyUsedListTest {

    private RecentlyUsedList recentlyUsedList;

    @Before
    public void setUp() throws Exception {
        recentlyUsedList = new RecentlyUsedList();
    }

    @Test
    public void isEmptyInitially() {
        assertEquals("[]", recentlyUsedList.toString());
    }

    @Test
    public void canAddSingleItem() {
        recentlyUsedList.add("CCleaner");

        assertEquals("[CCleaner]", recentlyUsedList.toString());
    }


    @Test
    public void canAddMultipleItems() {
        recentlyUsedList.add("CCleaner");
        recentlyUsedList.add("All4");
        recentlyUsedList.add("Oddschecker");

        assertEquals("[Oddschecker, All4, CCleaner]", recentlyUsedList.toString());
    }

    @Test
    public void canAccessItemByIndex() {
        recentlyUsedList.add("CCleaner");
        recentlyUsedList.add("All4");
        recentlyUsedList.add("Oddschecker");
        recentlyUsedList.add("Project-D");
        recentlyUsedList.add("10ft-tv");

        assertEquals("All4", recentlyUsedList.get(3));
    }

    @Test
    public void duplicatesAreMovedToFront() {
        recentlyUsedList.add("CCleaner");
        recentlyUsedList.add("All4");
        recentlyUsedList.add("Oddschecker");
        recentlyUsedList.add("Project-D");
        recentlyUsedList.add("All4");

        assertEquals("[All4, Project-D, Oddschecker, CCleaner]", recentlyUsedList.toString());
    }

    /**
     * EXTRAS
     */
    public void doesntAllowNullInsertions() {}
    public void doesntAllowInvalidAccessIndexes() {}
    public void canSetCapacity() {}
    public void canRemoveItem() {}

}