package com.camp.bit.todolist.db;

import android.provider.BaseColumns;

/**
 * Created on 2019/1/22.
 *
 * @author xuyingyi@bytedance.com (Yingyi Xu)
 */
public final class TodoContract {

    // TODO 定义表结构和 SQL 语句常量
    public static class TodoEntry implements BaseColumns{
        public static final String TABLE_NAME="tatle";
        public static final String COLUMNS_DATE="data";
        public static final String COLUMNS_STATE="state";
        public static final String COLUMNS_CONTENT="content";
    }
    public static final String SQL_CREATE_ENTRYS =
            "CREATE TABLE "+TodoEntry.TABLE_NAME + "(" + TodoEntry._ID
            +" INTEGER PRIMARY KEY," +TodoEntry.COLUMNS_CONTENT+" TEXT," +TodoEntry.COLUMNS_DATE+" LONG,"
            +TodoEntry.COLUMNS_STATE+" INTEGER)";
    public static final String SQL_DELETE_ENTRYS=
            "DROP TABLE IF EXITS "+ TodoEntry.TABLE_NAME;

    private TodoContract() {}

}

