package com.quizbuild.util;

import com.quizbuild.persistence.GenericDao;

/**
 * Creates a new instance of a Generic Dao
 * *Stolen from Paula Waite
 * @author keithlienert
 */
public class DaoFactory {

    /**
     * Empty constructor
     */
    private DaoFactory(){  }

    public static GenericDao createDao(Class type) {
        return new GenericDao(type);
    }
}
