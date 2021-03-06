/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.spark.sql.execution.datasources.parquet.test.avro;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroNonNullableArrays extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroNonNullableArrays\",\"namespace\":\"org.apache.spark.sql.execution.datasources.parquet.test.avro\",\"fields\":[{\"name\":\"strings_column\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}},{\"name\":\"maybe_ints_column\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.util.List<java.lang.String> strings_column;
  @Deprecated public java.util.List<java.lang.Integer> maybe_ints_column;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public AvroNonNullableArrays() {}

  /**
   * All-args constructor.
   */
  public AvroNonNullableArrays(java.util.List<java.lang.String> strings_column, java.util.List<java.lang.Integer> maybe_ints_column) {
    this.strings_column = strings_column;
    this.maybe_ints_column = maybe_ints_column;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return strings_column;
    case 1: return maybe_ints_column;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: strings_column = (java.util.List<java.lang.String>)value$; break;
    case 1: maybe_ints_column = (java.util.List<java.lang.Integer>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'strings_column' field.
   */
  public java.util.List<java.lang.String> getStringsColumn() {
    return strings_column;
  }

  /**
   * Sets the value of the 'strings_column' field.
   * @param value the value to set.
   */
  public void setStringsColumn(java.util.List<java.lang.String> value) {
    this.strings_column = value;
  }

  /**
   * Gets the value of the 'maybe_ints_column' field.
   */
  public java.util.List<java.lang.Integer> getMaybeIntsColumn() {
    return maybe_ints_column;
  }

  /**
   * Sets the value of the 'maybe_ints_column' field.
   * @param value the value to set.
   */
  public void setMaybeIntsColumn(java.util.List<java.lang.Integer> value) {
    this.maybe_ints_column = value;
  }

  /** Creates a new AvroNonNullableArrays RecordBuilder */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder newBuilder() {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder();
  }
  
  /** Creates a new AvroNonNullableArrays RecordBuilder by copying an existing Builder */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder newBuilder(org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder other) {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder(other);
  }
  
  /** Creates a new AvroNonNullableArrays RecordBuilder by copying an existing AvroNonNullableArrays instance */
  public static org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder newBuilder(org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays other) {
    return new org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder(other);
  }
  
  /**
   * RecordBuilder for AvroNonNullableArrays instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroNonNullableArrays>
    implements org.apache.avro.data.RecordBuilder<AvroNonNullableArrays> {

    private java.util.List<java.lang.String> strings_column;
    private java.util.List<java.lang.Integer> maybe_ints_column;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.strings_column)) {
        this.strings_column = data().deepCopy(fields()[0].schema(), other.strings_column);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.maybe_ints_column)) {
        this.maybe_ints_column = data().deepCopy(fields()[1].schema(), other.maybe_ints_column);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing AvroNonNullableArrays instance */
    private Builder(org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays other) {
            super(org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.SCHEMA$);
      if (isValidValue(fields()[0], other.strings_column)) {
        this.strings_column = data().deepCopy(fields()[0].schema(), other.strings_column);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.maybe_ints_column)) {
        this.maybe_ints_column = data().deepCopy(fields()[1].schema(), other.maybe_ints_column);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'strings_column' field */
    public java.util.List<java.lang.String> getStringsColumn() {
      return strings_column;
    }
    
    /** Sets the value of the 'strings_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder setStringsColumn(java.util.List<java.lang.String> value) {
      validate(fields()[0], value);
      this.strings_column = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'strings_column' field has been set */
    public boolean hasStringsColumn() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'strings_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder clearStringsColumn() {
      strings_column = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'maybe_ints_column' field */
    public java.util.List<java.lang.Integer> getMaybeIntsColumn() {
      return maybe_ints_column;
    }
    
    /** Sets the value of the 'maybe_ints_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder setMaybeIntsColumn(java.util.List<java.lang.Integer> value) {
      validate(fields()[1], value);
      this.maybe_ints_column = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'maybe_ints_column' field has been set */
    public boolean hasMaybeIntsColumn() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'maybe_ints_column' field */
    public org.apache.spark.sql.execution.datasources.parquet.test.avro.AvroNonNullableArrays.Builder clearMaybeIntsColumn() {
      maybe_ints_column = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public AvroNonNullableArrays build() {
      try {
        AvroNonNullableArrays record = new AvroNonNullableArrays();
        record.strings_column = fieldSetFlags()[0] ? this.strings_column : (java.util.List<java.lang.String>) defaultValue(fields()[0]);
        record.maybe_ints_column = fieldSetFlags()[1] ? this.maybe_ints_column : (java.util.List<java.lang.Integer>) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
