package org.datayoo.brackets.dto;

import java.util.List;

public class AvroSchema {

  private String namespace;
  private String name;
  private String type;
  private String doc;
  private String aliases;
  private List<Field> fields;

  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDoc() {
    return doc;
  }

  public void setDoc(String doc) {
    this.doc = doc;
  }

  public String getAliases() {
    return aliases;
  }

  public void setAliases(String aliases) {
    this.aliases = aliases;
  }

  public List<Field> getFields() {
    return fields;
  }

  public void setFields(List<Field> fields) {
    this.fields = fields;
  }

  public Field newField() {
    return new Field();
  }

  public static class Field {
    private String name;
    private String type;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getType() {
      return type;
    }

    public void setType(String type) {
      this.type = type;
    }
  }

}

