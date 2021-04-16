package org.datayoo.brackets.domain;

import org.datayoo.domain.core.Resource;

import javax.persistence.*;
import java.io.Serializable;

/**
 * BracketSourceTemplate定义了每种BracketSource的GroupParameter部分
 */
@Entity
@Table(name = "BRK_SOURCE_TEMPLATE",
    indexes = { @Index(name = "IDX_BRK_SOURCE_ID", columnList = "RES_ID"),
    })
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BracketSourceTemplate extends Resource {

  //@Id
  @Column(name = "SRC_TYPE", length = 64)
  protected String sourceType;

  @Column(name = "SRC_TEMPLATE", length = 4000)
  protected String sourceTemplate;

  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  public String getSourceTemplate() {
    return sourceTemplate;
  }

  public void setSourceTemplate(String sourceTemplate) {
    this.sourceTemplate = sourceTemplate;
  }
}
