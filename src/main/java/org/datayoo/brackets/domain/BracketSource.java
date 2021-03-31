package org.datayoo.brackets.domain;

import org.datayoo.domain.core.Resource;

import javax.persistence.*;
import javax.rmi.PortableRemoteObject;

@Entity
@Table(name = "BRK_SOURCE",
    indexes = { @Index(name = "IDX_BRK_SOURCE_ID", columnList = "RES_ID"),
    })
@Inheritance(strategy = InheritanceType.JOINED)
public class BracketSource extends Resource {

  @Column(name = "SRC_CAT", length = 32)
  @Enumerated(EnumType.STRING)
  protected BracketSourceCategory sourceCategory;

  @Column(name = "SRC_TYPE", length = 64)
  protected String sourceType;

  public BracketSourceCategory getSourceCategory() {
    return sourceCategory;
  }

  public void setSourceCategory(BracketSourceCategory sourceCategory) {
    this.sourceCategory = sourceCategory;
  }

  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }
}
