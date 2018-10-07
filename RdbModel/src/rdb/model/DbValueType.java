package rdb.model;

public enum DbValueType {
    Bool,
    Short,
    Integer,
    Float,
    Double,
    Decimal,
    DateTime, // Date/Time
    Char,     // Text with fixed length
    VarChar,  // Text with variable length
    Blob      // Binary large object
}
