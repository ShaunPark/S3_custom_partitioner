/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.shaunpark.kafka.connect;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testDatabaseName() {
        assertEquals( "Regular multiplication should work", PartitionUtil.removeDBName("database1-table1"), "database1-table1");
        assertEquals( "Regular multiplication should work", PartitionUtil.removeDBName("database1.table1"), "table1");
        assertEquals( "Regular multiplication should work", PartitionUtil.removeDBName("database1."), "database1.");
        assertEquals( "Regular multiplication should work", PartitionUtil.removeDBName(".database1"), ".database1");

    }
}
